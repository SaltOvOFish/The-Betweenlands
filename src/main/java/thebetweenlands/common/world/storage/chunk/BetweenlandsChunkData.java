package thebetweenlands.common.world.storage.chunk;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.ChunkWatchEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import thebetweenlands.common.TheBetweenlands;
import thebetweenlands.common.lib.ModInfo;
import thebetweenlands.common.network.BLMessage;
import thebetweenlands.common.world.storage.chunk.BetweenlandsChunkData.ChunkSyncHandler.MessageSyncChunkData;
import thebetweenlands.common.world.storage.chunk.storage.ChunkStorage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BetweenlandsChunkData extends ChunkDataBase {
    public static final ChunkSyncHandler CHUNK_SYNC_HANDLER = new ChunkSyncHandler();
    private List<ChunkStorage> storage = new ArrayList<ChunkStorage>();

    public BetweenlandsChunkData() {
        super(ModInfo.ID + ":chunkData");
    }

    public static BetweenlandsChunkData forChunk(World world, Chunk chunk) {
        return ChunkDataBase.forChunk(world, chunk, BetweenlandsChunkData.class);
    }

    @Override
    protected void init() {
        //System.out.println("INIT");
    }

    @Override
    protected void setDefaults() {
        //System.out.println("DEFAULTS");
    }

    @Override
    public void markDirty() {
        super.markDirty();
    }

    @Override
    protected void postInit() {
        this.save();
        this.syncData();
    }

    public void syncData() {
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
            ChunkPos pos = new ChunkPos(this.getChunk().xPosition, this.getChunk().zPosition);
            List<EntityPlayerMP> watchers = CHUNK_SYNC_HANDLER.chunkWatchers.get(pos);
            if (watchers != null && !watchers.isEmpty()) {
                for (EntityPlayerMP watcher : watchers) {
                    TheBetweenlands.networkWrapper.sendTo(new MessageSyncChunkData(this), watcher);
                }
            }
        }
    }


    ////////// Data //////////

    @Override
    protected void load() {
        try {
            NBTTagCompound nbt = this.readData();
            if (nbt.hasKey("storage")) {
                this.storage.clear();
                NBTTagList storageList = nbt.getTagList("storage", Constants.NBT.TAG_COMPOUND);
                for (int i = 0; i < storageList.tagCount(); i++) {
                    NBTTagCompound storageCompound = storageList.getCompoundTagAt(i);
                    String type = storageCompound.getString("type");
                    Class<? extends ChunkStorage> storageClass = ChunkStorage.getStorageClass(type);
                    if (storageClass == null)
                        throw new Exception("Chunk storage type not mapped!");
                    Constructor<? extends ChunkStorage> ctor = storageClass.getConstructor(Chunk.class, BetweenlandsChunkData.class);
                    ChunkStorage storage = ctor.newInstance(this.getChunk(), this);
                    storage.readFromNBT(storageCompound.getCompoundTag("storage"));
                    this.storage.add(storage);
                }
            }
        } catch (Exception ex) {
            this.markDirty();
            ex.printStackTrace();
        }
    }

    @Override
    protected void save() {
        try {
            NBTTagCompound nbt = new NBTTagCompound();
            if (!this.storage.isEmpty()) {
                NBTTagList storageList = new NBTTagList();
                for (ChunkStorage storage : this.storage) {
                    NBTTagCompound storageCompound = new NBTTagCompound();
                    storage.writeToNBT(storageCompound);
                    String type = ChunkStorage.getStorageType(storage.getClass());
                    if (type == null)
                        throw new Exception("Chunk storage type not mapped!");
                    NBTTagCompound fullNBT = new NBTTagCompound();
                    fullNBT.setString("type", type);
                    fullNBT.setTag("storage", storageCompound);
                    storageList.appendTag(fullNBT);
                }
                nbt.setTag("storage", storageList);
            }
            this.writeData(nbt);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        this.syncData();
    }

    public List<ChunkStorage> getStorage() {
        return this.storage;
    }

    public static class ChunkSyncHandler {
        private final Map<ChunkPos, List<EntityPlayerMP>> chunkWatchers = new HashMap<ChunkPos, List<EntityPlayerMP>>();

        /**
         * Registers the packet that keeps the properties in sync
         *
         * @param networkWrapper
         */
        public void registerPacket(SimpleNetworkWrapper networkWrapper) {
            TheBetweenlands.registerMessage(MessageSyncChunkData.class, Side.CLIENT);
        }

        private boolean addWatcher(ChunkPos chunk, EntityPlayerMP player) {
            List<EntityPlayerMP> watchers = this.chunkWatchers.get(chunk);
            if (watchers == null)
                this.chunkWatchers.put(chunk, watchers = new ArrayList<EntityPlayerMP>());
            if (!watchers.contains(player)) {
                watchers.add(player);
                return true;
            }
            return false;
        }

        private void removeWatcher(ChunkPos chunk, EntityPlayerMP player) {
            List<EntityPlayerMP> watchers = this.chunkWatchers.get(chunk);
            if (watchers != null)
                watchers.remove(player);
        }

        @SubscribeEvent
        public void onWatch(ChunkWatchEvent event) {
            if (event instanceof ChunkWatchEvent.Watch) {
                if (this.addWatcher(event.getChunk(), event.getPlayer())) {
                    synchronized (CHUNK_DATA_HANDLER) {
                        Chunk chunk = event.getPlayer().worldObj.getChunkFromChunkCoords(event.getChunk().chunkXPos, event.getChunk().chunkZPos);
                        BetweenlandsChunkData data = BetweenlandsChunkData.forChunk(event.getPlayer().worldObj, chunk);
                        TheBetweenlands.networkWrapper.sendTo(new MessageSyncChunkData(data), event.getPlayer());
                    }
                }
            } else if (event instanceof ChunkWatchEvent.UnWatch) {
                this.removeWatcher(event.getChunk(), event.getPlayer());
            }
        }

        @SubscribeEvent
        public void onChunkUnload(ChunkEvent.Unload event) {
            this.chunkWatchers.remove(event.getChunk());
        }

        public static class MessageSyncChunkData extends BLMessage {
            private int chunkX, chunkZ;
            private String name;
            private NBTTagCompound nbt;

            public MessageSyncChunkData() {
            }

            public MessageSyncChunkData(BetweenlandsChunkData data) {
                this.chunkX = data.getChunk().xPosition;
                this.chunkZ = data.getChunk().zPosition;
                this.name = data.name;
                NBTTagCompound nbtData = data.readData();
                this.nbt = nbtData != null ? nbtData : new NBTTagCompound();
            }

            @Override
            public void deserialize(PacketBuffer buf) {
                this.chunkX = buf.readInt();
                this.chunkZ = buf.readInt();
                PacketBuffer packetBuffer = new PacketBuffer(buf);
                try {
                    this.name = packetBuffer.readStringFromBuffer(128);
                    this.nbt = packetBuffer.readNBTTagCompoundFromBuffer();
                } catch (IOException e) {
                }
            }

            @Override
            public void serialize(PacketBuffer buf) {
                buf.writeInt(this.chunkX);
                buf.writeInt(this.chunkZ);
                PacketBuffer packetBuffer = new PacketBuffer(buf);
                packetBuffer.writeString(this.name);
                packetBuffer.writeNBTTagCompoundToBuffer(this.nbt);
            }

            @Override
            public IMessage process(MessageContext ctx) {
                synchronized (CHUNK_DATA_HANDLER) {
                    World world = FMLCommonHandler.instance().getMinecraftServerInstance().getEntityWorld();
                    ChunkPos chunkPos = new ChunkPos(chunkX, chunkZ);
                    NBTTagCompound currentNBT = ChunkDataBase.getNBTCache(chunkPos, world);
                    if (currentNBT == null)
                        currentNBT = new NBTTagCompound();
                    currentNBT.setTag(name, nbt);
                    ChunkDataBase.addNBTCache(chunkPos, world, currentNBT);
                    ChunkDataBase data = ChunkDataBase.getDataCache(chunkPos, world, BetweenlandsChunkData.class);
                    if (data != null) {
                        data.writeData(nbt);
                        data.load();
                    }
                }
                return null;
            }
        }
    }
}

package thebetweenlands.common.registries;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import thebetweenlands.common.TheBetweenlands;
import thebetweenlands.common.network.message.BLMessage;
import thebetweenlands.common.network.message.clientbound.MessageDruidAltarProgress;
import thebetweenlands.common.network.message.clientbound.MessageDruidTeleportParticles;
import thebetweenlands.common.network.message.clientbound.MessageGemProc;
import thebetweenlands.common.network.message.clientbound.MessageRemoveSharedStorage;
import thebetweenlands.common.network.message.clientbound.MessageSyncChunkData;
import thebetweenlands.common.network.message.clientbound.MessageSyncEntityCapabilities;
import thebetweenlands.common.network.message.clientbound.MessageSyncEnvironmentEvent;
import thebetweenlands.common.network.message.clientbound.MessageSyncSharedStorage;
import thebetweenlands.common.network.message.clientbound.MessageSyncStaticAspects;
import thebetweenlands.common.network.message.clientbound.MessageWeedwoodBushRustle;
import thebetweenlands.common.network.message.clientbound.MessageWightVolatileParticles;

public class MessageRegistry {
	private MessageRegistry() { }
	
    private static byte nextMessageId = 0;

    public static void preInit() {
        registerMessage(MessageDruidAltarProgress.class, Side.CLIENT);
        registerMessage(MessageSyncChunkData.class, Side.CLIENT);
        registerMessage(MessageSyncEnvironmentEvent.class, Side.CLIENT);
		registerMessage(MessageWeedwoodBushRustle.class, Side.CLIENT);
		registerMessage(MessageSyncEntityCapabilities.class, Side.CLIENT);
		registerMessage(MessageSyncStaticAspects.class, Side.CLIENT);
		registerMessage(MessageSyncSharedStorage.class, Side.CLIENT);
		registerMessage(MessageRemoveSharedStorage.class, Side.CLIENT);
		registerMessage(MessageDruidTeleportParticles.class, Side.CLIENT);
		registerMessage(MessageWightVolatileParticles.class, Side.CLIENT);
		registerMessage(MessageGemProc.class, Side.CLIENT);
    }

	private static void registerMessage(Class<? extends BLMessage> messageType, Side toSide) {
		TheBetweenlands.networkWrapper.registerMessage(getHandler(messageType, toSide), messageType, MessageRegistry.nextMessageId++, toSide);
	}

	private static IMessageHandler<BLMessage, IMessage> getHandler(Class<? extends BLMessage> messageType, Side toSide) {
		if (toSide == Side.CLIENT) {
			return new ClientboundHandler();
		}
		return new ServerboundHandler();
	}

	private static class ServerboundHandler implements IMessageHandler<BLMessage, IMessage> {
		@Override
		public IMessage onMessage(BLMessage message, MessageContext ctx) {
			MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
			try {
				server.callFromMainThread(() -> message.process(ctx));
			} catch (Exception e) {
				e.printStackTrace(); // TODO: proper logging
			}
			return null;
		}
	}

	private static class ClientboundHandler implements IMessageHandler<BLMessage, IMessage> {
		@Override
		public IMessage onMessage(BLMessage message, MessageContext ctx) {
			Minecraft mc = FMLClientHandler.instance().getClient();
			try {
				mc.addScheduledTask(() -> message.process(ctx));
			} catch (Exception e) {
				e.printStackTrace(); // TODO: proper logging
			}
			return null;
		}
	}
}

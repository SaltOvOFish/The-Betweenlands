package thebetweenlands.client.event.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogColors;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;
import net.minecraftforge.client.event.EntityViewRenderEvent.RenderFogEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import thebetweenlands.common.TheBetweenlands;
import thebetweenlands.common.world.WorldProviderBetweenlands;
import thebetweenlands.common.world.event.EnvironmentEventRegistry;
import thebetweenlands.common.world.storage.chunk.storage.location.LocationAmbience;
import thebetweenlands.common.world.storage.chunk.storage.location.LocationStorage;
import thebetweenlands.util.config.ConfigHandler;

public class FogHandler {
	public static final FogHandler INSTANCE = new FogHandler();
	////// Biome specific fog + smooth transition //////
	private float currentFogStart = -1.0F;
	private float currentFogEnd = -1.0F;
	private float lastFogStart = -1.0F;
	private float lastFogEnd = -1.0F;
	private float currentFogColorMultiplier = -1.0F;
	private float lastFogColorMultiplier = -1.0F;
	private float farPlaneDistance = 0.0F;
	private int fogMode;

	public float getCurrentFogStart() {
		return this.currentFogStart;
	}

	public float getCurrentFogEnd() {
		return this.currentFogEnd;
	}

	public int getCurrentFogMode() {
		return this.fogMode;
	}

	public boolean hasDenseFog() {
		World world = Minecraft.getMinecraft().theWorld;
		if(world.provider instanceof WorldProviderBetweenlands && Minecraft.getMinecraft().thePlayer.posY > WorldProviderBetweenlands.CAVE_START) {
			WorldProviderBetweenlands provider = (WorldProviderBetweenlands)world.provider;
			EnvironmentEventRegistry eeRegistry = provider.getWorldData().getEnvironmentEventRegistry();
			boolean denseFog = false;
			if((!ConfigHandler.debug && eeRegistry.DENSE_FOG.isActive())/* ||
					(DebugHandlerClient.INSTANCE.denseFog && ConfigHandler.DEBUG && !eeRegistry.DENSE_FOG.isActive()) ||
					(!DebugHandlerClient.INSTANCE.denseFog && ConfigHandler.DEBUG && eeRegistry.DENSE_FOG.isActive())*/) {
				denseFog = true;
			}
			return denseFog;
		}
		return false;
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onFogRenderEvent(RenderFogEvent event) {
		World world = TheBetweenlands.proxy.getClientWorld();
		if(world == null || world.provider instanceof WorldProviderBetweenlands == false) {
			return;
		} else if(world.isRemote) {
			this.farPlaneDistance = event.getFarPlaneDistance();
			float partialTicks = (float) event.getRenderPartialTicks();
			float fogStart = this.currentFogStart + (this.currentFogStart - this.lastFogStart) * partialTicks;
			float fogEnd = this.currentFogEnd + (this.currentFogEnd - this.lastFogEnd) * partialTicks;
			this.fogMode = GL11.GL_LINEAR;
			GL11.glFogi(GL11.GL_FOG_MODE, GL11.GL_LINEAR);
			GL11.glFogf(GL11.GL_FOG_START, fogStart);
			GL11.glFogf(GL11.GL_FOG_END, fogEnd);
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent event) {
		World world = TheBetweenlands.proxy.getClientWorld();
		EntityPlayer player = TheBetweenlands.proxy.getClientPlayer();

		if(world == null || player == null || this.farPlaneDistance == 0.0F || player.dimension != ConfigHandler.dimensionId) return;

		Biome biome = world.getBiomeGenForCoords(player.getPosition());

		float fogStart = this.farPlaneDistance * 0.25F;
		float fogEnd = this.farPlaneDistance;

		//TODO: Biome fog
		/*if(biome instanceof BiomeGenBaseBetweenlands) {
			BiomeGenBaseBetweenlands bgbb = (BiomeGenBaseBetweenlands) biome;
			fogStart = bgbb.getFogStart(this.farPlaneDistance);
			fogEnd = bgbb.getFogEnd(this.farPlaneDistance);
		}*/

		//TODO: Elixirs
		float uncloudedStrength = 0.0F;
		/*if(ElixirEffectRegistry.EFFECT_UNCLOUDED.isActive(player)) {
			uncloudedStrength += Math.min((ElixirEffectRegistry.EFFECT_UNCLOUDED.getStrength(player) + 1) / 3.0F, 1.0F);
		}

		if(ElixirEffectRegistry.EFFECT_FOGGEDMIND.isActive(player)) {
			float additionalFogStrength = (ElixirEffectRegistry.EFFECT_FOGGEDMIND.getStrength(player) + 1) * 0.85F;
			fogStart /= additionalFogStrength * 2.0F;
			fogEnd /= additionalFogStrength;
		}*/

		//Dense fog
		if(this.hasDenseFog()) {
			fogStart /= 5.0f / (1.0F + uncloudedStrength * 4.0F);
			fogEnd /= 3.0f / (1.0F + uncloudedStrength * 2.0F);
		}

		//Underground fog
		float multiplier = 1.0F;
		if(player.posY < WorldProviderBetweenlands.CAVE_START) {
			multiplier = ((float)(WorldProviderBetweenlands.CAVE_START - player.posY) / WorldProviderBetweenlands.CAVE_START);
			multiplier = 1.0F - multiplier;
			multiplier *= Math.pow(multiplier, 8.5);
			multiplier = multiplier * 0.95F + 0.05F;
			if(player.posY <= WorldProviderBetweenlands.PITSTONE_HEIGHT) {
				float targettedMultiplier = 0.3F;
				if(multiplier < targettedMultiplier) {
					multiplier += Math.pow(((targettedMultiplier - multiplier) / WorldProviderBetweenlands.PITSTONE_HEIGHT * (WorldProviderBetweenlands.PITSTONE_HEIGHT - player.posY)), 0.85F);
				}
			}
			fogStart *= Math.min(multiplier * (1.0F + uncloudedStrength * (1.0F / multiplier - 1.0F)), 1.0F);
			fogEnd *= Math.min((multiplier * 1.5F) * (1.0F + uncloudedStrength * (1.0F / (multiplier * 1.5F) - 1.0F)), 1.0F);
		}

		LocationAmbience ambience = LocationStorage.getAmbience(player);
		if(ambience != null) {
			if(ambience.hasFogRange()) {
				fogStart = ambience.getFogStart();
				fogEnd = ambience.getFogEnd();
			}
			if(ambience.hasFogRangeMultiplier()) {
				fogStart *= ambience.getFogRangeMultiplier();
				fogEnd *= ambience.getFogRangeMultiplier();
			}
			if(ambience.hasFogColorMultiplier()) {
				multiplier = ambience.getFogColorMultiplier();
			}
		}

		fogStart = Math.max(fogStart, 1);
		fogEnd = Math.max(fogEnd, 3);

		if(this.currentFogStart < 0.0F || this.currentFogEnd < 0.0F) {
			this.currentFogStart = fogStart;
			this.currentFogEnd = fogEnd;
		}

		float fogDistIncrMultiplier = player.posY <= WorldProviderBetweenlands.CAVE_START ? 2.0F : 1.0F;
		this.lastFogStart = this.currentFogStart;
		this.lastFogEnd = this.currentFogEnd;
		if(Math.abs(this.currentFogStart - fogStart) > fogDistIncrMultiplier) {
			float currentFogStartIncr = Math.abs(this.currentFogStart - fogStart)/this.farPlaneDistance/2.0f*fogDistIncrMultiplier;
			if(this.currentFogStart > fogStart) {
				this.currentFogStart-=currentFogStartIncr;
			} else if(this.currentFogStart < fogStart) {
				this.currentFogStart+=currentFogStartIncr;
			}
		}
		if(Math.abs(this.currentFogEnd - fogEnd) > fogDistIncrMultiplier) {
			float currentFogEndIncr = Math.abs(this.currentFogEnd - fogEnd)/this.farPlaneDistance/2.0f*fogDistIncrMultiplier;
			if(this.currentFogEnd > fogEnd) {
				this.currentFogEnd-=currentFogEndIncr;
			} else if(this.currentFogEnd < fogEnd) {
				this.currentFogEnd+=currentFogEndIncr;
			}
		}

		float targettedFogColorMultiplier = MathHelper.clamp_float(multiplier * 2.0F, 0.0F, 1.0F);
		if(this.currentFogColorMultiplier < 0.0F) {
			this.currentFogColorMultiplier = targettedFogColorMultiplier;
			this.lastFogColorMultiplier = targettedFogColorMultiplier;
		}
		this.lastFogColorMultiplier = this.currentFogColorMultiplier;
		float fogColorMultiplierIncr = 0.005F;
		if(Math.abs(this.currentFogColorMultiplier - targettedFogColorMultiplier) > fogColorMultiplierIncr) {
			if(this.currentFogColorMultiplier > targettedFogColorMultiplier) {
				this.currentFogColorMultiplier-=fogColorMultiplierIncr;
			} else if(this.currentFogColorMultiplier < targettedFogColorMultiplier) {
				this.currentFogColorMultiplier+=fogColorMultiplierIncr;
			}
		} else {
			this.currentFogColorMultiplier = targettedFogColorMultiplier;
		}
	}

	////// Underwater fog fix & Dark fog in caves //////
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onFogColor(FogColors event) {
		World world = FMLClientHandler.instance().getWorldClient();
		if(world == null || world.provider instanceof WorldProviderBetweenlands == false) {
			return;
		} else if(world.isRemote) {
			Entity renderView = Minecraft.getMinecraft().getRenderViewEntity();
			if(renderView == null || renderView.dimension != ConfigHandler.dimensionId) {
				return;
			}
			Block block = ActiveRenderInfo.getBlockStateAtEntityViewpoint(world, renderView, (float) event.getRenderPartialTicks()).getBlock();
			float fogColorMultiplier = (float) (this.currentFogColorMultiplier + (this.currentFogColorMultiplier - this.lastFogColorMultiplier) * event.getRenderPartialTicks());
			//TODO: Water fog fix
			/*if(block instanceof BlockSwampWater) {
				BiomeGenBase biome = world.getBiomeGenForCoords(
						MathHelper.floor_double(renderView.posX),
						MathHelper.floor_double(renderView.posZ));
				if(biome instanceof BiomeGenBaseBetweenlands) {
					int colorMultiplier = BLBlockRegistry.swampWater.colorMultiplier(world, MathHelper.floor_double(renderView.posX), MathHelper.floor_double(renderView.posY), MathHelper.floor_double(renderView.posZ));
					event.setRed((float)(colorMultiplier >> 16 & 255) / 255.0F);
					event.setGreen((float)(colorMultiplier >> 8 & 255) / 255.0F);
					event.setBlue((float)(colorMultiplier & 255) / 255.0F);
					double waterFogColorMultiplier = Math.pow(fogColorMultiplier, 6);
					event.setRed(event.getRed() * (float)waterFogColorMultiplier);
					event.setGreen(event.getGreen() * (float)waterFogColorMultiplier);
					event.setBlue(event.getBlue() * (float)waterFogColorMultiplier);
				}
			} else {*/
			event.setRed(event.getRed() * fogColorMultiplier);
			event.setGreen(event.getGreen() * fogColorMultiplier);
			event.setBlue(event.getBlue() * fogColorMultiplier);
			//}
		}
	}
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onFogDensity(FogDensity event) {
		World world = FMLClientHandler.instance().getWorldClient();
		if(world == null || world.provider instanceof WorldProviderBetweenlands == false) {
			return;
		} else if(world.isRemote) {
			//TODO: Water fog fix
			//			Entity renderView = Minecraft.getMinecraft().getRenderViewEntity();
			//			if(renderView == null || renderView.dimension != ConfigHandler.DIMENSION_ID) {
			//				return;
			//			}
			//			Block block = ActiveRenderInfo.getBlockStateAtEntityViewpoint(world, renderView, (float) event.getRenderPartialTicks()).getBlock();
			//			if(block instanceof BlockSwampWater) {
			//				this.fogMode = GL11.GL_EXP;
			//				GL11.glFogi(GL11.GL_FOG_MODE, GL11.GL_EXP);
			//				if (renderView instanceof EntityLivingBase && ((EntityLivingBase)renderView).isPotionActive(Potion.getPotionById(13)/*Water breathing*/)) {
			//					event.setDensity(0.1F);
			//				} else {
			//					event.setDensity(0.4F);
			//				}
			//				event.setCanceled(true);
			//			}
		}
	}
}

package thebetweenlands.common.world.biome;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.biome.Biome.Precipitation;
import net.minecraft.world.level.levelgen.GenerationStep;
import thebetweenlands.TheBetweenlands;
import thebetweenlands.common.registries.CarverRegistry;
import thebetweenlands.common.registries.MusicHandler;
import thebetweenlands.common.world.gen.biome.decorator.BiomeDecorator;
import thebetweenlands.common.world.gen.biome.feature.FlatLandFeature;
import thebetweenlands.common.world.gen.biome.generator.BiomeGenerator;

import java.util.List;

public class BiomeSludgePlains extends BiomeBetweenlands {
	
	public BiomeSludgePlains() {
		super();
		this.setWeight(5);
		this.biomeName = "betweenlands_sluge_plains";
	}

	public Biome biomeBuilder() {
		// Biome carvers and features
		this.biomeGenSettings.addCarver(GenerationStep.Carving.AIR, CarverRegistry.ConfigueredCarvers.CAVES_BETWEENLANDS.getHolder().get())
				.addCarver(GenerationStep.Carving.AIR, CarverRegistry.ConfigueredCarvers.BETWEENLANDS_RAVINES.getHolder().get());
		//.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, FeatureRegistries.PlacedFeatures.SULFUR)
		//.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FeatureRegistries.PlacedFeatures.BETWEENLANDS_CAVE_VEGETATION.getHolder().get());

		// Mob Spawn settings
		this.mobSpawnSettings.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 1, 1, 10));

		// Biome colors and other effects
		this.biomeSpecialFX.foliageColorOverride(0xD36423)
				.fogColor(0x0a1e16)
				.waterColor(0x3A2F0B)
				.waterFogColor(0x3A2F0B)
				.skyColor(0xff78A7FF)
				.grassColorOverride(0x5B3522)
				.backgroundMusic(MusicHandler.BETWEENLANDS_MUSIC);
		//this.setFoliageColors(0x2AFF00, 0x52AF5A);
		//this.setSecondaryFoliageColors(0x50a040, 0x85af51);

		// Build Biome
		this.biomeBuilder.generationSettings(this.biomeGenSettings.build())
				.mobSpawnSettings(this.mobSpawnSettings.build())
				.specialEffects(this.biomeSpecialFX.build())
				.downfall(0.9f)
				.temperature(0.8f)
				.biomeCategory(BiomeCategory.SWAMP)
				.precipitation(Precipitation.RAIN)
				.build();

		this.biomeGenerator = new BiomeGenerator(new BiomeDecorator(List.of(new FlatLandFeature(TheBetweenlands.LAYER_HEIGHT, 5)), this.id));

        return this.biomeBuilder.build();
    }

	public float getBaseHeight() {
		return 120-5;
	}
	public float getHeightVariation() {
		return 3;
	}
}

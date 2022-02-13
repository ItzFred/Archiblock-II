
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.archiblocktwo.world.features.ores.TopazStoneOreFeature;
import net.mcreator.archiblocktwo.world.features.ores.TopazGraniteOreFeature;
import net.mcreator.archiblocktwo.world.features.ores.SugiliteOreFeature;
import net.mcreator.archiblocktwo.world.features.ores.SapphireOreFeature;
import net.mcreator.archiblocktwo.world.features.ores.SapphireDioriteOreFeature;
import net.mcreator.archiblocktwo.world.features.ores.RubyOreFeature;
import net.mcreator.archiblocktwo.world.features.ores.RawTwilightBlockFeature;
import net.mcreator.archiblocktwo.world.features.ChunkAnalyzerFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArchiblockTwoModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(TopazGraniteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				TopazGraniteOreFeature.GENERATE_BIOMES, TopazGraniteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TopazStoneOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				TopazStoneOreFeature.GENERATE_BIOMES, TopazStoneOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ChunkAnalyzerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				ChunkAnalyzerFeature.GENERATE_BIOMES, ChunkAnalyzerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES,
				RubyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SapphireDioriteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SapphireDioriteOreFeature.GENERATE_BIOMES, SapphireDioriteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SapphireOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SapphireOreFeature.GENERATE_BIOMES, SapphireOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SugiliteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SugiliteOreFeature.GENERATE_BIOMES, SugiliteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RawTwilightBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				RawTwilightBlockFeature.GENERATE_BIOMES, RawTwilightBlockFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}


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

import net.mcreator.archiblocktwo.world.features.plants.ScarletRoseShrubFeature;
import net.mcreator.archiblocktwo.world.features.plants.ScarletRoseFeature;
import net.mcreator.archiblocktwo.world.features.plants.ScarletRoseBushFeature;
import net.mcreator.archiblocktwo.world.features.plants.RoseShrubFeature;
import net.mcreator.archiblocktwo.world.features.plants.RoseFeature;
import net.mcreator.archiblocktwo.world.features.plants.PinkRoseShrubFeature;
import net.mcreator.archiblocktwo.world.features.plants.PinkRoseFeature;
import net.mcreator.archiblocktwo.world.features.plants.PinkRoseBushFeature;
import net.mcreator.archiblocktwo.world.features.plants.OliveRoseShrubFeature;
import net.mcreator.archiblocktwo.world.features.plants.OliveRoseBushFeature;
import net.mcreator.archiblocktwo.world.features.plants.ButtermilkRoseShrubFeature;
import net.mcreator.archiblocktwo.world.features.plants.ButtermilkRoseFeature;
import net.mcreator.archiblocktwo.world.features.plants.ButtermilkRoseBushFeature;
import net.mcreator.archiblocktwo.world.features.plants.BlushRoseShrubFeature;
import net.mcreator.archiblocktwo.world.features.plants.BlushRoseFeature;
import net.mcreator.archiblocktwo.world.features.plants.BlushRoseBushFeature;
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
		REGISTRY.put(RoseFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RoseFeature.GENERATE_BIOMES, RoseFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RoseShrubFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RoseShrubFeature.GENERATE_BIOMES,
				RoseShrubFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ScarletRoseFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ScarletRoseFeature.GENERATE_BIOMES, ScarletRoseFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ScarletRoseBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ScarletRoseBushFeature.GENERATE_BIOMES, ScarletRoseBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ScarletRoseShrubFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ScarletRoseShrubFeature.GENERATE_BIOMES, ScarletRoseShrubFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlushRoseFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlushRoseFeature.GENERATE_BIOMES,
				BlushRoseFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlushRoseShrubFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BlushRoseShrubFeature.GENERATE_BIOMES, BlushRoseShrubFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlushRoseBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BlushRoseBushFeature.GENERATE_BIOMES, BlushRoseBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PinkRoseFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PinkRoseFeature.GENERATE_BIOMES,
				PinkRoseFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PinkRoseShrubFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PinkRoseShrubFeature.GENERATE_BIOMES, PinkRoseShrubFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PinkRoseBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PinkRoseBushFeature.GENERATE_BIOMES, PinkRoseBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ButtermilkRoseFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ButtermilkRoseFeature.GENERATE_BIOMES, ButtermilkRoseFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ButtermilkRoseBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ButtermilkRoseBushFeature.GENERATE_BIOMES, ButtermilkRoseBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ButtermilkRoseShrubFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ButtermilkRoseShrubFeature.GENERATE_BIOMES, ButtermilkRoseShrubFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OliveRoseShrubFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				OliveRoseShrubFeature.GENERATE_BIOMES, OliveRoseShrubFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OliveRoseBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				OliveRoseBushFeature.GENERATE_BIOMES, OliveRoseBushFeature.CONFIGURED_FEATURE));
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

package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralConfig;
import chalkboardmods.floralflair.core.FloralFlair;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ClampedInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {


    public static final class Configured {

        public static final ConfiguredFeature<?, ?> FLOWER_FOXNIP = register("flower_foxnip", Feature.FLOWER.configured(grassPatch(BlockStateProvider.simple(FloralBlocks.FOXNIP.get()), FloralConfig.foxnipDensity.get())));
        public static final ConfiguredFeature<?, ?> FLOWER_FROSTED_FOXNIP = register("flower_frosted_foxnip", Feature.FLOWER.configured(grassPatch(BlockStateProvider.simple(FloralBlocks.FROSTED_FOXNIP.get()), FloralConfig.foxnipDensity.get())));
        public static final ConfiguredFeature<?, ?> FLOWER_PULSE_PETAL = register("flower_pulse_petal", Feature.FLOWER.configured(grassPatch(BlockStateProvider.simple(FloralBlocks.PULSE_PETAL.get()), FloralConfig.pulsePetalDensity.get())));
        public static final ConfiguredFeature<?, ?> FLOWER_FAIRY_BLOSSOM = register("flower_fairy_blossom", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FAIRY_BLOSSOM.get()))))));
        public static final ConfiguredFeature<?, ?> FLOWER_JUNGLE_GEM = register("flower_jungle_gem", Feature.FLOWER.configured(grassPatch(BlockStateProvider.simple(FloralBlocks.JUNGLE_GEM.get()), FloralConfig.jungleGemDensity.get())));
        public static final ConfiguredFeature<?, ?> FLOWER_ROSE = register("flower_rose", Feature.FLOWER.configured(grassPatch(BlockStateProvider.simple(FloralBlocks.ROSE.get()), FloralConfig.roseDensity.get())));
        public static final ConfiguredFeature<?, ?> FLOWER_SUNSET_POPPY = register("flower_sunset_poppy", Feature.FLOWER.configured(grassPatch(BlockStateProvider.simple(FloralBlocks.SUNSET_POPPY.get()), FloralConfig.sunsetPoppyDensity.get())));
        public static final ConfiguredFeature<?, ?> FLOWER_MUSCARI = register("flower_muscari", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.MUSCARI.get()))))));









        private static <FeatureConfig extends FeatureConfiguration> ConfiguredFeature<FeatureConfig, ?> register(String name, ConfiguredFeature<FeatureConfig, ?> configuredFeature) {
            return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), configuredFeature);
        }

        private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int value) {
            return FeatureUtils.simpleRandomPatchConfiguration(value, Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(stateProvider)).onlyWhenEmpty());
        }
    }

    public static final class Placed {
        public static final PlacedFeature FOXNIP_PLACED = PlacementUtils.register("foxnip", Configured.FLOWER_FOXNIP.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
        public static final PlacedFeature FROSTED_FOXNIP_PLACED = PlacementUtils.register("frosted_foxnip", Configured.FLOWER_FROSTED_FOXNIP.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
        public static final PlacedFeature PULSE_PLACED = PlacementUtils.register("pulse_petal", Configured.FLOWER_PULSE_PETAL.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
        public static final PlacedFeature FAIRY_BLOSSOM_PLACED = PlacementUtils.register("fairy_blossom", Configured.FLOWER_FAIRY_BLOSSOM.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
        public static final PlacedFeature JUNGLE_GEM_PLACED = PlacementUtils.register("jungle_gem", Configured.FLOWER_JUNGLE_GEM.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
        public static final PlacedFeature MUSCARI_PLACED = PlacementUtils.register("muscari", Configured.FLOWER_MUSCARI.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
        public static final PlacedFeature SUNSET_POPPY_PLACED = PlacementUtils.register("sunset_poppy", Configured.FLOWER_SUNSET_POPPY.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
        public static final PlacedFeature ROSE_PLACED = PlacementUtils.register("rose", Configured.FLOWER_ROSE.placed(RarityFilter.onAverageOnceEvery(7), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)), BiomeFilter.biome()));
    }
}

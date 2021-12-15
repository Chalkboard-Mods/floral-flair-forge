package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralFlair;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {


    public static final class Configured {

        public static final ConfiguredFeature<?, ?> FLOWER_FOXNIP = register("flower_foxnip", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 4, 3, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FOXNIP.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_FROSTED_FOXNIP = register("flower_frosted_foxnip", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 4, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FROSTED_FOXNIP.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_PULSE_PETAL = register("flower_pulse_petal", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.PULSE_PETAL.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_FAIRY_BLOSSOM = register("flower_fairy_blossom", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FAIRY_BLOSSOM.get()))))));
        public static final ConfiguredFeature<?, ?> FLOWER_JUNGLE_GEM = register("flower_jungle_gem", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 5, 4, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.JUNGLE_GEM.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_ROSE = register("flower_rose", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 4, 1, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.ROSE.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_SUNSET_POPPY = register("flower_sunset_poppy", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 7, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SUNSET_POPPY.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_MUSCARI = register("flower_muscari", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.MUSCARI.get()))))));
        public static final ConfiguredFeature<?, ?> FLOWER_PURPUREUM = register("flower_purpureum", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.PURPUREUM.get()))))));







        private static <FeatureConfig extends FeatureConfiguration> ConfiguredFeature<FeatureConfig, ?> register(String name, ConfiguredFeature<FeatureConfig, ?> configuredFeature) {
            return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), configuredFeature);
        }
    }

    public static final class Placed {
        public static final PlacedFeature FOXNIP_PLACED = PlacementUtils.register("foxnip", Configured.FLOWER_FOXNIP.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature FROSTED_FOXNIP_PLACED = PlacementUtils.register("frosted_foxnip", Configured.FLOWER_FROSTED_FOXNIP.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature PULSE_PLACED = PlacementUtils.register("pulse_petal", Configured.FLOWER_PULSE_PETAL.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature FAIRY_BLOSSOM_PLACED = PlacementUtils.register("fairy_blossom", Configured.FLOWER_FAIRY_BLOSSOM.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature JUNGLE_GEM_PLACED = PlacementUtils.register("jungle_gem", Configured.FLOWER_JUNGLE_GEM.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature MUSCARI_PLACED = PlacementUtils.register("muscari", Configured.FLOWER_MUSCARI.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature SUNSET_POPPY_PLACED = PlacementUtils.register("sunset_poppy", Configured.FLOWER_SUNSET_POPPY.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature ROSE_PLACED = PlacementUtils.register("rose", Configured.FLOWER_ROSE.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature PURPUREUM_PLACED = PlacementUtils.register("purpureum", Configured.FLOWER_PURPUREUM.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    }
}

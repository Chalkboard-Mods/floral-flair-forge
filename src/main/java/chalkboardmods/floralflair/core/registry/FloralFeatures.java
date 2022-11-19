package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralFlair;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {

    public static final class Configured {
        private static final WeightedStateProvider ANTHURIUM_WEIGHTS = new WeightedStateProvider(new SimpleWeightedRandomList.Builder<BlockState>().add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH), 4).add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST), 4).add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH), 4).add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST), 4));

        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_FOXNIP = FeatureUtils.register("flower_foxnip", Feature.FLOWER, new RandomPatchConfiguration(64, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FOXNIP.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_FROSTED_FOXNIP = FeatureUtils.register("flower_frosted_foxnip", Feature.FLOWER, new RandomPatchConfiguration(64, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FROSTED_FOXNIP.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_PULSE_PETAL = FeatureUtils.register("flower_pulse_petal", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.PULSE_PETAL.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_FAIRY_BLOSSOM = FeatureUtils.register("flower_fairy_blossom", Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FAIRY_BLOSSOM.get()))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_JUNGLE_GEM = FeatureUtils.register("flower_jungle_gem", Feature.FLOWER, new RandomPatchConfiguration(64, 5, 4, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.JUNGLE_GEM.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_ROSE = FeatureUtils.register("flower_rose", Feature.FLOWER, new RandomPatchConfiguration(64, 4, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.JUNGLE_GEM.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_SUNSET_POPPY = FeatureUtils.register("flower_sunset_poppy", Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SUNSET_POPPY.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_MUSCARI = FeatureUtils.register("flower_muscari", Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.MUSCARI.get()))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_PURPUREUM = FeatureUtils.register("flower_purpureum", Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.PURPUREUM.get()))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_SCILLA = FeatureUtils.register("flower_scilla", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SCILLA.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_MIDNIGHT_ORCHID = FeatureUtils.register("flower_midnight_orchid", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.MIDNIGHT_ORCHID.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_HYACINTH = FeatureUtils.register("flower_hyacinth", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.HYACINTH.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_SNOWFALL = FeatureUtils.register("flower_snowfall", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SNOWFALL_FLOWER.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_SPIKED_TULIP = FeatureUtils.register("flower_spiked_tulip", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SPIKED_TULIP.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_STONNETE = FeatureUtils.register("flower_stonnete", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.STONNETE.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_LUNULA = FeatureUtils.register("flower_lunula", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.LUNULA.get())))));
        public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_ANTHURIUM = FeatureUtils.register("flower_anthurium", Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(ANTHURIUM_WEIGHTS))));
    }

    public static final class Placed {
        public static final Holder<PlacedFeature> FOXNIP_PLACED = PlacementUtils.register("foxnip", Configured.FLOWER_FOXNIP, RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> FROSTED_FOXNIP_PLACED = PlacementUtils.register("frosted_foxnip", Configured.FLOWER_FROSTED_FOXNIP, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> PULSE_PLACED = PlacementUtils.register("pulse_petal", Configured.FLOWER_PULSE_PETAL, RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> FAIRY_BLOSSOM_PLACED = PlacementUtils.register("fairy_blossom", Configured.FLOWER_FAIRY_BLOSSOM, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> JUNGLE_GEM_PLACED = PlacementUtils.register("jungle_gem", Configured.FLOWER_JUNGLE_GEM, RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> MUSCARI_PLACED = PlacementUtils.register("muscari", Configured.FLOWER_MUSCARI, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> SUNSET_POPPY_PLACED = PlacementUtils.register("sunset_poppy", Configured.FLOWER_SUNSET_POPPY, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> ROSE_PLACED = PlacementUtils.register("rose", Configured.FLOWER_ROSE, RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> PURPUREUM_PLACED = PlacementUtils.register("purpureum", Configured.FLOWER_PURPUREUM, RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> SCILLA_PLACED = PlacementUtils.register("scilla", Configured.FLOWER_SCILLA, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> MIDNIGHT_ORCHID_PLACED = PlacementUtils.register("midnight_orchid", Configured.FLOWER_MIDNIGHT_ORCHID, RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> HYACINTH_PLACED = PlacementUtils.register("hyacinth", Configured.FLOWER_HYACINTH, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> SNOWFALL_FLOWER_PLACED = PlacementUtils.register("snow_fall_flower", Configured.FLOWER_SNOWFALL, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> SPIKED_TULIP_PLACED = PlacementUtils.register("spiked_tulip", Configured.FLOWER_SPIKED_TULIP, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        public static final Holder<PlacedFeature> STONNETE_PLACED = PlacementUtils.register("stonnete", Configured.FLOWER_STONNETE, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        public static final Holder<PlacedFeature> LUNULA_PLACED = PlacementUtils.register("lunula", Configured.FLOWER_LUNULA, RarityFilter.onAverageOnceEvery(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        public static final Holder<PlacedFeature> ANTHURIUM_PLACED = PlacementUtils.register("anthurium", Configured.FLOWER_ANTHURIUM, RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    }
}

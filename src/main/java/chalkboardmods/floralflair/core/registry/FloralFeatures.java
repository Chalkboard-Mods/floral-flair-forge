package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralFlair;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {


    public static final class Configured {
        private static final WeightedStateProvider ANTHURIUM_WEIGHTS = new WeightedStateProvider(new SimpleWeightedRandomList.Builder<BlockState>().add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.FACING, Direction.NORTH), 4).add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.FACING, Direction.EAST), 4).add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.FACING, Direction.SOUTH), 4).add(FloralBlocks.ANTHURIUM.get().defaultBlockState().setValue(BlockStateProperties.FACING, Direction.WEST), 4));

        public static final ConfiguredFeature<?, ?> FLOWER_FOXNIP = FeatureUtils.register("flower_foxnip", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 4, 3, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FOXNIP.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_FROSTED_FOXNIP = FeatureUtils.register("flower_frosted_foxnip", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 4, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FROSTED_FOXNIP.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_PULSE_PETAL = FeatureUtils.register("flower_pulse_petal", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.PULSE_PETAL.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_FAIRY_BLOSSOM = FeatureUtils.register("flower_fairy_blossom", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.FAIRY_BLOSSOM.get()))))));
        public static final ConfiguredFeature<?, ?> FLOWER_JUNGLE_GEM = FeatureUtils.register("flower_jungle_gem", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 5, 4, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.JUNGLE_GEM.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_ROSE = FeatureUtils.register("flower_rose", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 4, 1, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.ROSE.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_SUNSET_POPPY = FeatureUtils.register("flower_sunset_poppy", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 7, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SUNSET_POPPY.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_MUSCARI = FeatureUtils.register("flower_muscari", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.MUSCARI.get()))))));
        public static final ConfiguredFeature<?, ?> FLOWER_PURPUREUM = FeatureUtils.register("flower_purpureum", Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.PURPUREUM.get()))))));
        public static final ConfiguredFeature<?, ?> FLOWER_SCILLA = FeatureUtils.register("flower_scilla", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SCILLA.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_MIDNIGHT_ORCHID = FeatureUtils.register("flower_midnight_orchid", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.MIDNIGHT_ORCHID.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_HYACINTH = FeatureUtils.register("flower_hyacinth", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.HYACINTH.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_SNOW_FALL_FLOWER = FeatureUtils.register("flower_snow_fall_flower", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SNOW_FALL_FLOWER.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_SPIKED_TULIP = FeatureUtils.register("flower_spiked_tulip", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.SPIKED_TULIP.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_STONNETE = FeatureUtils.register("flower_stonnete", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.STONNETE.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_LUNULA = FeatureUtils.register("flower_lunula", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.LUNULA.get()))).onlyWhenEmpty())));
        public static final ConfiguredFeature<?, ?> FLOWER_ANTHURIUM = FeatureUtils.register("flower_anthurium", Feature.FLOWER.configured(new RandomPatchConfiguration(64, 6, 2, () -> Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(ANTHURIUM_WEIGHTS)).onlyWhenEmpty())));
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
        public static final PlacedFeature SCILLA_PLACED = PlacementUtils.register("scilla", Configured.FLOWER_SCILLA.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature MIDNIGHT_ORCHID_PLACED = PlacementUtils.register("midnight_orchid", Configured.FLOWER_MIDNIGHT_ORCHID.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature HYACINTH_PLACED = PlacementUtils.register("hyacinth", Configured.FLOWER_HYACINTH.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature SNOW_FALL_FLOWER_PLACED = PlacementUtils.register("snow_fall_flower", Configured.FLOWER_SNOW_FALL_FLOWER.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature SPIKED_TULIP_PLACED = PlacementUtils.register("spiked_tulip", Configured.FLOWER_SPIKED_TULIP.placed(RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome()));
        public static final PlacedFeature STONNETE_PLACED = PlacementUtils.register("stonnete", Configured.FLOWER_STONNETE.placed(RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome()));
        public static final PlacedFeature LUNULA_PLACED = PlacementUtils.register("lunula", Configured.FLOWER_LUNULA.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        public static final PlacedFeature ANTHURIUM_PLACED = PlacementUtils.register("anthurium", Configured.FLOWER_ANTHURIUM.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


    }
}

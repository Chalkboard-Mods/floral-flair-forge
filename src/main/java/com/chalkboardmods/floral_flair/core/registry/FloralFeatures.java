package com.chalkboardmods.floral_flair.core.registry;

import com.chalkboardmods.floral_flair.common.feature.ThornBlossomFeature;
import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {

    public static final class Features {
        public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, FloralFlair.MOD_ID);

        public static final RegistryObject<Feature<SimpleBlockConfiguration>> THORN_BLOSSOM_FEATURE = FEATURES.register("thorn_blossom", () -> new ThornBlossomFeature(SimpleBlockConfiguration.CODEC));
    }

    public static final class Configured {
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_FOXNIP = basicConfigured("flower_foxnip", FloralBlocks.FOXNIP, 64, 4, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_FROSTED_FOXNIP = basicConfigured("flower_frosted_foxnip", FloralBlocks.FROSTED_FOXNIP, 64, 4, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_PULSE_PETAL = basicConfigured("flower_pulse_petal", FloralBlocks.PULSE_PETAL, 64 , 6, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_FAIRY_BLOSSOM = simpleConfigured("flower_fairy_blossom", FloralBlocks.FAIRY_BLOSSOM);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_JUNGLE_GEM = basicConfigured("flower_jungle_gem", FloralBlocks.JUNGLE_GEM, 64, 5, 4);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_ROSE = basicConfigured("flower_rose", FloralBlocks.ROSE, 64, 4, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_MUSCARI = basicConfigured("flower_muscari", FloralBlocks.MUSCARI, 64, 5, 4);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_PURPUREUM = simpleConfigured("flower_purpureum", FloralBlocks.PURPUREUM);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_SCILLA = basicConfigured("flower_scilla", FloralBlocks.SCILLA, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_TWILIGHT_ORCHID = basicConfigured("flower_twilight_orchid", FloralBlocks.TWILIGHT_ORCHID, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_SUNSET_ORCHID = basicConfigured("flower_sunset_orchid", FloralBlocks.SUNSET_ORCHID, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_MORNING_ORCHID = basicConfigured("flower_morning_orchid", FloralBlocks.MORNING_ORCHID, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_DAWN_ORCHID = basicConfigured("flower_dawn_orchid", FloralBlocks.DAWN_ORCHID, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_PINK_HYACINTH = hyacinthPatchConfigured();
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_STONETTE = basicConfigured("flower_stonette", FloralBlocks.STONETTE, 64, 4, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_LUNULA = basicConfigured("flower_lunula", FloralBlocks.LUNULA, 64, 4, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_ORANGE_COSMOS = basicConfigured("flower_orange_cosmos", FloralBlocks.ORANGE_COSMOS, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_WHITE_COSMOS = basicConfigured("flower_white_cosmos", FloralBlocks.WHITE_COSMOS, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_PINK_COSMOS = basicConfigured("flower_pink_cosmos", FloralBlocks.PINK_COSMOS, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_CHOCOLATE_COSMOS = basicConfigured("flower_chocolate_cosmos", FloralBlocks.CHOCOLATE_COSMOS, 64, 5, 3);
        public static final Holder<ConfiguredFeature<?, ?>> FLOWER_THORN_BLOSSOM = thornBlossomConfigured("flower_thorn_blossom", FloralBlocks.THORN_BLOSSOM);
    }

    public static final class Placed {
        public static final Holder<PlacedFeature> FLOWER_FOXNIP = basicFlowerWithRarityFilterPlaced("flower_foxnip", Configured.FLOWER_FOXNIP, 8);
        public static final Holder<PlacedFeature> FLOWER_FROSTED_FOXNIP = basicFlowerWithRarityFilterPlaced("flower_frosted_foxnip", Configured.FLOWER_FROSTED_FOXNIP, 10);
        public static final Holder<PlacedFeature> FLOWER_PULSE_PETAL = basicFlowerWithRarityFilterPlaced("flower_pulse_petal", Configured.FLOWER_PULSE_PETAL, 8);
        public static final Holder<PlacedFeature> FLOWER_FAIRY_BLOSSOM = basicFlowerWithRarityFilterPlaced("flower_fairy_blossom", Configured.FLOWER_FAIRY_BLOSSOM, 10);
        public static final Holder<PlacedFeature> FLOWER_JUNGLE_GEM = basicFlowerWithRarityFilterPlaced("flower_jungle_gem", Configured.FLOWER_JUNGLE_GEM, 12);
        public static final Holder<PlacedFeature> FLOWER_MUSCARI = basicFlowerWithRarityFilterPlaced("flower_muscari", Configured.FLOWER_MUSCARI, 10);
        public static final Holder<PlacedFeature> FLOWER_ROSE = basicFlowerWithRarityFilterPlaced("flower_rose", Configured.FLOWER_ROSE, 8);
        public static final Holder<PlacedFeature> FLOWER_PURPUREUM = basicFlowerWithRarityFilterPlaced("flower_purpureum", Configured.FLOWER_PURPUREUM, 12);
        public static final Holder<PlacedFeature> FLOWER_SCILLA = basicFlowerWithRarityFilterPlaced("flower_scilla", Configured.FLOWER_SCILLA, 10);
        public static final Holder<PlacedFeature> FLOWER_TWILIGHT_ORCHID = basicFlowerWithRarityFilterPlaced("flower_twilight_orchid", Configured.FLOWER_TWILIGHT_ORCHID, 12);
        public static final Holder<PlacedFeature> FLOWER_SUNSET_ORCHID = basicFlowerWithRarityFilterPlaced("flower_sunset_orchid", Configured.FLOWER_SUNSET_ORCHID, 12);
        public static final Holder<PlacedFeature> FLOWER_MORNING_ORCHID = basicFlowerWithRarityFilterPlaced("flower_morning_orchid", Configured.FLOWER_MORNING_ORCHID, 12);
        public static final Holder<PlacedFeature> FLOWER_DAWN_ORCHID = basicFlowerWithRarityFilterPlaced("flower_dawn_orchid", Configured.FLOWER_DAWN_ORCHID, 12);
        public static final Holder<PlacedFeature> FLOWER_PATCH_HYACINTH = basicFlowerWithRarityFilterPlaced("flower_patch_hyacinth", Configured.FLOWER_PINK_HYACINTH, 6);
        public static final Holder<PlacedFeature> FLOWER_STONETTE = basicPlaced("flower_stonette", Configured.FLOWER_STONETTE, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        public static final Holder<PlacedFeature> FLOWER_LUNULA = basicFlowerWithRarityFilterPlaced("flower_lunula", Configured.FLOWER_LUNULA, 8);
        public static final Holder<PlacedFeature> FLOWER_ORANGE_COSMOS = basicFlowerWithRarityFilterPlaced("flower_orange_cosmos", Configured.FLOWER_ORANGE_COSMOS,12);
        public static final Holder<PlacedFeature> FLOWER_WHITE_COSMOS = basicFlowerWithRarityFilterPlaced("flower_white_cosmos", Configured.FLOWER_WHITE_COSMOS,12);
        public static final Holder<PlacedFeature> FLOWER_PINK_COSMOS = basicFlowerWithRarityFilterPlaced("flower_pink_cosmos", Configured.FLOWER_PINK_COSMOS,12);
        public static final Holder<PlacedFeature> FLOWER_CHOCOLATE_COSMOS = basicFlowerWithRarityFilterPlaced("flower_chocolate_cosmos", Configured.FLOWER_CHOCOLATE_COSMOS,12);
        public static final Holder<PlacedFeature> FLOWER_THORN_BLOSSOM = basicPlaced("flower_thorn_blossom", Configured.FLOWER_THORN_BLOSSOM, CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
    }

    public static Holder<ConfiguredFeature<?, ?>> basicConfigured(String name, Supplier<Block> block, int tries, int xzSpread, int ySpread) {
        return BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(tries, xzSpread, ySpread, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(block.get()))))));
    }

    public static Holder<ConfiguredFeature<?, ?>> simpleConfigured(String name, Supplier<Block> block) {
        return BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(block.get())))));
    }

    public static Holder<ConfiguredFeature<?, ?>> thornBlossomConfigured(String name, Supplier<Block> block) {
        return BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Features.THORN_BLOSSOM_FEATURE.get(), new SimpleBlockConfiguration(BlockStateProvider.simple(block.get())))));
    }

    public static Holder<ConfiguredFeature<?, ?>> hyacinthPatchConfigured() {
        return BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, "flower_patch_hyacinth"), new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(64, 6, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(FloralBlocks.PINK_HYACINTH.get().defaultBlockState(), 2).add(FloralBlocks.BLUE_HYACINTH.get().defaultBlockState(), 2).add(FloralBlocks.YELLOW_HYACINTH.get().defaultBlockState(), 2).add(FloralBlocks.BLACK_HYACINTH.get().defaultBlockState(), 1).build()))))));
    }

    @SuppressWarnings("unchecked")
    public static Holder<PlacedFeature> basicPlaced(String name, Holder<? extends ConfiguredFeature<?, ?>> configuredFeature, PlacementModifier... placementModifiers) {
        return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), new PlacedFeature((Holder<ConfiguredFeature<?,?>>) configuredFeature, ImmutableList.copyOf(placementModifiers)));
    }

    public static Holder<PlacedFeature> basicFlowerWithRarityFilterPlaced(String name, Holder<? extends ConfiguredFeature<?, ?>> configuredFeature, int average) {
        return basicPlaced(name, configuredFeature, RarityFilter.onAverageOnceEvery(average), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    }
}

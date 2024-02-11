package com.chalkboardmods.floral_flair.core.data.server;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.other.FloralTags;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import com.chalkboardmods.floral_flair.core.registry.FloralFeatures;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import javax.lang.model.element.VariableElement;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import static com.chalkboardmods.floral_flair.core.FloralFlair.DataGenUtils.*;

public class FloralDatapackBuiltinEntriesProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder().add(Registries.CONFIGURED_FEATURE, FloralDatapackBuiltinEntriesProvider::bootstrapConfiguredFeatures).add(Registries.PLACED_FEATURE, FloralDatapackBuiltinEntriesProvider::bootstrapPlacedFeatures).add(ForgeRegistries.Keys.BIOME_MODIFIERS, FloralDatapackBuiltinEntriesProvider::bootstrapBiomeModifiers);

    public FloralDatapackBuiltinEntriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(FloralFlair.MOD_ID));
    }

    public static void bootstrapConfiguredFeatures(BootstapContext<ConfiguredFeature<?, ?>> context) {
        basicConfigured("flower_foxnip", 64, 4, 3, FloralBlocks.FOXNIP, context);
        basicConfigured("flower_frosted_foxnip", 64, 4, 3, FloralBlocks.FROSTED_FOXNIP, context);
        basicConfigured("flower_pulse_petal", 64 , 6, 3, FloralBlocks.PULSE_PETAL, context);
        simpleConfigured("flower_fairy_blossom", FloralBlocks.FAIRY_BLOSSOM, context);
        basicConfigured("flower_jungle_gem", 64, 5, 4, FloralBlocks.JUNGLE_GEM, context);
        basicConfigured("flower_rose", 64, 4, 3, FloralBlocks.ROSE, context);
        basicConfigured("flower_muscari", 64, 5, 4, FloralBlocks.MUSCARI, context);
        simpleConfigured("flower_purpureum", FloralBlocks.PURPUREUM, context);
        basicConfigured("flower_scilla", 64, 5, 3, FloralBlocks.SCILLA, context);
        basicConfigured("flower_twilight_orchid", 64, 5, 3, FloralBlocks.TWILIGHT_ORCHID, context);
        basicConfigured("flower_sunset_orchid", 64, 5, 3, FloralBlocks.SUNSET_ORCHID, context);
        basicConfigured("flower_morning_orchid", 64, 5, 3, FloralBlocks.MORNING_ORCHID, context);
        basicConfigured("flower_dawn_orchid", 64, 5, 3, FloralBlocks.DAWN_ORCHID, context);
        basicMultiConfigured("flower_hyacinth", 64, 6, 3, Map.of(FloralBlocks.PINK_HYACINTH, 2, FloralBlocks.BLUE_HYACINTH, 2, FloralBlocks.YELLOW_HYACINTH, 2, FloralBlocks.BLACK_HYACINTH, 1), context);
        basicConfigured("flower_stonette", 64, 4, 3, FloralBlocks.STONETTE, context);
        basicConfigured("flower_lunula", 64, 4, 3, FloralBlocks.LUNULA, context);
        basicMultiConfigured("flower_cosmos", 64, 5, 3, Map.of(FloralBlocks.ORANGE_COSMOS, 3, FloralBlocks.WHITE_COSMOS, 3, FloralBlocks.PINK_COSMOS, 3, FloralBlocks.CHOCOLATE_COSMOS, 1), context);
        thornBlossomConfigured(context);
    }

    public static void bootstrapPlacedFeatures(BootstapContext<PlacedFeature> context) {
        rarityPlaced("flower_foxnip", 10, context);
        rarityPlaced("flower_frosted_foxnip", 10, context);
        rarityPlaced("flower_pulse_petal", 8, context);
        rarityPlaced("flower_fairy_blossom", 10, context);
        rarityPlaced("flower_jungle_gem", 12, context);
        rarityPlaced("flower_rose", 8, context);
        rarityPlaced("flower_muscari", 10, context);
        rarityPlaced("flower_purpureum", 12, context);
        rarityPlaced("flower_scilla", 10, context);
        rarityPlaced("flower_twilight_orchid", 16, context);
        rarityPlaced("flower_sunset_orchid", 16, context);
        rarityPlaced("flower_morning_orchid", 16, context);
        rarityPlaced("flower_dawn_orchid", 16, context);
        rarityPlaced("flower_hyacinth", 6, context);
        specificPlaced("flower_stonette", context, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        rarityPlaced("flower_lunula", 8, context);
        rarityPlaced("flower_cosmos", 12, context);
        specificPlaced("flower_thorn_blossom", context, CountPlacement.of(8), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
    }

    private static void bootstrapBiomeModifiers(BootstapContext<BiomeModifier> context) {
        modifier("flower_foxnip", FloralTags.BiomeTags.FOXNIP_BIOMES, context);
        modifier("flower_frosted_foxnip", FloralTags.BiomeTags.FROSTED_FOXNIP_BIOMES, context);
        modifier("flower_pulse_petal", FloralTags.BiomeTags.PULSE_PETAL_BIOMES, context);
        modifier("flower_fairy_blossom", FloralTags.BiomeTags.FAIRY_BLOSSOM_BIOMES, context);
        modifier("flower_jungle_gem", FloralTags.BiomeTags.JUNGLE_GEM_BIOMES, context);
        modifier("flower_rose", FloralTags.BiomeTags.ROSE_BIOMES, context);
        modifier("flower_muscari", FloralTags.BiomeTags.MUSCARI_BIOMES, context);
        modifier("flower_purpureum", FloralTags.BiomeTags.PURPUREUM_BIOMES, context);
        modifier("flower_scilla", FloralTags.BiomeTags.SCILLA_BIOMES, context);
        modifier("flower_twilight_orchid", FloralTags.BiomeTags.ORCHID_BIOMES, context);
        modifier("flower_sunset_orchid", FloralTags.BiomeTags.ORCHID_BIOMES, context);
        modifier("flower_morning_orchid", FloralTags.BiomeTags.ORCHID_BIOMES, context);
        modifier("flower_dawn_orchid", FloralTags.BiomeTags.ORCHID_BIOMES, context);
        modifier("flower_hyacinth", FloralTags.BiomeTags.HYACINTH_BIOMES, context);
        modifier("flower_stonette", FloralTags.BiomeTags.STONETTE_BIOMES, context);
        modifier("flower_lunula", FloralTags.BiomeTags.LUNULA_BIOMES, context);
        modifier("flower_cosmos", FloralTags.BiomeTags.COSMOS_BIOMES, context);
        modifier("flower_thorn_blossom", FloralTags.BiomeTags.THORN_BLOSSOM_BIOMES, context);

    }

    private static void configured(String name, ConfiguredFeature<?, ?> configuredFeature, BootstapContext<ConfiguredFeature<?, ?>> context) {
        final ResourceLocation rl = modLocation(name);
        final ResourceKey<ConfiguredFeature<?, ?>> key = configuredKey(rl);

        context.register(key, configuredFeature);
    }

    private static void basicConfigured(String name, int tries, int xzspread, int ySpread, Supplier<Block> flower, BootstapContext<ConfiguredFeature<?, ?>> context) {
        final ConfiguredFeature<RandomPatchConfiguration, ?> configuredFeature = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(tries, xzspread, ySpread, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(flower.get())))));

        configured(name, configuredFeature, context);
    }

    private static void simpleConfigured(String name, Supplier<Block> flower, BootstapContext<ConfiguredFeature<?, ?>> context) {
        final ConfiguredFeature<RandomPatchConfiguration, ?> configuredFeature = new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(flower.get()))));

        configured(name, configuredFeature, context);
    }

    private static void basicMultiConfigured(String name, int tries, int xzSpread, int ySpread, Map<Supplier<Block>, Integer> flowers, BootstapContext<ConfiguredFeature<?, ?>> context) {
        final SimpleWeightedRandomList.Builder<BlockState> LIST_BUILDER = SimpleWeightedRandomList.builder();

        for (Map.Entry<Supplier<Block>, Integer> flower : flowers.entrySet()) {
            LIST_BUILDER.add(flower.getKey().get().defaultBlockState(), flower.getValue());
        }
        final ConfiguredFeature<RandomPatchConfiguration, ?> configuredFeature = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(tries, xzSpread, ySpread, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(LIST_BUILDER.build())))));

        configured(name, configuredFeature, context);
    }

    private static void thornBlossomConfigured(BootstapContext<ConfiguredFeature<?, ?>> context) {
        final ConfiguredFeature<RandomPatchConfiguration, ?> configuredFeature = new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(FloralFeatures.Features.THORN_BLOSSOM_FEATURE.get(), new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.THORN_BLOSSOM.get()))));

        configured("flower_thorn_blossom", configuredFeature, context);
    }

    private static void placed(String name, PlacedFeature placedFeature, BootstapContext<PlacedFeature> context) {
        final ResourceLocation rl = modLocation(name);
        final ResourceKey<PlacedFeature> key = placedKey(rl);

        context.register(key, placedFeature);
    }

    private static void rarityPlaced(String name, int average, BootstapContext<PlacedFeature> context) {
        final ResourceLocation rl = modLocation(name);

        final var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> configHolder = configuredFeatures.getOrThrow(configuredKey(rl));

        final PlacedFeature placedFeature = new PlacedFeature(configHolder, List.of(RarityFilter.onAverageOnceEvery(average), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        placed(name, placedFeature, context);
    }

    private static void specificPlaced(String name, BootstapContext<PlacedFeature> context, PlacementModifier... modifiers) {
        final ResourceLocation rl = modLocation(name);

        final var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> configHolder = configuredFeatures.getOrThrow(configuredKey(rl));

        final PlacedFeature placedFeature = new PlacedFeature(configHolder, ImmutableList.copyOf(modifiers));

        placed(name, placedFeature, context);
    }

    private static void modifier(String name, TagKey<Biome> biomeTag, BootstapContext<BiomeModifier> context) {
        final ResourceLocation rl = modLocation(name);

        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        final BiomeModifier modifier = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(biomeTag), HolderSet.direct(placedFeatures.getOrThrow(placedKey(rl))), GenerationStep.Decoration.VEGETAL_DECORATION);

        context.register(modifierKey(rl), modifier);
    }
}

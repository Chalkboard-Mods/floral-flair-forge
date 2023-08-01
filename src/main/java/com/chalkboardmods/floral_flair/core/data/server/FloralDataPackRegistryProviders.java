package com.chalkboardmods.floral_flair.core.data.server;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.other.FloralTags;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import com.chalkboardmods.floral_flair.core.registry.FloralFeatures;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.RegistryOps;
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
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static com.chalkboardmods.floral_flair.core.FloralFlair.DataGenUtils.*;

public class FloralDataPackRegistryProviders {
    private static final Map<ResourceLocation, ConfiguredFeature<?, ?>> CONFIGURED_MAP = new HashMap<>();
    private static final Map<ResourceLocation, PlacedFeature> PLACED_MAP = new HashMap<>();
    private static final Map<ResourceLocation, BiomeModifier> MODIFIER_MAP = new HashMap<>();

    public static void registerDataPackProviders(DataGenerator generator, ExistingFileHelper fileHelper, RegistryOps<JsonElement> registryOps, boolean includeServer) {
        rarityFlowerGen("flower_foxnip", 64, 4, 3, 8, FloralBlocks.FOXNIP, FloralTags.BiomeTags.FOXNIP_BIOMES, registryOps);
        rarityFlowerGen("flower_frosted_foxnip", 64, 4, 3, 10, FloralBlocks.FROSTED_FOXNIP, FloralTags.BiomeTags.FROSTED_FOXNIP_BIOMES, registryOps);
        rarityFlowerGen("flower_pulse_petal", 64, 6, 3, 8, FloralBlocks.PULSE_PETAL, FloralTags.BiomeTags.PULSE_PETAL_BIOMES, registryOps);
        simpleFlowerGen("flower_fairy_blossom", 10, FloralBlocks.FAIRY_BLOSSOM, FloralTags.BiomeTags.FAIRY_BLOSSOM_BIOMES, registryOps);
        rarityFlowerGen("flower_jungle_gem", 64, 5, 4, 12, FloralBlocks.JUNGLE_GEM, FloralTags.BiomeTags.JUNGLE_GEM_BIOMES, registryOps);
        rarityFlowerGen("flower_rose", 64, 4, 3, 8, FloralBlocks.ROSE, FloralTags.BiomeTags.ROSE_BIOMES, registryOps);
        rarityFlowerGen("flower_muscari", 64, 5, 4, 10, FloralBlocks.MUSCARI, FloralTags.BiomeTags.MUSCARI_BIOMES, registryOps);
        simpleFlowerGen("flower_purpureum", 12, FloralBlocks.PURPUREUM, FloralTags.BiomeTags.PURPUREUM_BIOMES, registryOps);
        rarityFlowerGen("flower_scilla", 64, 5, 3, 10, FloralBlocks.SCILLA, FloralTags.BiomeTags.SCILLA_BIOMES, registryOps);
        rarityFlowerGen("flower_twilight_orchid", 64, 5, 3, 16, FloralBlocks.TWILIGHT_ORCHID, FloralTags.BiomeTags.ORCHID_BIOMES, registryOps);
        rarityFlowerGen("flower_sunset_orchid", 64, 5, 3, 16, FloralBlocks.SUNSET_ORCHID, FloralTags.BiomeTags.ORCHID_BIOMES, registryOps);
        rarityFlowerGen("flower_morning_orchid", 64, 5, 3, 16, FloralBlocks.MORNING_ORCHID, FloralTags.BiomeTags.ORCHID_BIOMES, registryOps);
        rarityFlowerGen("flower_dawn_orchid", 64, 5, 3, 16, FloralBlocks.DAWN_ORCHID, FloralTags.BiomeTags.ORCHID_BIOMES, registryOps);
        basicMultiFlowerGen("flower_hyacinth", 64, 6, 3, 6, Map.of(FloralBlocks.PINK_HYACINTH, 2, FloralBlocks.BLUE_HYACINTH, 2, FloralBlocks.YELLOW_HYACINTH, 2, FloralBlocks.BLACK_HYACINTH, 1), FloralTags.BiomeTags.HYACINTH_BIOMES, registryOps);
        specificFlowerGen("flower_stonette", 64, 3, 3, FloralBlocks.STONETTE, FloralTags.BiomeTags.STONETTE_BIOMES, registryOps, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome());
        rarityFlowerGen("flower_lunula", 64, 4, 3, 8, FloralBlocks.LUNULA, FloralTags.BiomeTags.LUNULA_BIOMES, registryOps);
        basicMultiFlowerGen("flower_cosmos", 64, 5, 3, 12, Map.of(FloralBlocks.ORANGE_COSMOS, 3, FloralBlocks.WHITE_COSMOS, 3, FloralBlocks.PINK_COSMOS, 3, FloralBlocks.CHOCOLATE_COSMOS, 1), FloralTags.BiomeTags.COSMOS_BIOMES, registryOps);
        thornBlossomFlowerGen(registryOps);

        generator.addProvider(includeServer, JsonCodecProvider.forDatapackRegistry(generator, fileHelper, FloralFlair.MOD_ID, registryOps, Registry.CONFIGURED_FEATURE_REGISTRY, CONFIGURED_MAP));
        generator.addProvider(includeServer, JsonCodecProvider.forDatapackRegistry(generator, fileHelper, FloralFlair.MOD_ID, registryOps, Registry.PLACED_FEATURE_REGISTRY, PLACED_MAP));
        generator.addProvider(includeServer, JsonCodecProvider.forDatapackRegistry(generator, fileHelper, FloralFlair.MOD_ID, registryOps, ForgeRegistries.Keys.BIOME_MODIFIERS, MODIFIER_MAP));
    }

    private static void flowerGen(String name, ConfiguredFeature<?, ?> configuredFeature, List<PlacementModifier> placementModifiers, TagKey<Biome> biomeTag, RegistryOps<JsonElement> registryOps) {
        final ResourceLocation rl = modLocation(name);
        final ResourceKey<ConfiguredFeature<?, ?>> CONFIG_KEY = configuredKey(rl);
        final ResourceKey<PlacedFeature> PLACED_KEY = placedKey(rl);

        //Configured Feature
        final Holder<ConfiguredFeature<?, ?>> CONFIG_HOLDER = registryOps.registry(Registry.CONFIGURED_FEATURE_REGISTRY).orElseThrow().getOrCreateHolderOrThrow(CONFIG_KEY);

        //Placed Feature
        final PlacedFeature PLACED_FEATURE = new PlacedFeature(CONFIG_HOLDER, placementModifiers);

        //Biome Tag
        final HolderSet.Named<Biome> BIOMES = new HolderSet.Named<>(registryOps.registry(Registry.BIOME_REGISTRY).orElseThrow(), biomeTag);

        //Biome Modifier
        final BiomeModifier MODIFIER = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(BIOMES, HolderSet.direct(registryOps.registry(Registry.PLACED_FEATURE_REGISTRY).orElseThrow().getOrCreateHolderOrThrow(PLACED_KEY)), GenerationStep.Decoration.VEGETAL_DECORATION);

        //Add to Registry
        CONFIGURED_MAP.put(rl, configuredFeature);
        PLACED_MAP.put(rl, PLACED_FEATURE);
        MODIFIER_MAP.put(rl, MODIFIER);
    }

    private static void rarityFlowerGen(String name, int tries, int xzSpread, int ySpread, int average, Supplier<Block> flower, TagKey<Biome> biomeTag, RegistryOps<JsonElement> registryOps){
        final ConfiguredFeature<RandomPatchConfiguration, ?> CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(tries, xzSpread, ySpread, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(flower.get())))));
        flowerGen(name, CONFIGURED_FEATURE, basicFlowerWithRarityFilter(average), biomeTag, registryOps);
    }

    private static void specificFlowerGen(String name, int tries, int xzSpread, int ySpread, Supplier<Block> flower, TagKey<Biome> biomeTag, RegistryOps<JsonElement> registryOps, PlacementModifier... modifiers) {
        final ConfiguredFeature<RandomPatchConfiguration, ?>  CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(tries, xzSpread, ySpread, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(flower.get())))));
        flowerGen(name, CONFIGURED_FEATURE, ImmutableList.copyOf(modifiers), biomeTag, registryOps);
    }

    private static void simpleFlowerGen(String name, int average, Supplier<Block> flower, TagKey<Biome> biomeTag, RegistryOps<JsonElement> registryOps){
        final ConfiguredFeature<RandomPatchConfiguration, ?> CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(flower.get()))));

        flowerGen(name, CONFIGURED_FEATURE, basicFlowerWithRarityFilter(average), biomeTag, registryOps);
    }

    private static void basicMultiFlowerGen(String name, int tries, int xzSpread, int ySpread, int average, Map<Supplier<Block>, Integer> flowers, TagKey<Biome> biomeTag, RegistryOps<JsonElement> registryOps) {
        SimpleWeightedRandomList.Builder<BlockState> LIST_BUILDER = SimpleWeightedRandomList.builder();

        for (Map.Entry<Supplier<Block>, Integer> flower : flowers.entrySet()) {
            LIST_BUILDER.add(flower.getKey().get().defaultBlockState(), flower.getValue());
        }
        final ConfiguredFeature<RandomPatchConfiguration, ?> CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(tries, xzSpread, ySpread, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(LIST_BUILDER.build())))));

        flowerGen(name, CONFIGURED_FEATURE, basicFlowerWithRarityFilter(average), biomeTag, registryOps);
    }

    private static void thornBlossomFlowerGen(RegistryOps<JsonElement> registryOps) {
        ConfiguredFeature<RandomPatchConfiguration, ?> CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(FloralFeatures.Features.THORN_BLOSSOM_FEATURE.get(), new SimpleBlockConfiguration(BlockStateProvider.simple(FloralBlocks.THORN_BLOSSOM.get()))));

        flowerGen("flower_thorn_blossom", CONFIGURED_FEATURE, List.of(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, BiomeFilter.biome()), FloralTags.BiomeTags.THORN_BLOSSOM_BIOMES, registryOps);
    }

    private static List<PlacementModifier> basicFlowerWithRarityFilter(int average) {
        return List.of(RarityFilter.onAverageOnceEvery(average), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    }
}

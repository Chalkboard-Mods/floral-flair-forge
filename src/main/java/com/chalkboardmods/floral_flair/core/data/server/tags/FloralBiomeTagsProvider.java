package com.chalkboardmods.floral_flair.core.data.server.tags;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.other.FloralTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FloralBiomeTagsProvider extends BiomeTagsProvider {

    public FloralBiomeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookup, FloralFlair.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(FloralTags.BiomeTags.FOXNIP_BIOMES).add(
                Biomes.TAIGA,
                Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.OLD_GROWTH_PINE_TAIGA
        );

        tag(FloralTags.BiomeTags.FROSTED_FOXNIP_BIOMES).add(
                Biomes.SNOWY_TAIGA
        );

        tag(FloralTags.BiomeTags.PULSE_PETAL_BIOMES).addTag(
                net.minecraft.tags.BiomeTags.IS_FOREST
        );

        tag(FloralTags.BiomeTags.FAIRY_BLOSSOM_BIOMES).add(
                Biomes.FLOWER_FOREST
        );

        tag(FloralTags.BiomeTags.JUNGLE_GEM_BIOMES).add(
                Biomes.JUNGLE,
                Biomes.SPARSE_JUNGLE
        );

        tag(FloralTags.BiomeTags.ROSE_BIOMES).add(
                Biomes.MEADOW
        );

        tag(FloralTags.BiomeTags.MUSCARI_BIOMES).addTag(
                Tags.Biomes.IS_SNOWY
        );

        tag(FloralTags.BiomeTags.PURPUREUM_BIOMES).addTag(
                Tags.Biomes.IS_SWAMP
        );

        tag(FloralTags.BiomeTags.SCILLA_BIOMES).add(
                Biomes.GROVE
        );

        tag(FloralTags.BiomeTags.ORCHID_BIOMES)
                .addTag(Tags.Biomes.IS_SWAMP)
                .addTag(BiomeTags.IS_JUNGLE);

        tag(FloralTags.BiomeTags.HYACINTH_BIOMES).add(
                Biomes.BIRCH_FOREST,
                Biomes.OLD_GROWTH_BIRCH_FOREST
        );

        tag(FloralTags.BiomeTags.STONETTE_BIOMES).addTag(
                BiomeTags.IS_OVERWORLD
        );

        tag(FloralTags.BiomeTags.LUNULA_BIOMES).add(
                Biomes.DARK_FOREST
        );

        tag(FloralTags.BiomeTags.COSMOS_BIOMES).addTag(
                BiomeTags.IS_SAVANNA
        );

        tag(FloralTags.BiomeTags.THORN_BLOSSOM_BIOMES).add(
                Biomes.DRIPSTONE_CAVES
        );
    }
}

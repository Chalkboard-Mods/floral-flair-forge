package com.chalkboardmods.floral_flair.core.data.server.tags;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import com.teamabnormals.blueprint.core.data.server.tags.BlueprintItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class FloralItemTagsProvider extends BlueprintItemTagsProvider {
    public FloralItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, CompletableFuture<TagLookup<Block>> tagLookup, ExistingFileHelper fileHelper) {
        super(FloralFlair.MOD_ID, output, lookup, tagLookup, fileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.SMALL_FLOWERS).add(
                FloralBlocks.FOXNIP.get().asItem(),
                FloralBlocks.FROSTED_FOXNIP.get().asItem(),
                FloralBlocks.PULSE_PETAL.get().asItem(),
                FloralBlocks.JUNGLE_GEM.get().asItem(),
                FloralBlocks.ROSE.get().asItem(),
                FloralBlocks.SCILLA.get().asItem(),
                FloralBlocks.TWILIGHT_ORCHID.get().asItem(),
                FloralBlocks.SUNSET_ORCHID.get().asItem(),
                FloralBlocks.MORNING_ORCHID.get().asItem(),
                FloralBlocks.DAWN_ORCHID.get().asItem(),
                FloralBlocks.PINK_HYACINTH.get().asItem(),
                FloralBlocks.BLUE_HYACINTH.get().asItem(),
                FloralBlocks.YELLOW_HYACINTH.get().asItem(),
                FloralBlocks.BLACK_HYACINTH.get().asItem(),
                FloralBlocks.STONETTE.get().asItem(),
                FloralBlocks.ORANGE_COSMOS.get().asItem(),
                FloralBlocks.WHITE_COSMOS.get().asItem(),
                FloralBlocks.PINK_COSMOS.get().asItem(),
                FloralBlocks.CHOCOLATE_COSMOS.get().asItem(),
                FloralBlocks.LUNULA.get().asItem(),
                FloralBlocks.MUSCARI.get().asItem()
                );
        tag(ItemTags.TALL_FLOWERS).add(
                FloralBlocks.FAIRY_BLOSSOM.get().asItem(),
                FloralBlocks.PURPUREUM.get().asItem(),
                FloralBlocks.THORN_BLOSSOM.get().asItem()
        );
    }
}

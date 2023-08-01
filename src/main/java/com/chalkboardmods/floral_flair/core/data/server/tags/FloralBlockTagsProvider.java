package com.chalkboardmods.floral_flair.core.data.server.tags;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FloralBlockTagsProvider extends BlockTagsProvider {
    public FloralBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper fileHelper) {
        super(output, lookupProvider, FloralFlair.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider var) {
        tag(BlockTags.SMALL_FLOWERS).add(
                FloralBlocks.FOXNIP.get(),
                FloralBlocks.FROSTED_FOXNIP.get(),
                FloralBlocks.PULSE_PETAL.get(),
                FloralBlocks.JUNGLE_GEM.get(),
                FloralBlocks.ROSE.get(),
                FloralBlocks.SCILLA.get(),
                FloralBlocks.TWILIGHT_ORCHID.get(),
                FloralBlocks.SUNSET_ORCHID.get(),
                FloralBlocks.MORNING_ORCHID.get(),
                FloralBlocks.DAWN_ORCHID.get(),
                FloralBlocks.PINK_HYACINTH.get(),
                FloralBlocks.BLUE_HYACINTH.get(),
                FloralBlocks.YELLOW_HYACINTH.get(),
                FloralBlocks.BLACK_HYACINTH.get(),
                FloralBlocks.STONETTE.get(),
                FloralBlocks.ORANGE_COSMOS.get(),
                FloralBlocks.WHITE_COSMOS.get(),
                FloralBlocks.PINK_COSMOS.get(),
                FloralBlocks.CHOCOLATE_COSMOS.get(),
                FloralBlocks.LUNULA.get(),
                FloralBlocks.MUSCARI.get()
        );
        tag(BlockTags.TALL_FLOWERS).add(
                FloralBlocks.FAIRY_BLOSSOM.get(),
                FloralBlocks.PURPUREUM.get(),
                FloralBlocks.THORN_BLOSSOM.get()
        );
        tag(BlockTags.FLOWER_POTS).add(
                FloralBlocks.POTTED_FOXNIP.get(),
                FloralBlocks.POTTED_FROSTED_FOXNIP.get(),
                FloralBlocks.POTTED_PULSE_PETAL.get(),
                FloralBlocks.POTTED_JUNGLE_GEM.get(),
                FloralBlocks.POTTED_ROSE.get(),
                FloralBlocks.POTTED_SCILLA.get(),
                FloralBlocks.POTTED_TWILIGHT_ORCHID.get(),
                FloralBlocks.POTTED_SUNSET_ORCHID.get(),
                FloralBlocks.POTTED_MORNING_ORCHID.get(),
                FloralBlocks.POTTED_DAWN_ORCHID.get(),
                FloralBlocks.POTTED_PINK_HYACINTH.get(),
                FloralBlocks.POTTED_BLUE_HYACINTH.get(),
                FloralBlocks.POTTED_YELLOW_HYACINTH.get(),
                FloralBlocks.POTTED_BLACK_HYACINTH.get(),
                FloralBlocks.POTTED_STONETTE.get(),
                FloralBlocks.POTTED_ORANGE_COSMOS.get(),
                FloralBlocks.POTTED_WHITE_COSMOS.get(),
                FloralBlocks.POTTED_PINK_COSMOS.get(),
                FloralBlocks.POTTED_CHOCOLATE_COSMOS.get(),
                FloralBlocks.POTTED_LUNULA.get(),
                FloralBlocks.POTTED_MUSCARI.get()
        );
    }
}

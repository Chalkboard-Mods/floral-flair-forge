package chalkboardmods.floralflair.core.data.server.tags;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class FloralBlockTagsProvider extends BlockTagsProvider {
    public FloralBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper fileHelper) {
        super(generator, FloralFlair.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.SMALL_FLOWERS).add(
                FloralBlocks.FOXNIP.get(),
                FloralBlocks.FROSTED_FOXNIP.get(),
                FloralBlocks.PULSE_PETAL.get(),
                FloralBlocks.JUNGLE_GEM.get(),
                FloralBlocks.ROSE.get(),
                FloralBlocks.SUNSET_POPPY.get(),
                FloralBlocks.SCILLA.get(),
                FloralBlocks.MIDNIGHT_ORCHID.get(),
                FloralBlocks.HYACINTH.get(),
                FloralBlocks.SNOWFALL_FLOWER.get(),
                FloralBlocks.SPIKED_TULIP.get(),
                FloralBlocks.STONNETE.get(),
                FloralBlocks.LUNULA.get()
        );
        tag(BlockTags.TALL_FLOWERS).add(
                FloralBlocks.FAIRY_BLOSSOM.get(),
                FloralBlocks.MUSCARI.get(),
                FloralBlocks.PURPUREUM.get()
        );
        tag(BlockTags.FLOWER_POTS).add(
                FloralBlocks.POTTED_FOXNIP.get(),
                FloralBlocks.POTTED_FROSTED_FOXNIP.get(),
                FloralBlocks.POTTED_PULSE_PETAL.get(),
                FloralBlocks.POTTED_JUNGLE_GEM.get(),
                FloralBlocks.POTTED_ROSE.get(),
                FloralBlocks.POTTED_SUNSET_POPPY.get(),
                FloralBlocks.POTTED_SCILLA.get(),
                FloralBlocks.POTTED_MIDNIGHT_ORCHID.get(),
                FloralBlocks.POTTED_HYACINTH.get(),
                FloralBlocks.POTTED_SNOWFALL_FLOWER.get(),
                FloralBlocks.POTTED_SPIKED_TULIP.get(),
                FloralBlocks.POTTED_STONNETE.get(),
                FloralBlocks.POTTED_LUNULA.get()
        );
    }
}

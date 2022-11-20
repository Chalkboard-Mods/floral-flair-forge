package chalkboardmods.floralflair.core.data.server.tags;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
import com.teamabnormals.blueprint.core.data.server.tags.BlueprintItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FloralItemTagsProvider extends BlueprintItemTagsProvider {
    public FloralItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper fileHelper) {
        super(FloralFlair.MOD_ID, generator, blockTagsProvider, fileHelper);
    }

    @Override
    protected void addTags() {
        tag(ItemTags.SMALL_FLOWERS).add(
                FloralBlocks.FOXNIP.get().asItem(),
                FloralBlocks.FROSTED_FOXNIP.get().asItem(),
                FloralBlocks.PULSE_PETAL.get().asItem(),
                FloralBlocks.JUNGLE_GEM.get().asItem(),
                FloralBlocks.ROSE.get().asItem(),
                FloralBlocks.SUNSET_POPPY.get().asItem(),
                FloralBlocks.SCILLA.get().asItem(),
                FloralBlocks.MIDNIGHT_ORCHID.get().asItem(),
                FloralBlocks.HYACINTH.get().asItem(),
                FloralBlocks.SNOWFALL_FLOWER.get().asItem(),
                FloralBlocks.SPIKED_TULIP.get().asItem(),
                FloralBlocks.STONNETE.get().asItem(),
                FloralBlocks.LUNULA.get().asItem()
        );
        tag(ItemTags.TALL_FLOWERS).add(
                FloralBlocks.FAIRY_BLOSSOM.get().asItem(),
                FloralBlocks.MUSCARI.get().asItem(),
                FloralBlocks.PURPUREUM.get().asItem()
        );
    }
}

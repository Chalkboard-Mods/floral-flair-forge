package chalkboardmods.floralflair.core.data.client;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class FloralLanguageProvider extends LanguageProvider {
    public FloralLanguageProvider(DataGenerator generator) {
        super(generator, FloralFlair.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(FloralBlocks.FOXNIP.get(), "Foxnip");
        add(FloralBlocks.FROSTED_FOXNIP.get(), "Frosted Foxnip");
        add(FloralBlocks.PULSE_PETAL.get(), "Pulse Petal");
        add(FloralBlocks.FAIRY_BLOSSOM.get(), "Fairy Blossom");
        add(FloralBlocks.JUNGLE_GEM.get(), "Gem of the Jungle");
        add(FloralBlocks.ROSE.get(), "Rose");
        add(FloralBlocks.SUNSET_POPPY.get(), "Sunset Poppy");
        add(FloralBlocks.MUSCARI.get(), "Muscari");
        add(FloralBlocks.PURPUREUM.get(), "Purpureum");
        add(FloralBlocks.SCILLA.get(), "Scilla");
        add(FloralBlocks.MIDNIGHT_ORCHID.get(), "Midnight Orchid");
        add(FloralBlocks.HYACINTH.get(), "Hyacinth");
        add(FloralBlocks.SNOWFALL_FLOWER.get(), "Snowfall Flower");
        add(FloralBlocks.SPIKED_TULIP.get(), "Spiked Tulip");
        add(FloralBlocks.STONNETE.get(), "Stonette");
        add(FloralBlocks.LUNULA.get(), "Lunula");

        add(FloralBlocks.POTTED_FOXNIP.get(), "Potted Foxnip");
        add(FloralBlocks.POTTED_FROSTED_FOXNIP.get(), "Potted Frosted Foxnip");
        add(FloralBlocks.POTTED_PULSE_PETAL.get(), "Potted Pulse Petal");
        add(FloralBlocks.POTTED_JUNGLE_GEM.get(), "Potted Gem of the Jungle");
        add(FloralBlocks.POTTED_ROSE.get(), "Potted Rose");
        add(FloralBlocks.POTTED_SUNSET_POPPY.get(), "Potted Sunset Poppy");
        add(FloralBlocks.POTTED_SCILLA.get(), "Potted Scilla");
        add(FloralBlocks.POTTED_MIDNIGHT_ORCHID.get(), "Potted Midnight Orchid");
        add(FloralBlocks.POTTED_HYACINTH.get(), "Potted Hyacinth");
        add(FloralBlocks.POTTED_SNOWFALL_FLOWER.get(), "Potted Snowfall Flower");
        add(FloralBlocks.POTTED_SPIKED_TULIP.get(), "Potted Spiked Tulip");
        add(FloralBlocks.POTTED_STONNETE.get(), "Potted Stonette");
        add(FloralBlocks.POTTED_LUNULA.get(), "Potted Lunula");
    }
}

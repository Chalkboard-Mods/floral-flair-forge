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
        add(FloralBlocks.MUSCARI.get(), "Muscari");
        add(FloralBlocks.PURPUREUM.get(), "Purpureum");
        add(FloralBlocks.SCILLA.get(), "Scilla");
        add(FloralBlocks.MIDNIGHT_ORCHID.get(), "Midnight Orchid");
        add(FloralBlocks.HYACINTH.get(), "Hyacinth");
        add(FloralBlocks.SPIKED_TULIP.get(), "Spiked Tulip");
        add(FloralBlocks.STONNETE.get(), "Stonette");
        add(FloralBlocks.LUNULA.get(), "Lunula");
        add(FloralBlocks.ORANGE_COSMOS.get(), "Orange Cosmos");
        add(FloralBlocks.WHITE_COSMOS.get(), "White Cosmos");
        add(FloralBlocks.PINK_COSMOS.get(), "Pink Cosmos");
        add(FloralBlocks.CHOCOLATE_COSMOS.get(), "Chocolate Cosmos");

        add(FloralBlocks.POTTED_FOXNIP.get(), "Potted Foxnip");
        add(FloralBlocks.POTTED_FROSTED_FOXNIP.get(), "Potted Frosted Foxnip");
        add(FloralBlocks.POTTED_PULSE_PETAL.get(), "Potted Pulse Petal");
        add(FloralBlocks.POTTED_JUNGLE_GEM.get(), "Potted Gem of the Jungle");
        add(FloralBlocks.POTTED_ROSE.get(), "Potted Rose");
        add(FloralBlocks.POTTED_SCILLA.get(), "Potted Scilla");
        add(FloralBlocks.POTTED_MIDNIGHT_ORCHID.get(), "Potted Midnight Orchid");
        add(FloralBlocks.POTTED_HYACINTH.get(), "Potted Hyacinth");
        add(FloralBlocks.POTTED_SPIKED_TULIP.get(), "Potted Spiked Tulip");
        add(FloralBlocks.POTTED_STONNETE.get(), "Potted Stonette");
        add(FloralBlocks.POTTED_LUNULA.get(), "Potted Lunula");
        add(FloralBlocks.POTTED_ORANGE_COSMOS.get(), "Potted Orange Cosmos");
        add(FloralBlocks.POTTED_WHITE_COSMOS.get(), "Potted White Cosmos");
        add(FloralBlocks.POTTED_PINK_COSMOS.get(), "Potted Pink Cosmos");
        add(FloralBlocks.POTTED_CHOCOLATE_COSMOS.get(), "Potted Chocolate Cosmos");
    }
}

package com.chalkboardmods.floral_flair.core.data.client;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class FloralLanguageProvider extends LanguageProvider {
    public FloralLanguageProvider(PackOutput packOutput) {
        super(packOutput, FloralFlair.MOD_ID, "en_us");
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
        add(FloralBlocks.TWILIGHT_ORCHID.get(), "Twilight Orchid");
        add(FloralBlocks.SUNSET_ORCHID.get(), "Sunset Orchid");
        add(FloralBlocks.MORNING_ORCHID.get(), "Morning Orchid");
        add(FloralBlocks.DAWN_ORCHID.get(), "Dawn Orchid");
        add(FloralBlocks.PINK_HYACINTH.get(), "Pink Hyacinth");
        add(FloralBlocks.BLUE_HYACINTH.get(), "Blue Hyacinth");
        add(FloralBlocks.YELLOW_HYACINTH.get(), "Yellow Hyacinth");
        add(FloralBlocks.BLACK_HYACINTH.get(), "Black Hyacinth");
        add(FloralBlocks.THORN_BLOSSOM.get(), "Thorn Blossom");
        add(FloralBlocks.STONETTE.get(), "Stonette");
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
        add(FloralBlocks.POTTED_TWILIGHT_ORCHID.get(), "Potted Twilight Orchid");
        add(FloralBlocks.POTTED_SUNSET_ORCHID.get(), "Potted Sunset Orchid");
        add(FloralBlocks.POTTED_MORNING_ORCHID.get(), "Potted Morning Orchid");
        add(FloralBlocks.POTTED_DAWN_ORCHID.get(), "Potted Dawn Orchid");
        add(FloralBlocks.POTTED_PINK_HYACINTH.get(), "Potted Pink Hyacinth");
        add(FloralBlocks.POTTED_BLUE_HYACINTH.get(), "Potted Blue Hyacinth");
        add(FloralBlocks.POTTED_YELLOW_HYACINTH.get(), "Potted Yellow Hyacinth");
        add(FloralBlocks.POTTED_BLACK_HYACINTH.get(), "Potted Black Hyacinth");
        add(FloralBlocks.POTTED_STONETTE.get(), "Potted Stonette");
        add(FloralBlocks.POTTED_LUNULA.get(), "Potted Lunula");
        add(FloralBlocks.POTTED_ORANGE_COSMOS.get(), "Potted Orange Cosmos");
        add(FloralBlocks.POTTED_WHITE_COSMOS.get(), "Potted White Cosmos");
        add(FloralBlocks.POTTED_PINK_COSMOS.get(), "Potted Pink Cosmos");
        add(FloralBlocks.POTTED_CHOCOLATE_COSMOS.get(), "Potted Chocolate Cosmos");
        add(FloralBlocks.POTTED_MUSCARI.get(), "Potted Muscari");
    }
}

package com.chalkboardmods.floral_flair.core.other;


import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import com.teamabnormals.blueprint.core.util.DataUtil;

public class FloralCompat {
    public static void compatList() {
        compostability();
        flammability();
    }

    public static void compostability() {
        DataUtil.registerCompostable(FloralBlocks.FOXNIP.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.FROSTED_FOXNIP.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.ROSE.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.JUNGLE_GEM.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.PURPUREUM.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.PULSE_PETAL.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.FAIRY_BLOSSOM.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.MUSCARI.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.SCILLA.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.TWILIGHT_ORCHID.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.SUNSET_ORCHID.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.MORNING_ORCHID.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.DAWN_ORCHID.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.PINK_HYACINTH.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.THORN_BLOSSOM.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.STONETTE.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.LUNULA.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.ORANGE_COSMOS.get(), 0.65f);
    }

    public static void flammability() {
        DataUtil.registerFlammable(FloralBlocks.FOXNIP.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.FROSTED_FOXNIP.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.ROSE.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.JUNGLE_GEM.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.PURPUREUM.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.PULSE_PETAL.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.FAIRY_BLOSSOM.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.MUSCARI.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.SCILLA.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.TWILIGHT_ORCHID.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.SUNSET_ORCHID.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.MORNING_ORCHID.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.DAWN_ORCHID.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.PINK_HYACINTH.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.BLUE_HYACINTH.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.YELLOW_HYACINTH.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.BLACK_HYACINTH.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.THORN_BLOSSOM.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.STONETTE.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.LUNULA.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.ORANGE_COSMOS.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.WHITE_COSMOS.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.PINK_COSMOS.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.CHOCOLATE_COSMOS.get(), 60, 100);
    }
}

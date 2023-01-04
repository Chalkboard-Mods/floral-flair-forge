package chalkboardmods.floralflair.core.other;


import chalkboardmods.floralflair.core.registry.FloralBlocks;
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
        DataUtil.registerCompostable(FloralBlocks.MIDNIGHT_ORCHID.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.HYACINTH.get(), 0.65f);
        DataUtil.registerCompostable(FloralBlocks.SPIKED_TULIP.get(), 0.65f);
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
        DataUtil.registerFlammable(FloralBlocks.MIDNIGHT_ORCHID.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.HYACINTH.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.SPIKED_TULIP.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.STONETTE.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.LUNULA.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.ORANGE_COSMOS.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.WHITE_COSMOS.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.PINK_COSMOS.get(), 60, 100);
        DataUtil.registerFlammable(FloralBlocks.CHOCOLATE_COSMOS.get(), 60, 100);
    }
}

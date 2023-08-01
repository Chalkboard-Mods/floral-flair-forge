package com.chalkboardmods.floral_flair.core.registry;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;

import static net.minecraft.world.item.CreativeModeTabs.*;
import static net.minecraft.world.item.crafting.Ingredient.of;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = FloralFlair.MOD_ID)
public class FloralItems {

    public static void setupTabEditors() {
        CreativeModeTabContentsPopulator.mod(FloralFlair.MOD_ID)
                .tab(NATURAL_BLOCKS)
                .addItemsAfter(of(Items.LILY_OF_THE_VALLEY), FloralBlocks.FOXNIP, FloralBlocks.FROSTED_FOXNIP, FloralBlocks.PULSE_PETAL, FloralBlocks.JUNGLE_GEM, FloralBlocks.ROSE, FloralBlocks.MUSCARI, FloralBlocks.SCILLA, FloralBlocks.TWILIGHT_ORCHID, FloralBlocks.SUNSET_ORCHID, FloralBlocks.MORNING_ORCHID, FloralBlocks.DAWN_ORCHID, FloralBlocks.PINK_HYACINTH, FloralBlocks.BLUE_HYACINTH, FloralBlocks.YELLOW_HYACINTH, FloralBlocks.BLACK_HYACINTH, FloralBlocks.STONETTE, FloralBlocks.ORANGE_COSMOS, FloralBlocks.WHITE_COSMOS, FloralBlocks.PINK_COSMOS, FloralBlocks.CHOCOLATE_COSMOS, FloralBlocks.LUNULA)
                .addItemsAfter(of(Items.PEONY), FloralBlocks.FAIRY_BLOSSOM, FloralBlocks.PURPUREUM, FloralBlocks.THORN_BLOSSOM);
    }
}

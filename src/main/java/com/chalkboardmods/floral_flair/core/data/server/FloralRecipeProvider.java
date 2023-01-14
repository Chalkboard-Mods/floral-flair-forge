package com.chalkboardmods.floral_flair.core.data.server;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;

public class FloralRecipeProvider extends RecipeProvider {
    public FloralRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        createDyeFromFlowerRecipe(FloralBlocks.FOXNIP.get(), Items.ORANGE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.FROSTED_FOXNIP.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.PULSE_PETAL.get(), Items.RED_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.FAIRY_BLOSSOM.get(), Items.MAGENTA_DYE, 2, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.JUNGLE_GEM.get(), Items.YELLOW_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.ROSE.get(), Items.RED_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.MUSCARI.get(), Items.CYAN_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.PURPUREUM.get(), Items.MAGENTA_DYE, 2, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.SCILLA.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.TWILIGHT_ORCHID.get(), Items.PURPLE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.SUNSET_ORCHID.get(), Items.ORANGE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.MORNING_ORCHID.get(), Items.YELLOW_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.DAWN_ORCHID.get(), Items.WHITE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.PINK_HYACINTH.get(), Items.PINK_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.BLUE_HYACINTH.get(), Items.BLUE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.YELLOW_HYACINTH.get(), Items.YELLOW_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.BLACK_HYACINTH.get(), Items.BLACK_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.THORN_BLOSSOM.get(), Items.BROWN_DYE, 2, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.STONETTE.get(), Items.GRAY_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.ORANGE_COSMOS.get(), Items.ORANGE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.WHITE_COSMOS.get(), Items.WHITE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.PINK_COSMOS.get(), Items.PINK_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.CHOCOLATE_COSMOS.get(), Items.BROWN_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.LUNULA.get(), Items.BLUE_DYE, consumer);

        createDyeFromCuttingFlowersRecipe(FloralBlocks.FOXNIP.get(), Items.ORANGE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.FROSTED_FOXNIP.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.PULSE_PETAL.get(), Items.RED_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.JUNGLE_GEM.get(), Items.YELLOW_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.ROSE.get(), Items.RED_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.SCILLA.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.TWILIGHT_ORCHID.get(), Items.PURPLE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.SUNSET_ORCHID.get(), Items.ORANGE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.MORNING_ORCHID.get(), Items.YELLOW_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.DAWN_ORCHID.get(), Items.WHITE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.PINK_HYACINTH.get(), Items.PINK_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.BLUE_HYACINTH.get(), Items.BLUE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.YELLOW_HYACINTH.get(), Items.YELLOW_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.BLACK_HYACINTH.get(), Items.BLACK_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.STONETTE.get(), Items.GRAY_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.ORANGE_COSMOS.get(), Items.ORANGE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.WHITE_COSMOS.get(), Items.WHITE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.PINK_COSMOS.get(), Items.PINK_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.CHOCOLATE_COSMOS.get(), Items.BROWN_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.LUNULA.get(), Items.BLUE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.MUSCARI.get(), Items.CYAN_DYE, consumer);
    }

    private static void createDyeFromFlowerRecipe(ItemLike flower, ItemLike dye, int count, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(dye, count).requires(flower).unlockedBy(getHasName(flower), has(flower)).save(consumer, new ResourceLocation(FloralFlair.MOD_ID, "crafting/" + getItemName(dye) + "_from_" + getItemName(flower)));
    }

    private static void createDyeFromFlowerRecipe(ItemLike flower, ItemLike dye, Consumer<FinishedRecipe> consumer) {
        createDyeFromFlowerRecipe(flower, dye, 1, consumer);
    }

    private static void createDyeFromCuttingFlowersRecipe(ItemLike flower, ItemLike dye, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition("farmersdelight"))
                .addRecipe(consumer1 -> CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(flower), Ingredient.of(ForgeTags.TOOLS_KNIVES), dye, 2).build(consumer1))
                .build(consumer, new ResourceLocation(FloralFlair.MOD_ID, "cutting/" + getItemName(dye) + "_from_" + getItemName(flower)));
    }
}

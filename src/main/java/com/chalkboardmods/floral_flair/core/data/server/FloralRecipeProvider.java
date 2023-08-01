package com.chalkboardmods.floral_flair.core.data.server;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.content.kinetics.millstone.MillingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeSerializer;
import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FloralRecipeProvider extends RecipeProvider {
    public FloralRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        createDyeFromFlowerRecipe(FloralBlocks.FOXNIP.get(), Items.ORANGE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.FROSTED_FOXNIP.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.PULSE_PETAL.get(), Items.RED_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.FAIRY_BLOSSOM.get(), Items.MAGENTA_DYE, 2, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.JUNGLE_GEM.get(), Items.YELLOW_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.ROSE.get(), Items.RED_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.MUSCARI.get(), Items.CYAN_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.PURPUREUM.get(), Items.PINK_DYE, 2, consumer);
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

        createDyeFromMillingFlowerRecipe(FloralBlocks.FOXNIP, (transform) -> transform.duration(50).output(Items.ORANGE_DYE).output(Items.WHITE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.FROSTED_FOXNIP, (transform) -> transform.duration(50).output(Items.WHITE_DYE).output(Items.LIGHT_BLUE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.PULSE_PETAL, (transform) -> transform.duration(50).output(Items.RED_DYE, 2).output(0.10F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.FAIRY_BLOSSOM, (transform) -> transform.duration(50).output(Items.MAGENTA_DYE, 2).output(0.25F, Items.MAGENTA_DYE).output(0.05F, Items.MAGENTA_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.JUNGLE_GEM, (transform) -> transform.duration(50).output(Items.YELLOW_DYE, 2).output(0.10F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.ROSE, (transform) -> transform.duration(50).output(Items.RED_DYE, 2).output(0.10F, Items.BLACK_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.MUSCARI, (transform) -> transform.duration(50).output(Items.BLUE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.PURPUREUM, (transform) -> transform.duration(50).output(Items.PINK_DYE, 2).output(0.25F, Items.PINK_DYE).output(0.05F, Items.RED_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.SCILLA, (transform) -> transform.duration(50).output(Items.LIGHT_BLUE_DYE, 2).output(0.10F, Items.LIGHT_BLUE_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.TWILIGHT_ORCHID, (transform) -> transform.duration(50).output(Items.PURPLE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.SUNSET_ORCHID, (transform) -> transform.duration(50).output(Items.ORANGE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.MORNING_ORCHID, (transform) -> transform.duration(50).output(Items.YELLOW_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.DAWN_ORCHID, (transform) -> transform.duration(50).output(Items.WHITE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.PINK_HYACINTH, (transform) -> transform.duration(50).output(Items.PINK_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.BLUE_HYACINTH, (transform) -> transform.duration(50).output(Items.BLUE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.YELLOW_HYACINTH, (transform) -> transform.duration(50).output(Items.YELLOW_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.BLACK_HYACINTH, (transform) -> transform.duration(50).output(Items.BLACK_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.THORN_BLOSSOM, (transform) -> transform.duration(100).output(Items.BROWN_DYE, 2).output(0.25F, Items.BROWN_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.STONETTE, (transform) -> transform.duration(100).output(Items.GRAY_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.ORANGE_COSMOS, (transform) -> transform.duration(50).output(Items.ORANGE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.WHITE_COSMOS, (transform) -> transform.duration(50).output(Items.WHITE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.PINK_COSMOS, (transform) -> transform.duration(50).output(Items.PINK_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.CHOCOLATE_COSMOS, (transform) -> transform.duration(50).output(Items.BROWN_DYE).output(0.05F, Items.GREEN_DYE), consumer);
        createDyeFromMillingFlowerRecipe(FloralBlocks.LUNULA, (transform) -> transform.duration(50).output(Items.BLUE_DYE).output(0.05F, Items.GREEN_DYE), consumer);
    }

    private static void createDyeFromFlowerRecipe(ItemLike flower, ItemLike dye, int count, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dye, count).requires(flower).unlockedBy(getHasName(flower), has(flower)).save(consumer, new ResourceLocation(FloralFlair.MOD_ID, "crafting/" + getItemName(dye) + "_from_" + getItemName(flower)));
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

    private static void createDyeFromMillingFlowerRecipe(Supplier<Block> flower, UnaryOperator<ProcessingRecipeBuilder<MillingRecipe>> transform, Consumer<FinishedRecipe> consumer) {
        ProcessingRecipeSerializer serializer = AllRecipeTypes.MILLING.getSerializer();
        CreateRecipeProvider.GeneratedRecipe generatedRecipe = (consumer1) -> {
            ((ProcessingRecipeBuilder)transform.apply(new ProcessingRecipeBuilder(serializer.getFactory(), new ResourceLocation(FloralFlair.MOD_ID, getItemName(flower.get()))).withItemIngredients(Ingredient.of(flower.get())).whenModLoaded("create"))).build(consumer1);
        };
        generatedRecipe.register(consumer);
    }
}

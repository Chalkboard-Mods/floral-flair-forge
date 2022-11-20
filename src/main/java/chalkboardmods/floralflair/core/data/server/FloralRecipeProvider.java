package chalkboardmods.floralflair.core.data.server;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
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
        createDyeFromFlowerRecipe(FloralBlocks.SUNSET_POPPY.get(), Items.ORANGE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.MUSCARI.get(), Items.CYAN_DYE, 2, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.PURPUREUM.get(), Items.MAGENTA_DYE, 2, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.SCILLA.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.MIDNIGHT_ORCHID.get(), Items.PURPLE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.HYACINTH.get(), Items.PINK_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.SNOWFALL_FLOWER.get(), Items.WHITE_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.SPIKED_TULIP.get(), Items.BROWN_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.STONNETE.get(), Items.GRAY_DYE, consumer);
        createDyeFromFlowerRecipe(FloralBlocks.LUNULA.get(), Items.BLUE_DYE, consumer);

        createDyeFromCuttingFlowersRecipe(FloralBlocks.FOXNIP.get(), Items.ORANGE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.FROSTED_FOXNIP.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.PULSE_PETAL.get(), Items.RED_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.JUNGLE_GEM.get(), Items.YELLOW_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.ROSE.get(), Items.RED_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.SUNSET_POPPY.get(), Items.ORANGE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.SCILLA.get(), Items.LIGHT_BLUE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.MIDNIGHT_ORCHID.get(), Items.PURPLE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.HYACINTH.get(), Items.PINK_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.SNOWFALL_FLOWER.get(), Items.WHITE_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.SPIKED_TULIP.get(), Items.BROWN_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.STONNETE.get(), Items.GRAY_DYE, consumer);
        createDyeFromCuttingFlowersRecipe(FloralBlocks.LUNULA.get(), Items.BLUE_DYE, consumer);
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

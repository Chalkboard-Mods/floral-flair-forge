package com.chalkboardmods.floral_flair.core.data.client;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class FloralItemModelProvider extends ItemModelProvider {
    public FloralItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FloralFlair.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(FloralBlocks.FOXNIP);
        basicItem(FloralBlocks.FROSTED_FOXNIP);
        basicItem(FloralBlocks.PULSE_PETAL);
        basicItemWithModifier(FloralBlocks.FAIRY_BLOSSOM, "top");
        basicItem(FloralBlocks.JUNGLE_GEM);
        basicItem(FloralBlocks.ROSE);
        basicItem(FloralBlocks.MUSCARI);
        basicItemWithModifier(FloralBlocks.PURPUREUM, "top");
        basicItem(FloralBlocks.SCILLA);
        basicItem(FloralBlocks.TWILIGHT_ORCHID);
        basicItem(FloralBlocks.SUNSET_ORCHID);
        basicItem(FloralBlocks.MORNING_ORCHID);
        basicItem(FloralBlocks.DAWN_ORCHID);
        basicItem(FloralBlocks.PINK_HYACINTH);
        basicItem(FloralBlocks.BLUE_HYACINTH);
        basicItem(FloralBlocks.YELLOW_HYACINTH);
        basicItem(FloralBlocks.BLACK_HYACINTH);
        basicItemWithModifier(FloralBlocks.THORN_BLOSSOM, "top");
        basicItem(FloralBlocks.STONETTE);
        basicItem(FloralBlocks.LUNULA);
        basicItem(FloralBlocks.ORANGE_COSMOS);
        basicItem(FloralBlocks.WHITE_COSMOS);
        basicItem(FloralBlocks.PINK_COSMOS);
        basicItem(FloralBlocks.CHOCOLATE_COSMOS);
    }

    public void basicItem(String path) {
        withExistingParent(path, new ResourceLocation("item/generated")).texture("layer0", new ResourceLocation(FloralFlair.MOD_ID,"block/" + path));
    }

    public void basicItem(Supplier<? extends Block> block) {
        basicItem(ForgeRegistries.ITEMS.getKey(block.get().asItem()).getPath());
    }

    public void basicItemWithModifier(String path, String modifier) {
        withExistingParent(path, new ResourceLocation("item/generated")).texture("layer0", new ResourceLocation(FloralFlair.MOD_ID, "block/" + path + "_" + modifier));
    }

    public void basicItemWithModifier(Supplier<? extends Block> block, String modifier) {
        basicItemWithModifier(ForgeRegistries.ITEMS.getKey(block.get().asItem()).getPath(), modifier);
    }
}

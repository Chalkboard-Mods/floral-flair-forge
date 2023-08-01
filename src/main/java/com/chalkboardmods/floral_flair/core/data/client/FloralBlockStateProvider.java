package com.chalkboardmods.floral_flair.core.data.client;

import com.chalkboardmods.floral_flair.common.FloralProperties;
import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class FloralBlockStateProvider extends BlockStateProvider {
    public FloralBlockStateProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, FloralFlair.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        crossModelBlock(FloralBlocks.FOXNIP);
        crossModelBlock(FloralBlocks.FROSTED_FOXNIP);
        crossModelBlock(FloralBlocks.PULSE_PETAL);
        crossModelBlock(FloralBlocks.JUNGLE_GEM);
        crossModelBlock(FloralBlocks.ROSE);
        crossModelBlock(FloralBlocks.SCILLA);
        crossModelBlock(FloralBlocks.TWILIGHT_ORCHID);
        crossModelBlock(FloralBlocks.SUNSET_ORCHID);
        crossModelBlock(FloralBlocks.MORNING_ORCHID);
        crossModelBlock(FloralBlocks.DAWN_ORCHID);
        crossModelBlock(FloralBlocks.PINK_HYACINTH);
        crossModelBlock(FloralBlocks.BLUE_HYACINTH);
        crossModelBlock(FloralBlocks.YELLOW_HYACINTH);
        crossModelBlock(FloralBlocks.BLACK_HYACINTH);
        crossModelBlock(FloralBlocks.STONETTE);
        crossModelBlock(FloralBlocks.ORANGE_COSMOS);
        crossModelBlock(FloralBlocks.WHITE_COSMOS);
        crossModelBlock(FloralBlocks.PINK_COSMOS);
        crossModelBlock(FloralBlocks.CHOCOLATE_COSMOS);
        crossModelBlock(FloralBlocks.MUSCARI);
        tallFlowerBlock(FloralBlocks.FAIRY_BLOSSOM);
        tallFlowerBlock(FloralBlocks.PURPUREUM);
        tallFlowerBlock(FloralBlocks.THORN_BLOSSOM);
        lunulaBlock();

        pottedFlowerBlock(FloralBlocks.POTTED_FOXNIP);
        pottedFlowerBlock(FloralBlocks.POTTED_FROSTED_FOXNIP);
        pottedFlowerBlock(FloralBlocks.POTTED_PULSE_PETAL);
        pottedFlowerBlock(FloralBlocks.POTTED_JUNGLE_GEM);
        pottedFlowerBlock(FloralBlocks.POTTED_ROSE);
        pottedFlowerBlock(FloralBlocks.POTTED_SCILLA);
        pottedFlowerBlock(FloralBlocks.POTTED_TWILIGHT_ORCHID);
        pottedFlowerBlock(FloralBlocks.POTTED_SUNSET_ORCHID);
        pottedFlowerBlock(FloralBlocks.POTTED_MORNING_ORCHID);
        pottedFlowerBlock(FloralBlocks.POTTED_DAWN_ORCHID);
        pottedFlowerBlock(FloralBlocks.POTTED_PINK_HYACINTH);
        pottedFlowerBlock(FloralBlocks.POTTED_BLUE_HYACINTH);
        pottedFlowerBlock(FloralBlocks.POTTED_YELLOW_HYACINTH);
        pottedFlowerBlock(FloralBlocks.POTTED_BLACK_HYACINTH);
        pottedFlowerBlock(FloralBlocks.POTTED_STONETTE);
        pottedFlowerBlock(FloralBlocks.POTTED_ORANGE_COSMOS);
        pottedFlowerBlock(FloralBlocks.POTTED_WHITE_COSMOS);
        pottedFlowerBlock(FloralBlocks.POTTED_PINK_COSMOS);
        pottedFlowerBlock(FloralBlocks.POTTED_CHOCOLATE_COSMOS);
        pottedFlowerBlock(FloralBlocks.POTTED_MUSCARI);
        pottedLunulaBlock();
    }

    public void crossModelBlock(Supplier<? extends Block> block) {
        ModelFile file = models().cross(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath())).renderType("cutout");

        simpleBlock(block.get(), file);
    }

    public void tallFlowerBlock(Supplier<? extends Block> block) {
        ModelFile top = models().cross(ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_top", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_top")).renderType("cutout");
        ModelFile bottom = models().cross(ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom")).renderType("cutout");

        getVariantBuilder(block.get()).forAllStates((blockState) -> {
            ModelFile file;

            if (blockState.getValue(DoublePlantBlock.HALF).equals(DoubleBlockHalf.UPPER)) {
                file = top;
            }
            else {
                file = bottom;
            }
            return ConfiguredModel.builder()
                    .modelFile(file)
                    .build();
        });
    }

    public void lunulaBlock() {
        Block block = FloralBlocks.LUNULA.get();

        ModelFile lunula = models().cross(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block).getPath())).renderType("cutout");
        ModelFile open_0 = models().cross(ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_0", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_0")).renderType("cutout");
        ModelFile open_1 = models().cross(ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_1", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_1")).renderType("cutout");
        ModelFile open_2 = models().cross(ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_2", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_2")).renderType("cutout");

        getVariantBuilder(block).forAllStates((state) -> {
            ModelFile file = null;
            int time = state.getValue(FloralProperties.TIME);

            if (time == 0) {
                file = lunula;
            }
            if (time == 1) {
                file = open_0;
            }
            if (time == 2) {
                file = open_1;
            }
            if (time == 3) {
                file = open_2;
            }

            return ConfiguredModel.builder()
                    .modelFile(file)
                    .build();
        });
    }

    public void pottedFlowerBlock(Supplier<? extends Block> potBlock) {
        Supplier<FlowerPotBlock> block = () -> (FlowerPotBlock) potBlock.get();

        ModelFile file = models().withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), "minecraft:block/flower_pot_cross").texture("plant", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.get().getContent()).getPath())).renderType("cutout");

        simpleBlock(block.get(), file);
    }

    public void pottedLunulaBlock() {
        FlowerPotBlock block = (FlowerPotBlock) FloralBlocks.POTTED_LUNULA.get();

        ModelFile lunula = models().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), "minecraft:block/flower_pot_cross").texture("plant", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.getContent()).getPath())).renderType("cutout");
        ModelFile open_0 = models().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_0", "minecraft:block/flower_pot_cross").texture("plant", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.getContent()).getPath() + "_open_0")).renderType("cutout");
        ModelFile open_1 = models().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_1", "minecraft:block/flower_pot_cross").texture("plant", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.getContent()).getPath() + "_open_1")).renderType("cutout");
        ModelFile open_2 = models().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath() + "_open_2", "minecraft:block/flower_pot_cross").texture("plant", new ResourceLocation(FloralFlair.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + ForgeRegistries.BLOCKS.getKey(block.getContent()).getPath() + "_open_2")).renderType("cutout");

        getVariantBuilder(block).forAllStates((state) -> {
            ModelFile file = null;
            int time = state.getValue(FloralProperties.TIME);

            if (time == 0) {
                file = lunula;
            }
            if (time == 1) {
                file = open_0;
            }
            if (time == 2) {
                file = open_1;
            }
            if (time == 3) {
                file = open_2;
            }

            return ConfiguredModel.builder()
                    .modelFile(file)
                    .build();
        });
    }
}

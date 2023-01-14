package com.chalkboardmods.floral_flair.common.feature;

import com.chalkboardmods.floral_flair.common.block.ThornBlossomBlock;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;

public class ThornBlossomFeature extends Feature<SimpleBlockConfiguration> {
    public ThornBlossomFeature(Codec<SimpleBlockConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<SimpleBlockConfiguration> context) {
        SimpleBlockConfiguration simpleBlockConfiguration = context.config();
        WorldGenLevel worldGenLevel = context.level();
        BlockPos blockPos = context.origin();
        BlockState state = simpleBlockConfiguration.toPlace().getState(context.random(), blockPos);

        if (state.canSurvive(worldGenLevel, blockPos)) {
            if (state.getBlock() instanceof ThornBlossomBlock) {
                if (!worldGenLevel.isEmptyBlock(blockPos.below())) {
                    return false;
                }

                ThornBlossomBlock.placeAt(worldGenLevel, state, blockPos, 2);
            }

            return true;
        } else {
            return false;
        }
    }
}

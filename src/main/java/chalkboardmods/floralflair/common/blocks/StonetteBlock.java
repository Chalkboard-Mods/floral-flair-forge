package chalkboardmods.floralflair.common.blocks;


import com.teamabnormals.blueprint.common.block.BlueprintFlowerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class StonetteBlock extends BlueprintFlowerBlock {

    public StonetteBlock(Supplier<MobEffect> stewEffect, int stewEffectDuration, Properties properties) {
        super(stewEffect, stewEffectDuration, properties);
    }
    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(BlockTags.BASE_STONE_OVERWORLD);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader reader, BlockPos pos) {
        BlockPos below = pos.below();
        return this.mayPlaceOn(reader.getBlockState(below), reader, pos);
    }
}

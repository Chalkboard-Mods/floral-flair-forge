package chalkboardmods.floralflair.common.blocks;


import com.teamabnormals.blueprint.common.block.BlueprintFlowerBlock;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING;

public class AnthuriumBlock extends BlueprintFlowerBlock {


    public AnthuriumBlock(Supplier<MobEffect> stewEffect, int stewEffectDuration, Properties properties) {
        super(stewEffect, stewEffectDuration, properties);
    }
    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateManager){
        super.createBlockStateDefinition(stateManager);
        stateManager.add(HORIZONTAL_FACING);
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(HORIZONTAL_FACING, ctx.getHorizontalDirection().getOpposite());
    }
}

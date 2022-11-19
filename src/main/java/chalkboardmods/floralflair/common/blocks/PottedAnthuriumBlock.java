package chalkboardmods.floralflair.common.blocks;


import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING;

public class PottedAnthuriumBlock extends FlowerPotBlock {


    public PottedAnthuriumBlock(Block p_53528_, Properties p_53529_) {
        super(p_53528_, p_53529_);

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

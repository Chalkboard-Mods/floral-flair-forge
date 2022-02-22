package chalkboardmods.floralflair.common.blocks;


import chalkboardmods.floralflair.core.registry.FloralBlocks;
import com.teamabnormals.blueprint.common.block.BlueprintFlowerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.FACING;

public class AnthuriumBlock extends BlueprintFlowerBlock {


    public AnthuriumBlock(Supplier<MobEffect> stewEffect, int stewEffectDuration, Properties properties) {
        super(stewEffect, stewEffectDuration, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, getRandomDirection()));
    }
    public Direction getRandomDirection() {
        Random random = new Random();
        Direction[] d = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
        int e = random.nextInt(d.length);
        return d[e];
    }
    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateManager){
        super.createBlockStateDefinition(stateManager);
        stateManager.add(FACING);
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }
}

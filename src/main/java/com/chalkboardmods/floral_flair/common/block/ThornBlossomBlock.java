package com.chalkboardmods.floral_flair.common.block;


import com.teamabnormals.blueprint.core.util.item.filling.TargetedItemCategoryFiller;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.PlantType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ThornBlossomBlock extends BushBlock implements BonemealableBlock {
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    private static final TargetedItemCategoryFiller FILLER = new TargetedItemCategoryFiller(() -> Items.PEONY);

    public ThornBlossomBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.UPPER));
    }

    @Override
    @NotNull
    public BlockState updateShape(BlockState state, Direction facing, @NotNull BlockState facingState, @NotNull LevelAccessor level, @NotNull BlockPos currentPos, @NotNull BlockPos facingPos) {
        DoubleBlockHalf doubleblockhalf = state.getValue(HALF);
        if (facing.getAxis() != Direction.Axis.Y || doubleblockhalf == DoubleBlockHalf.UPPER != (facing == Direction.DOWN) || facingState.is(this) && facingState.getValue(HALF) != doubleblockhalf) {
            return doubleblockhalf == DoubleBlockHalf.UPPER && facing == Direction.UP && !state.canSurvive(level, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, level, currentPos, facingPos);
        } else {
            return Blocks.AIR.defaultBlockState();
        }
    }

    @Override
    public boolean canSurvive(BlockState pState, @NotNull LevelReader level, @NotNull BlockPos pPos) {
        if (pState.getValue(HALF) != DoubleBlockHalf.LOWER) {
            return secondSurvivalCheck(pState, level, pPos);
        } else {
            BlockState blockstate = level.getBlockState(pPos.above());
            if (pState.getBlock() != this) return secondSurvivalCheck(pState, level, pPos);

            return blockstate.is(this) && blockstate.getValue(HALF) == DoubleBlockHalf.UPPER;
        }
    }

    private boolean secondSurvivalCheck(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.above();
        if (state.getBlock() == this)
            return level.getBlockState(blockpos).canSustainPlant(level, blockpos, Direction.DOWN, this);
        return this.mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        Level level = context.getLevel();
        return blockpos.getY() > level.getMinBuildHeight() + 1 && level.getBlockState(blockpos.below()).canBeReplaced(context) ? super.getStateForPlacement(context) : null;
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, @NotNull BlockState state, @Nullable LivingEntity placer, @NotNull ItemStack stack) {
        BlockPos blockpos = pos.below();
        level.setBlock(blockpos, DoublePlantBlock.copyWaterloggedFrom(level, blockpos, this.defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER)), 3);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos) {
        return state.is(BlockTags.BASE_STONE_OVERWORLD) || state.is(Blocks.DRIPSTONE_BLOCK);
    }

    @Override
    public void playerWillDestroy(Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Player player) {
        if (!level.isClientSide) {
            if (player.isCreative()) {
                preventCreativeDropFromTopPart(level, pos, state, player);
            } else {
                dropResources(state, level, pos, (BlockEntity)null, player, player.getMainHandItem());
            }
        }

        super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HALF);
    }

    @Override
    @NotNull
    public OffsetType getOffsetType() {
        return BlockBehaviour.OffsetType.XZ;
    }

    @Override
    public long getSeed(BlockState state, BlockPos pos) {
        return Mth.getSeed(pos.getX(), pos.above(state.getValue(HALF) == DoubleBlockHalf.UPPER ? 0 : 1).getY(), pos.getZ());
    }

    protected static void preventCreativeDropFromTopPart(Level level, BlockPos pos, BlockState state, Player player) {
        DoubleBlockHalf doubleblockhalf = state.getValue(HALF);
        if (doubleblockhalf == DoubleBlockHalf.LOWER) {
            BlockPos blockpos = pos.above();
            BlockState blockstate = level.getBlockState(blockpos);
            if (blockstate.is(state.getBlock()) && blockstate.getValue(HALF) == DoubleBlockHalf.UPPER) {
                BlockState blockstate1 = blockstate.hasProperty(BlockStateProperties.WATERLOGGED) && blockstate.getValue(BlockStateProperties.WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
                level.setBlock(blockpos, blockstate1, 35);
                level.levelEvent(player, 2001, blockpos, Block.getId(blockstate));
            }
        }

    }

    public static void placeAt(LevelAccessor pLevel, BlockState pState, BlockPos pPos, int pFlags) {
        BlockPos blockpos = pPos.below();
        pLevel.setBlock(pPos, DoublePlantBlock.copyWaterloggedFrom(pLevel, pPos, pState.setValue(HALF, DoubleBlockHalf.UPPER)), pFlags);
        pLevel.setBlock(blockpos, DoublePlantBlock.copyWaterloggedFrom(pLevel, blockpos, pState.setValue(HALF, DoubleBlockHalf.LOWER)), pFlags);
    }

    @Override
    public boolean canBeReplaced(@NotNull BlockState state, @NotNull Fluid fluid) {
        return false;
    }

    @Override
    public boolean isValidBonemealTarget(@NotNull BlockGetter getter, @NotNull BlockPos pos, @NotNull BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(@NotNull Level level, @NotNull Random random, @NotNull BlockPos pos, @NotNull BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull Random random, @NotNull BlockPos pos, @NotNull BlockState state) {
        popResource(level, pos, new ItemStack(this));
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return null;
    }

    @Override
    public void fillItemCategory(@NotNull CreativeModeTab group, @NotNull NonNullList<ItemStack> items) {
        FILLER.fillItem(this.asItem(), group, items);
    }
}

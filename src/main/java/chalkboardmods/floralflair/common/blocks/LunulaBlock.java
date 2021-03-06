package chalkboardmods.floralflair.common.blocks;

import chalkboardmods.floralflair.common.FloralProperties;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
import com.teamabnormals.blueprint.common.block.BlueprintFlowerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Supplier;

public class LunulaBlock extends BlueprintFlowerBlock {
    public static final IntegerProperty TIME = FloralProperties.TIME;
    public LunulaBlock(Supplier<MobEffect> stewEffect, int stewEffectDuration, Properties properties) {
        super(stewEffect, stewEffectDuration, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(TIME, 0));
    }
    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateManager){
        super.createBlockStateDefinition(stateManager);
        stateManager.add(TIME);
    }
    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }
    @Override
    public void setPlacedBy(Level world, BlockPos pos, BlockState state, @Nullable LivingEntity p_49850_, ItemStack p_49851_) {
        world.setBlockAndUpdate(pos, FloralBlocks.LUNULA.get().defaultBlockState().setValue(TIME, getLunulaState(world)));
    }
    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
        world.setBlockAndUpdate(pos, FloralBlocks.LUNULA.get().defaultBlockState().setValue(TIME, getLunulaState(world)));


    }
    private int getLunulaState(Level world) {
        long i = world.getDayTime();
        int state = 0;
        if (i > 24000L) {
            i = i % 24000L;
        }
        if (i > 0L && i < 8200L){
            state = 0;
        }
        else if (i > 8200L && i < 12786L) {
            state = 1;
        }
        else if (i > 12786L && i < 13670L){
            state = 2;
        }
        else if (i > 13670L && i < 22331L){
            state = 3;
        }
        else if (i > 22331L && i < 23300L){
            state = 2;
        }
        else if (i > 23300L && i < 23900L){
            state = 1;
        }
        else if (i > 23900L && i < 24000L){
            state = 0;
        }
        return state;
    }

}

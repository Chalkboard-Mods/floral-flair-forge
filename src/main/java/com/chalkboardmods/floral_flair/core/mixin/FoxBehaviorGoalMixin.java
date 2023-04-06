package com.chalkboardmods.floral_flair.core.mixin;

import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.animal.Fox;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(Fox.FoxBehaviorGoal.class)
public abstract class FoxBehaviorGoalMixin extends Goal {
    @Unique
    private Fox fox;

    @Inject(method = "<init>", at = @At("RETURN"), cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    public void init(Fox fox, CallbackInfo ci) {
        this.fox = fox;
    }

    @Inject(method = "hasShelter", at = @At("RETURN"), cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    public void hasShelter(CallbackInfoReturnable<Boolean> cir, BlockPos blockpos) {
        if (true) {
            cir.setReturnValue(cir.getReturnValue() || (fox.level.getBlockState(blockpos).is(FloralBlocks.FOXNIP.get()) || fox.level.getBlockState(blockpos).is(FloralBlocks.FROSTED_FOXNIP.get())) && fox.getWalkTargetValue(blockpos) >= 0.0F);
        }
    }
}

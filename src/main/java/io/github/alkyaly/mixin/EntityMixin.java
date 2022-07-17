package io.github.alkyaly.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.scores.Team;

@Mixin(Entity.class)
public class EntityMixin {
    //@Inject(at = @At("TAIL"), method = "getBlockSpeedFactor", locals = LocalCapture.CAPTURE_FAILHARD)
    //private void aaa(CallbackInfoReturnable<Float> cir, BlockState blockState, float f) {
    //}

    @Inject(at = @At("RETURN"), method = "getTeamColor", locals = LocalCapture.CAPTURE_FAILHARD)
    private void aaaColor(CallbackInfoReturnable<Integer> cir, Team team) {
    }
}

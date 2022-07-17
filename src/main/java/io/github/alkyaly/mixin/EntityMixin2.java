package io.github.alkyaly.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.entity.Entity;

@Mixin(value = Entity.class, priority = 999)
public class EntityMixin2 {
    //@Inject(at = @At("TAIL"), method = "getBlockSpeedFactor")
    //private void bbb(CallbackInfoReturnable<Integer> cir) {
    //}

    @Inject(at = @At("RETURN"), method = "getTeamColor")
    private void bbbColor(CallbackInfoReturnable<Integer> cir) {
    }
}

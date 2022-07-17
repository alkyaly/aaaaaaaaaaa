package io.github.alkyaly.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.multiplayer.ClientPacketListener;

@Mixin(value = ClientPacketListener.class, priority = 1)
public class ClientPacketListenerMixin2 {
    //@Inject(
    //        method = "handleAddEntity",
    //        at = @At("RETURN")
    //)
    //private void hookOnEntitySpawn2(ClientboundAddEntityPacket packet, CallbackInfo ci) {
    //}
}

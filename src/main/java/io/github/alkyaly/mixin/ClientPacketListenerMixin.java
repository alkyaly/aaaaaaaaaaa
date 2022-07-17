package io.github.alkyaly.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.world.entity.EntityType;

@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {
   // @Inject(
   //         method = "handleAddEntity",
   //         at = @At("RETURN"),
   //         locals = LocalCapture.CAPTURE_FAILHARD
   // )
   // private void hookOnEntitySpawn(ClientboundAddEntityPacket packet, CallbackInfo ci, EntityType<?> entityType) {
   // }
}

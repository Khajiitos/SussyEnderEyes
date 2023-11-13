package me.khajiitos.sussyendereyes.common.mixin;

import me.khajiitos.sussyendereyes.common.SussyEnderEyes;
import net.minecraft.client.renderer.LevelRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {

    @ModifyArg(at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/ClientLevel;playLocalSound(Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V", ordinal = 37), method = "levelEvent", index = 4)
    public float enderEyePitch(float originalPitch) {
        if (System.currentTimeMillis() - SussyEnderEyes.lastTimePlayed > 10000) {
            SussyEnderEyes.currentTuneStage = 0;
        }

        float pitch = SussyEnderEyes.melodyNotes[SussyEnderEyes.currentTuneStage];

        SussyEnderEyes.currentTuneStage = (SussyEnderEyes.currentTuneStage + 1) % SussyEnderEyes.melodyNotes.length;
        SussyEnderEyes.lastTimePlayed = System.currentTimeMillis();

        return pitch;
    }
}

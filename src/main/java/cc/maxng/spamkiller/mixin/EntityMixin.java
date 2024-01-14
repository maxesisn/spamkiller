package cc.maxng.spamkiller.mixin;

import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Unique
    private static final Logger forge_1_18_2_40_2_1_mdk$LOGGER = LogUtils.getLogger();

    @Inject(method = "setYRot", at = @At("HEAD"), cancellable = true)
    private void onSetYRot(float p_146923_, CallbackInfo ci) {
        if (!Float.isFinite(p_146923_)) {
            forge_1_18_2_40_2_1_mdk$LOGGER.info("Mixin onSetYRot applied: Invalid Y rotation detected and discarded.");
            ci.cancel();
        }
    }

    @Inject(method = "setXRot", at = @At("HEAD"), cancellable = true)
    private void onSetXRot(float p_146927_, CallbackInfo ci) {
        if (!Float.isFinite(p_146927_)) {
            forge_1_18_2_40_2_1_mdk$LOGGER.info("Mixin onSetXRot applied: Invalid X rotation detected and discarded.");
            ci.cancel();
        }
    }
}

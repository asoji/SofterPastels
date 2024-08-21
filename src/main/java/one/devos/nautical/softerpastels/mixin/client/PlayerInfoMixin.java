// --------------------------------------------------------------------------------
// This code was taken from Create Steam n' Rails  under the MIT license
// and with permission from one of the developers, thank you for that!
//
// Check em out here https://github.com/Layers-of-Railways/Railway
// Original Source: https://github.com/Layers-of-Railways/Railway/blob/1.20/dev/common/src/main/java/com/railwayteam/railways/mixin/client/MixinPlayerInfo.java
// --------------------------------------------------------------------------------

package one.devos.nautical.softerpastels.mixin.client;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.PlayerSkin;
import net.minecraft.resources.ResourceLocation;
import one.devos.nautical.softerpastels.SofterPastels;
import one.devos.nautical.softerpastels.utils.CapeUtils;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;
import java.util.function.Supplier;

@Mixin(value = PlayerInfo.class, priority = 1100)
public class PlayerInfoMixin {
    @Unique
    private static final ResourceLocation DEV_CAPE = ResourceLocation.tryBuild(SofterPastels.MOD_ID, "textures/misc/cape.png");
    @Shadow
    @Final
    private GameProfile profile;
    @Mutable
    @Shadow
    @Final
    private Supplier<PlayerSkin> skinLookup;
    @Unique
    private boolean softerpastels$texturesLoaded;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void replaceSkinInfoIfNeeded(GameProfile gameProfile, boolean bl, CallbackInfo ci) {
        if (!softerpastels$texturesLoaded && CapeUtils.INSTANCE.useDevCape(profile.getId())) {
            softerpastels$texturesLoaded = true;
            var original = this.skinLookup;
            this.skinLookup = () -> {
                var originalResult = original.get();
                return new PlayerSkin(originalResult.texture(), originalResult.textureUrl(), DEV_CAPE, originalResult.elytraTexture(), originalResult.model(), originalResult.secure());
            };
        }
    }

    @Inject(method = "getSkin", at = @At("RETURN"), cancellable = true)
    private void replaceSkinCapeIfNeeded(CallbackInfoReturnable<PlayerSkin> cir) {
        var skin = cir.getReturnValue();

        if (Objects.equals(DEV_CAPE, skin.capeTexture()) && !CapeUtils.INSTANCE.useDevCape(profile.getId())) {
            var playerSkin = new PlayerSkin(skin.texture(), skin.textureUrl(), null, skin.elytraTexture(), skin.model(), skin.secure());

            this.skinLookup = () -> playerSkin;
            cir.setReturnValue(playerSkin);
        }
    }
}

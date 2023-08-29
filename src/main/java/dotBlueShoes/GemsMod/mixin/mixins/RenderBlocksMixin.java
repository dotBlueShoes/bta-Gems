package dotBlueShoes.GemsMod.mixin.mixins;

import dotBlueShoes.GemsMod.Global;
import net.minecraft.client.render.RenderBlocks;
import net.minecraft.core.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderBlocks.class)
public class RenderBlocksMixin {

	@Inject(method = "renderBottomFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderBottomFace(Block block, double d, double d1, double d2, int i, CallbackInfo ci) {
		//Global.LOGGER.info("BottomFace");
		ci.cancel();
	}

	@Inject(method = "renderTopFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderTopFace(Block block, double d, double d1, double d2, int i, CallbackInfo ci) {
		//Global.LOGGER.info("BottomFace");
		ci.cancel();
	}

	@Inject(method = "renderEastFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderEastFace(Block block, double d, double d1, double d2, int i, CallbackInfo ci) {
		//Global.LOGGER.info("BottomFace");
		ci.cancel();
	}

	@Inject(method = "renderWestFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderWestFace(Block block, double d, double d1, double d2, int i, CallbackInfo ci) {
		//Global.LOGGER.info("BottomFace");
		ci.cancel();
	}

	@Inject(method = "renderSouthFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderSouthFace(Block block, double d, double d1, double d2, int i, CallbackInfo ci) {
		//Global.LOGGER.info("BottomFace");
		ci.cancel();
	}

	@Inject(method = "renderNorthFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderNorthFace(Block block, double d, double d1, double d2, int i, CallbackInfo ci) {
		//Global.LOGGER.info("BottomFace");
		ci.cancel();
	}

}

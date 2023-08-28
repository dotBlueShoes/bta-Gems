package dotBlueShoes.GemsMod.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.render.ItemRenderer;
import net.minecraft.client.render.RenderBlocks;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.TextureFX;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.item.ItemStack;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// About
// - Renders item in player hand.

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

	@Shadow(remap = false)
	private RenderBlocks renderBlocksInstance;
	@Shadow(remap = false)
	private Minecraft mc;


	//@Inject(method = "renderItem", at = @At("HEAD"), cancellable = true, remap = false)
	//public void renderItem(CallbackInfo ci) {
	//	// We're overriding a whole method this way.
	//	ci.cancel();
	//}


	// This renders item in the hand.

	@Inject(
		method = "renderItem(Lnet/minecraft/core/entity/Entity;Lnet/minecraft/core/item/ItemStack;Z)V",
		at = @At(
			value = "HEAD"
		),
		cancellable = true, remap = false
	)
	public void renderItem(Entity entity, ItemStack itemstack, boolean handheldTransform, CallbackInfo ci) {
		GL11.glPushMatrix();
		BlockModelRenderBlocks.setRenderBlocks(this.renderBlocksInstance);

		if (itemstack.itemID < Block.blocksList.length && ((BlockModel) BlockModelDispatcher.getInstance().getDispatch(Block.blocksList[itemstack.itemID])).shouldItemRender3d()) {
			GL11.glEnable(3042);
			GL11.glBlendFunc(770, 771);
			GL11.glBindTexture(3553, this.mc.renderEngine.getTexture("/terrain.png"));
			float brightness = entity.getBrightness(1.0f);
			if (this.mc.fullbright) {
				brightness = 1.0f;
			}
			this.renderBlocksInstance.renderBlockOnInventory(Block.blocksList[itemstack.itemID], itemstack.getMetadata(), brightness);
			GL11.glDisable(3042);
		} else {
			int tileWidth;

			if (itemstack.itemID < Block.blocksList.length) {
				GL11.glBindTexture(3553, this.mc.renderEngine.getTexture("/terrain.png"));
				tileWidth = TextureFX.tileWidthTerrain;
			} else {
				GL11.glBindTexture(3553, this.mc.renderEngine.getTexture("/gui/items.png"));
				tileWidth = TextureFX.tileWidthItems;
			}

			Tessellator tessellator = Tessellator.instance;
			int i = itemstack.getItem().getIconIndex(itemstack);

			if (entity instanceof EntityLiving) {
				i = ((EntityLiving)entity).getItemIcon(itemstack);
			}

			float f = ((float)(i % Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth) + 0.0f) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);
			float f1 = ((float)(i % Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth) + ((float)tileWidth - 0.01f)) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);
			float f2 = ((float)(i / Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth) + 0.0f) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);
			float f3 = ((float)(i / Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth) + ((float)tileWidth - 0.01f)) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);
			float f4 = 1.0f;
			float f5 = 0.0f;
			float f6 = 0.3f;

			float foon = 0.5f / (float)tileWidth / (float)Global.TEXTURE_ATLAS_WIDTH_TILES;
			float goon = 0.0625f * (16.0f / (float)tileWidth);

			GL11.glEnable(32826);

			if (handheldTransform) {
				GL11.glTranslatef(-f5, -f6, 0.0f);
				float f7 = 1.5f;
				GL11.glScalef(f7, f7, f7);
				GL11.glRotatef(50.0f, 0.0f, 1.0f, 0.0f);
				GL11.glRotatef(335.0f, 0.0f, 0.0f, 1.0f);
				GL11.glTranslatef(-0.9375f, -0.0625f, 0.0f);
			}

			float thickness = 0.0625f;
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0f, 0.0f, 1.0f);
			tessellator.addVertexWithUV(0.0, 0.0, 0.0, f1, f3);
			tessellator.addVertexWithUV(f4, 0.0, 0.0, f, f3);
			tessellator.addVertexWithUV(f4, 1.0, 0.0, f, f2);
			tessellator.addVertexWithUV(0.0, 1.0, 0.0, f1, f2);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0f, 0.0f, -1.0f);
			tessellator.addVertexWithUV(0.0, 1.0, 0.0f - thickness, f1, f2);
			tessellator.addVertexWithUV(f4, 1.0, 0.0f - thickness, f, f2);
			tessellator.addVertexWithUV(f4, 0.0, 0.0f - thickness, f, f3);
			tessellator.addVertexWithUV(0.0, 0.0, 0.0f - thickness, f1, f3);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(-1.0f, 0.0f, 0.0f);

			for (int j = 0; j < tileWidth; ++j) {
				float f9 = (float)j / (float)tileWidth;
				float f13 = f1 + (f - f1) * f9 - foon;
				float f17 = f4 * f9;
				tessellator.addVertexWithUV(f17, 0.0, 0.0f - thickness, f13, f3);
				tessellator.addVertexWithUV(f17, 0.0, 0.0, f13, f3);
				tessellator.addVertexWithUV(f17, 1.0, 0.0, f13, f2);
				tessellator.addVertexWithUV(f17, 1.0, 0.0f - thickness, f13, f2);
			}

			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(1.0f, 0.0f, 0.0f);

			for (int k = 0; k < tileWidth; ++k) {
				float f10 = (float)k / (float)tileWidth;
				float f14 = f1 + (f - f1) * f10 - foon;
				float f18 = f4 * f10 + goon;
				tessellator.addVertexWithUV(f18, 1.0, 0.0f - thickness, f14, f2);
				tessellator.addVertexWithUV(f18, 1.0, 0.0, f14, f2);
				tessellator.addVertexWithUV(f18, 0.0, 0.0, f14, f3);
				tessellator.addVertexWithUV(f18, 0.0, 0.0f - thickness, f14, f3);
			}

			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0f, 1.0f, 0.0f);

			for (int l = 0; l < tileWidth; ++l) {
				float f11 = (float)l / (float)tileWidth;
				float f15 = f3 + (f2 - f3) * f11 - foon;
				float f19 = f4 * f11 + goon;
				tessellator.addVertexWithUV(0.0, f19, 0.0, f1, f15);
				tessellator.addVertexWithUV(f4, f19, 0.0, f, f15);
				tessellator.addVertexWithUV(f4, f19, 0.0f - thickness, f, f15);
				tessellator.addVertexWithUV(0.0, f19, 0.0f - thickness, f1, f15);
			}

			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0f, -1.0f, 0.0f);

			for (int i1 = 0; i1 < tileWidth; ++i1) {
				float f12 = (float)i1 / (float)tileWidth;
				float f16 = f3 + (f2 - f3) * f12 - foon;
				float f20 = f4 * f12;
				tessellator.addVertexWithUV(f4, f20, 0.0, f, f16);
				tessellator.addVertexWithUV(0.0, f20, 0.0, f1, f16);
				tessellator.addVertexWithUV(0.0, f20, 0.0f - thickness, f1, f16);
				tessellator.addVertexWithUV(f4, f20, 0.0f - thickness, f, f16);
			}

			tessellator.draw();
			GL11.glDisable(32826);
		}

		GL11.glPopMatrix();

		// We're overriding a whole method this way.
		ci.cancel();
	}
}

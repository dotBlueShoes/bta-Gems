package dotBlueShoes.GemsMod.mixin.mixins;

import dotBlueShoes.GemsMod.util.RenderEngineHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.util.helper.MathHelper;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

import static dotBlueShoes.GemsMod.GemsModClient.LOGGER;

// ABOUT
//  - Renders items on ground.
//  - Renders items in hot-bar and drawItemIntoGui is needed for GuiRenderItem to work.

@Mixin(ItemEntityRenderer.class)
public abstract class ItemEntityRendererMixin extends EntityRenderer<EntityItem> {

	// This is the starting point.
	//  check for my item id
	//  get a different texture for it.
	//  see if it works here.

	@Shadow @Final
	private Random random;
	@Shadow @Final
	private RenderBlocks renderBlocks;
	@Shadow
	public boolean field_27004_a;
	@Shadow
	public abstract void renderTexturedQuad(int l, int i1, int i, int i2, int tileWidth, int tileWidth1);


	@Inject(
		//method = "doRenderItem(Lnet/minecraft/core/entity/Entity;DDDFF)V",
		method = "doRenderItem",
		at = @At(
			value = "HEAD"
		),
		cancellable = true, remap = false
	)
	public void doRenderItem(EntityItem entity, double d, double d1, double d2, float f, float f1, CallbackInfo ci) {

		this.random.setSeed(187L);
		ItemStack itemstack = entity.item;
		Item item = itemstack.getItem();

		if (item == null) {
			return;
		}

		GL11.glPushMatrix();

		float f2 = MathHelper.sin(((float)entity.age + f1) / 10.0f + entity.field_804_d) * 0.1f + 0.1f;
		float f3 = (((float)entity.age + f1) / 20.0f + entity.field_804_d) * 57.29578f;
		int renderCount = 1;

		if (entity.item.stackSize > 1) {
			renderCount = 2;
		}

		if (entity.item.stackSize > 5) {
			renderCount = 3;
		}

		if (entity.item.stackSize > 20) {
			renderCount = 4;
		}

		GL11.glTranslatef((float)d, (float)d1 + f2, (float)d2);
		GL11.glEnable(32826);

		if (itemstack.itemID < Block.blocksList.length && Block.blocksList[itemstack.itemID] != null && ((BlockModel) BlockModelDispatcher.getInstance().getDispatch(Block.blocksList[itemstack.itemID])).shouldItemRender3d()) {

			GL11.glRotatef(f3, 0.0f, 1.0f, 0.0f);

			this.loadTexture("/terrain.png");

			BlockModelRenderBlocks.setRenderBlocks(this.renderBlocks);
			BlockModel model = (BlockModel)BlockModelDispatcher.getInstance().getDispatch(Block.blocksList[itemstack.itemID]);
			float itemSize = model.getItemRenderScale();
			GL11.glScalef(itemSize, itemSize, itemSize);

			for (int j = 0; j < renderCount; ++j) {
				GL11.glPushMatrix();

				if (j > 0) {
					float f5 = (this.random.nextFloat() * 2.0f - 1.0f) * 0.2f / itemSize;
					float f7 = (this.random.nextFloat() * 2.0f - 1.0f) * 0.2f / itemSize;
					float f9 = (this.random.nextFloat() * 2.0f - 1.0f) * 0.2f / itemSize;
					GL11.glTranslatef(f5, f7, f9);
				}

				float f4 = entity.getBrightness(f1);

				if (Minecraft.getMinecraft((Object)this).fullbright) {
					f4 = 1.0f;
				}

				this.renderBlocks.renderBlockOnInventory(Block.blocksList[itemstack.itemID], itemstack.getMetadata(), f4);
				GL11.glPopMatrix();
			}

		} else {

			int tileWidth;
			GL11.glScalef(0.5f, 0.5f, 0.5f);

			float f6  = 0;
			float f8  = 0;
			float f10 = 0;
			float f11 = 0;

			if (itemstack.itemID < Block.blocksList.length) {
				this.loadTexture("/terrain.png");
				tileWidth = TextureFX.tileWidthTerrain;
			} else {
				if (itemstack.itemID == 17001) {
					//LOGGER.info("Got My Item!");

					String spriteAtlas = "/assets/" + dotBlueShoes.GemsMod.Global.MOD_ID + "/" + dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_IMAGE;
					//String spriteAtlas = dotBlueShoes.GemsMod.Global.MOD_ID + "/" + dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_IMAGE;

					RenderEngine renderEngine = this.renderDispatcher.renderEngine;
					int texture = RenderEngineHelper.getCustomTexture(renderEngine, spriteAtlas);
					//int texture = (RenderEngineMixin)renderEngine.getCustomTexture(spriteAtlas);
					renderEngine.bindTexture(texture);

					//this.loadTexture(spriteAtlas);

					tileWidth = 16; // FIXIT!!!
					// (0 % 10 * 16) / (10*16) -> 0 / 160 -> 0
					// 0 % 10*16 + 16 /
					int iconIndex = 15;
					f6  = (float)(iconIndex % dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_X * tileWidth) / (float)(dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_X * tileWidth);
					f8  = (float)(iconIndex % dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_X * tileWidth + tileWidth) / (float)(dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_X * tileWidth);
					f10 = (float)(iconIndex / dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_Y * tileWidth) / (float)(dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_Y * tileWidth);
					f11 = (float)(iconIndex / dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_Y * tileWidth + tileWidth) / (float)(dotBlueShoes.GemsMod.Global.TILEMAP_GEMS_ELEMENTS_Y * tileWidth);

				} else {

					int iconIndex = itemstack.getIconIndex();
					this.loadTexture("/gui/items.png");
					tileWidth = TextureFX.tileWidthItems;
					f6  = (float)(iconIndex % Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);
					f8  = (float)(iconIndex % Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth + tileWidth) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);
					f10 = (float)(iconIndex / Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);
					f11 = (float)(iconIndex / Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth + tileWidth) / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth);

				}

			}

			Tessellator tessellator = Tessellator.instance;
			float f12 = 1.0f;
			float f13 = 0.5f;
			float f14 = 0.25f;

			if (this.field_27004_a) {
				int k = Item.itemsList[itemstack.itemID].getColorFromDamage(itemstack.getMetadata());
				float f15 = (float)(k >> 16 & 0xFF) / 255.0f;
				float f17 = (float)(k >> 8 & 0xFF) / 255.0f;
				float f19 = (float)(k & 0xFF) / 255.0f;
				float f21 = entity.getBrightness(f1);
				if (Minecraft.getMinecraft((Object)this).fullbright || entity.item.getItem().hasTag(ItemTags.renderFullbright)) {
					f21 = 1.0f;
				}
				GL11.glColor4f(f15 * f21, f17 * f21, f19 * f21, 1.0f);
			}

			if ((Boolean) Minecraft.getMinecraft((Object) this).gameSettings.items3D.value) {

				GL11.glPushMatrix();
				GL11.glScaled(1.0, 1.0, 1.0);
				GL11.glRotated(f3, 0.0, 1.0, 0.0);
				GL11.glTranslated(-0.5, 0.0, -0.05 * (double)(renderCount - 1));

				for (int j = 0; j < renderCount; ++j) {
					GL11.glPushMatrix();
					GL11.glTranslated(0.0, 0.0, 0.1 * (double)j);
					EntityRenderDispatcher.instance.itemRenderer.renderItem(entity, itemstack, false);
					GL11.glPopMatrix();
				}

				GL11.glPopMatrix();

			} else {

				for (int l = 0; l < renderCount; ++l) {
					GL11.glPushMatrix();

					if (l > 0) {
						float f16 = (this.random.nextFloat() * 2.0f - 1.0f) * 0.3f;
						float f18 = (this.random.nextFloat() * 2.0f - 1.0f) * 0.3f;
						float f20 = (this.random.nextFloat() * 2.0f - 1.0f) * 0.3f;
						GL11.glTranslatef(f16, f18, f20);
					}

					GL11.glRotatef(180.0f - this.renderDispatcher.viewLerpYaw, 0.0f, 1.0f, 0.0f);
					tessellator.startDrawingQuads();
					tessellator.setNormal(0.0f, 1.0f, 0.0f);
					tessellator.addVertexWithUV(-0.5, -0.25, 0.0, f6, f11);
					tessellator.addVertexWithUV(0.5, -0.25, 0.0, f8, f11);
					tessellator.addVertexWithUV(0.5, 0.75, 0.0, f8, f10);
					tessellator.addVertexWithUV(-0.5, 0.75, 0.0, f6, f10);
					tessellator.draw();
					GL11.glPopMatrix();
				}
			}
		}

		GL11.glDisable(32826);
		GL11.glPopMatrix();

		ci.cancel();
	}

	@Inject(
		method = "drawItemIntoGui(Lnet/minecraft/client/render/FontRenderer;Lnet/minecraft/client/render/RenderEngine;IIIIIFF)V",
		at = @At(
			value = "HEAD"
		),
		cancellable = true, remap = false
	)
	public void drawItemIntoGui(FontRenderer fontrenderer, RenderEngine renderengine, int i, int j, int k, int l, int i1, float brightness, float alpha, CallbackInfo ci) {
		if (i < Block.blocksList.length && ((BlockModel)BlockModelDispatcher.getInstance().getDispatch(Block.blocksList[i])).shouldItemRender3d()) {

			GL11.glEnable(3042);
			GL11.glBlendFunc(770, 771);
			int j1 = i;
			renderengine.bindTexture(renderengine.getTexture("/terrain.png"));
			Block block = Block.blocksList[j1];

			GL11.glPushMatrix();
			GL11.glTranslatef(l - 2, i1 + 3, -3.0f);
			GL11.glScalef(10.0f, 10.0f, 10.0f);
			GL11.glTranslatef(1.0f, 0.5f, 1.0f);
			GL11.glScalef(1.0f, 1.0f, -1.0f);
			GL11.glRotatef(210.0f, 1.0f, 0.0f, 0.0f);
			GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);

			int l1 = Item.itemsList[i].getColorFromDamage(j);
			float f2 = (float)(l1 >> 16 & 0xFF) / 255.0f;
			float f4 = (float)(l1 >> 8 & 0xFF) / 255.0f;
			float f5 = (float)(l1 & 0xFF) / 255.0f;

			if (this.field_27004_a) {
				GL11.glColor4f(f2 * brightness, f4 * brightness, f5 * brightness, alpha);
			} else {
				GL11.glColor4f(brightness, brightness, brightness, alpha);
			}

			GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
			this.renderBlocks.useInventoryTint = this.field_27004_a;
			this.renderBlocks.renderBlockOnInventory(block, j, brightness);
			this.renderBlocks.useInventoryTint = true;
			GL11.glPopMatrix();
			GL11.glDisable(3042);

		} else if (k >= 0) {

			int tileWidth;
			GL11.glDisable(2896);

			if (i < Block.blocksList.length) {
				renderengine.bindTexture(renderengine.getTexture("/terrain.png"));
				tileWidth = TextureFX.tileWidthTerrain;
			} else {
				renderengine.bindTexture(renderengine.getTexture("/gui/items.png"));
				tileWidth = TextureFX.tileWidthItems;
			}

			int k1 = Item.itemsList[i].getColorFromDamage(j);
			float f = (float)(k1 >> 16 & 0xFF) / 255.0f;
			float f1 = (float)(k1 >> 8 & 0xFF) / 255.0f;
			float f3 = (float)(k1 & 0xFF) / 255.0f;

			if (this.field_27004_a) {
				GL11.glColor4f(f * brightness, f1 * brightness, f3 * brightness, alpha);
			} else {
				GL11.glColor4f(brightness, brightness, brightness, alpha);
			}

			this.renderTexturedQuad(l, i1, k % Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth, k / Global.TEXTURE_ATLAS_WIDTH_TILES * tileWidth, tileWidth, tileWidth);
			GL11.glEnable(2896);
		}

		GL11.glEnable(2884);

		ci.cancel();
	}

}

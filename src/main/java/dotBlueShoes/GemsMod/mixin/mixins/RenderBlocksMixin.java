package dotBlueShoes.GemsMod.mixin.mixins;

import dotBlueShoes.GemsMod.util.RenderBlocksHelper;
import net.minecraft.client.render.RenderBlocks;
import net.minecraft.client.render.Tessellator;
//import net.minecraft.client.render.TextureFX;
//import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderBlocks.class)
public abstract class RenderBlocksMixin {

	@Shadow(remap = false)
	private int overrideBlockTexture;
	@Shadow(remap = false)
	private int uvRotateBottom;
	@Shadow(remap = false)
	private int uvRotateTop;
	@Shadow(remap = false)
	private int uvRotateEast;
	@Shadow(remap = false)
	private int uvRotateWest;
	@Shadow(remap = false)
	private int uvRotateSouth;
	@Shadow(remap = false)
	private int uvRotateNorth;
	@Shadow(remap = false)
	private boolean enableAO;
	@Shadow(remap = false)
	private float colorRedTopLeft;
	@Shadow(remap = false)
	private float colorGreenTopLeft;
	@Shadow(remap = false)
	private float colorBlueTopLeft;
	@Shadow(remap = false)
	private float colorRedBottomLeft;
	@Shadow(remap = false)
	private float colorGreenBottomLeft;
	@Shadow(remap = false)
	private float colorBlueBottomLeft;
	@Shadow(remap = false)
	private float colorRedBottomRight;
	@Shadow(remap = false)
	private float colorGreenBottomRight;
	@Shadow(remap = false)
	private float colorBlueBottomRight;
	@Shadow(remap = false)
	private float colorRedTopRight;
	@Shadow(remap = false)
	private float colorGreenTopRight;
	@Shadow(remap = false)
	private float colorBlueTopRight;
	@Shadow(remap = false)
	private boolean flipTexture;

	@Inject(method = "renderBottomFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderBottomFace(Block block, double d, double d1, double d2, int spriteIndex, CallbackInfo ci) {
		Tessellator tessellator = Tessellator.instance;
		if (this.overrideBlockTexture >= 0) {
			spriteIndex = this.overrideBlockTexture;
		}

		int cornerX = spriteIndex % RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;
		int cornerY = spriteIndex / RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;

		double d3 = ((double)cornerX + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d4 = ((double)cornerX + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d5 = ((double)cornerY + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d6 = ((double)cornerY + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);

		if (block.minX < 0.0 || block.maxX > 1.0) {
			d3 = ((float)cornerX + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((float)cornerX + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		}

		if (block.minZ < 0.0 || block.maxZ > 1.0) {
			d5 = ((float)cornerY + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((float)cornerY + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		}

		double d7 = d4;
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (this.uvRotateBottom == 2) {
			d3 = ((double)cornerX + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d4 = ((double)cornerX + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		} else if (this.uvRotateBottom == 1) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution* RenderBlocksHelper.currentAtlas.elements.y);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d5 = ((double)cornerY + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d6 = ((double)cornerY + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		} else if (this.uvRotateBottom == 3) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = d + block.minX;
		double d12 = d + block.maxX;
		double d13 = d1 + block.minY;
		double d14 = d2 + block.minZ;
		double d15 = d2 + block.maxZ;

		if (this.enableAO) {
			tessellator.setColorOpaque_F(this.colorRedTopLeft, this.colorGreenTopLeft, this.colorBlueTopLeft);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
			tessellator.setColorOpaque_F(this.colorRedBottomLeft, this.colorGreenBottomLeft, this.colorBlueBottomLeft);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.setColorOpaque_F(this.colorRedBottomRight, this.colorGreenBottomRight, this.colorBlueBottomRight);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.setColorOpaque_F(this.colorRedTopRight, this.colorGreenTopRight, this.colorBlueTopRight);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
		} else {
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
		}

		ci.cancel();
	}

	@Inject(method = "renderTopFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderTopFace(Block block, double d, double d1, double d2, int spriteIndex, CallbackInfo ci) {

		Tessellator tessellator = Tessellator.instance;
		if (this.overrideBlockTexture >= 0) {
			spriteIndex = this.overrideBlockTexture;
		}

		int cornerX = spriteIndex % RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;
		int cornerY = spriteIndex / RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;

		double d3 = ((double)cornerX + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d4 = ((double)cornerX + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d5 = ((double)cornerY + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d6 = ((double)cornerY + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);

		if (block.minX < 0.0 || block.maxX > 1.0) {
			d3 = ((float)cornerX + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((float)cornerX + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		}

		if (block.minZ < 0.0 || block.maxZ > 1.0) {
			d5 = ((float)cornerY + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((float)cornerY + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		}

		double d7 = d4;
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		if (this.uvRotateTop == 1) {
			d3 = ((double)cornerX + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d4 = ((double)cornerX + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d9 = d5;
			d10 = d6;
			d7 = d3;
			d8 = d4;
			d5 = d6;
			d6 = d9;
		} else if (this.uvRotateTop == 2) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d5 = ((double)cornerY + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d6 = ((double)cornerY + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d7 = d4;
			d8 = d3;
			d3 = d4;
			d4 = d8;
			d9 = d6;
			d10 = d5;
		} else if (this.uvRotateTop == 3) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d7 = d4;
			d8 = d3;
			d9 = d5;
			d10 = d6;
		}

		double d11 = d + block.minX;
		double d12 = d + block.maxX;
		double d13 = d1 + block.maxY;
		double d14 = d2 + block.minZ;
		double d15 = d2 + block.maxZ;

		if (this.enableAO) {
			tessellator.setColorOpaque_F(this.colorRedTopLeft, this.colorGreenTopLeft, this.colorBlueTopLeft);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.setColorOpaque_F(this.colorRedBottomLeft, this.colorGreenBottomLeft, this.colorBlueBottomLeft);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.setColorOpaque_F(this.colorRedBottomRight, this.colorGreenBottomRight, this.colorBlueBottomRight);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.setColorOpaque_F(this.colorRedTopRight, this.colorGreenTopRight, this.colorBlueTopRight);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
		} else {
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
			tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
			tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
		}

		ci.cancel();
	}

	@Inject(method = "renderNorthFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderNorthFace(Block block, double d, double d1, double d2, int spriteIndex, CallbackInfo ci) {

		Tessellator tessellator = Tessellator.instance;
		if (this.overrideBlockTexture >= 0) {
			spriteIndex = this.overrideBlockTexture;
		}

		int cornerX = spriteIndex % RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;
		int cornerY = spriteIndex / RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;

		double d3 = ((double)cornerX + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d4 = ((double)cornerX + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d8;

		if (this.flipTexture) {
			d8 = d3;
			d3 = d4;
			d4 = d8;
		}

		if (block.minX < 0.0 || block.maxX > 1.0) {
			d3 = ((float)cornerX + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((float)cornerX + ((float)RenderBlocksHelper.currentAtlas.resolution- 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		}

		if (block.minY < 0.0 || block.maxY > 1.0) {
			d5 = ((float)cornerY + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((float)cornerY + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		}

		d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		if (this.uvRotateEast == 2) {
			d3 = ((double)cornerX + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)cornerX + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d10 = d5;
			d11 = d6;
			d8 = d3;
			d9 = d4;
			d5 = d6;
			d6 = d10;
		} else if (this.uvRotateEast == 1) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d3 = d4;
			d4 = d9;
			d10 = d6;
			d11 = d5;
		} else if (this.uvRotateEast == 3) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d10 = d5;
			d11 = d6;
		}

		double d12 = d + block.minX;
		double d13 = d + block.maxX;
		double d14 = d1 + block.minY;
		double d15 = d1 + block.maxY;
		double d16 = d2 + block.minZ;

		if (this.enableAO) {
			tessellator.setColorOpaque_F(this.colorRedTopLeft, this.colorGreenTopLeft, this.colorBlueTopLeft);
			tessellator.addVertexWithUV(d12, d15, d16, d8, d10);
			tessellator.setColorOpaque_F(this.colorRedBottomLeft, this.colorGreenBottomLeft, this.colorBlueBottomLeft);
			tessellator.addVertexWithUV(d13, d15, d16, d3, d5);
			tessellator.setColorOpaque_F(this.colorRedBottomRight, this.colorGreenBottomRight, this.colorBlueBottomRight);
			tessellator.addVertexWithUV(d13, d14, d16, d9, d11);
			tessellator.setColorOpaque_F(this.colorRedTopRight, this.colorGreenTopRight, this.colorBlueTopRight);
			tessellator.addVertexWithUV(d12, d14, d16, d4, d6);
		} else {
			tessellator.addVertexWithUV(d12, d15, d16, d8, d10);
			tessellator.addVertexWithUV(d13, d15, d16, d3, d5);
			tessellator.addVertexWithUV(d13, d14, d16, d9, d11);
			tessellator.addVertexWithUV(d12, d14, d16, d4, d6);
		}

		ci.cancel();
	}

	@Inject(method = "renderSouthFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderSouthFace(Block block, double d, double d1, double d2, int spriteIndex, CallbackInfo ci) {

		Tessellator tessellator = Tessellator.instance;
		if (this.overrideBlockTexture >= 0) {
			spriteIndex = this.overrideBlockTexture;
		}

		int cornerX = spriteIndex % RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;
		int cornerY = spriteIndex / RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;

		double d3 = ((double)cornerX + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d4 = ((double)cornerX + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);

		double d8;

		if (this.flipTexture) {
			d8 = d3;
			d3 = d4;
			d4 = d8;
		}

		if (block.minX < 0.0 || block.maxX > 1.0) {
			d3 = ((float)cornerX + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((float)cornerX + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		}

		if (block.minY < 0.0 || block.maxY > 1.0) {
			d5 = ((float)cornerY + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((float)cornerY + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		}

		d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		if (this.uvRotateWest == 1) {
			d3 = ((double)cornerX + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)cornerX + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d10 = d5;
			d11 = d6;
			d8 = d3;
			d9 = d4;
			d5 = d6;
			d6 = d10;
		} else if (this.uvRotateWest == 2) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d3 = d4;
			d4 = d9;
			d10 = d6;
			d11 = d5;
		} else if (this.uvRotateWest == 3) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minX * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxX * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d10 = d5;
			d11 = d6;
		}

		double d12 = d + block.minX;
		double d13 = d + block.maxX;
		double d14 = d1 + block.minY;
		double d15 = d1 + block.maxY;
		double d16 = d2 + block.maxZ;

		if (this.enableAO) {
			tessellator.setColorOpaque_F(this.colorRedTopLeft, this.colorGreenTopLeft, this.colorBlueTopLeft);
			tessellator.addVertexWithUV(d12, d15, d16, d3, d5);
			tessellator.setColorOpaque_F(this.colorRedBottomLeft, this.colorGreenBottomLeft, this.colorBlueBottomLeft);
			tessellator.addVertexWithUV(d12, d14, d16, d9, d11);
			tessellator.setColorOpaque_F(this.colorRedBottomRight, this.colorGreenBottomRight, this.colorBlueBottomRight);
			tessellator.addVertexWithUV(d13, d14, d16, d4, d6);
			tessellator.setColorOpaque_F(this.colorRedTopRight, this.colorGreenTopRight, this.colorBlueTopRight);
			tessellator.addVertexWithUV(d13, d15, d16, d8, d10);
		} else {
			tessellator.addVertexWithUV(d12, d15, d16, d3, d5);
			tessellator.addVertexWithUV(d12, d14, d16, d9, d11);
			tessellator.addVertexWithUV(d13, d14, d16, d4, d6);
			tessellator.addVertexWithUV(d13, d15, d16, d8, d10);
		}

		ci.cancel();
	}

	@Inject(method = "renderWestFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderWestFace(Block block, double d, double d1, double d2, int spriteIndex, CallbackInfo ci) {

		Tessellator tessellator = Tessellator.instance;
		if (this.overrideBlockTexture >= 0) {
			spriteIndex = this.overrideBlockTexture;
		}

		int cornerX = spriteIndex % RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;
		int cornerY = spriteIndex / RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;

		double d3 = ((double)cornerX + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d4 = ((double)cornerX + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d8;

		if (this.flipTexture) {
			d8 = d3;
			d3 = d4;
			d4 = d8;
		}

		if (block.minZ < 0.0 || block.maxZ > 1.0) {
			d3 = ((float)cornerX + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((float)cornerX + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		}

		if (block.minY < 0.0 || block.maxY > 1.0) {
			d5 = ((float)cornerY + 0.0F) / (float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((float)cornerY + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		}

		d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		if (this.uvRotateNorth == 1) {
			d3 = ((double)cornerX + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)cornerX + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d10 = d5;
			d11 = d6;
			d8 = d3;
			d9 = d4;
			d5 = d6;
			d6 = d10;
		} else if (this.uvRotateNorth == 2) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d3 = d4;
			d4 = d9;
			d10 = d6;
			d11 = d5;
		} else if (this.uvRotateNorth == 3) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d10 = d5;
			d11 = d6;
		}

		double d12 = d + block.minX;
		double d13 = d1 + block.minY;
		double d14 = d1 + block.maxY;
		double d15 = d2 + block.minZ;
		double d16 = d2 + block.maxZ;

		if (this.enableAO) {
			tessellator.setColorOpaque_F(this.colorRedTopLeft, this.colorGreenTopLeft, this.colorBlueTopLeft);
			tessellator.addVertexWithUV(d12, d14, d16, d8, d10);
			tessellator.setColorOpaque_F(this.colorRedBottomLeft, this.colorGreenBottomLeft, this.colorBlueBottomLeft);
			tessellator.addVertexWithUV(d12, d14, d15, d3, d5);
			tessellator.setColorOpaque_F(this.colorRedBottomRight, this.colorGreenBottomRight, this.colorBlueBottomRight);
			tessellator.addVertexWithUV(d12, d13, d15, d9, d11);
			tessellator.setColorOpaque_F(this.colorRedTopRight, this.colorGreenTopRight, this.colorBlueTopRight);
			tessellator.addVertexWithUV(d12, d13, d16, d4, d6);
		} else {
			tessellator.addVertexWithUV(d12, d14, d16, d8, d10);
			tessellator.addVertexWithUV(d12, d14, d15, d3, d5);
			tessellator.addVertexWithUV(d12, d13, d15, d9, d11);
			tessellator.addVertexWithUV(d12, d13, d16, d4, d6);
		}

		ci.cancel();
	}

	@Inject(method = "renderEastFace", at = @At("HEAD"), remap = false, cancellable = true)
	public void renderEastFace(Block block, double d, double d1, double d2, int spriteIndex, CallbackInfo ci) {

		Tessellator tessellator = Tessellator.instance;
		if (this.overrideBlockTexture >= 0) {
			spriteIndex = this.overrideBlockTexture;
		}

		int cornerX = spriteIndex % RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;
		int cornerY = spriteIndex / RenderBlocksHelper.currentAtlas.elements.x * RenderBlocksHelper.currentAtlas.resolution;

		double d3 = ((double)cornerX + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d4 = ((double)cornerX + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		double d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		double d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
			(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);

		double d8;

		if (this.flipTexture) {
			d8 = d3;
			d3 = d4;
			d4 = d8;
		}

		if (block.minZ < 0.0 || block.maxZ > 1.0) {
			d3 = ((float)cornerX + 0.0F) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((float)cornerX + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
		}

		if (block.minY < 0.0 || block.maxY > 1.0) {
			d5 = ((float)cornerY + 0.0F) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((float)cornerY + ((float)RenderBlocksHelper.currentAtlas.resolution - 0.01F)) /
				(float)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
		}

		d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		if (this.uvRotateSouth == 2) {
			d3 = ((double)cornerX + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)cornerX + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)(cornerY + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d10 = d5;
			d11 = d6;
			d8 = d3;
			d9 = d4;
			d5 = d6;
			d6 = d10;
		} else if (this.uvRotateSouth == 1) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d3 = d4;
			d4 = d9;
			d10 = d6;
			d11 = d5;
		} else if (this.uvRotateSouth == 3) {
			d3 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.minZ * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d4 = ((double)(cornerX + RenderBlocksHelper.currentAtlas.resolution) - block.maxZ * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.x);
			d5 = ((double)cornerY + block.maxY * (double)RenderBlocksHelper.currentAtlas.resolution) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d6 = ((double)cornerY + block.minY * (double)RenderBlocksHelper.currentAtlas.resolution - 0.01) /
				(double)(RenderBlocksHelper.currentAtlas.resolution * RenderBlocksHelper.currentAtlas.elements.y);
			d8 = d4;
			d9 = d3;
			d10 = d5;
			d11 = d6;
		}

		double d12 = d + block.maxX;
		double d13 = d1 + block.minY;
		double d14 = d1 + block.maxY;
		double d15 = d2 + block.minZ;
		double d16 = d2 + block.maxZ;

		if (this.enableAO) {
			tessellator.setColorOpaque_F(this.colorRedTopLeft, this.colorGreenTopLeft, this.colorBlueTopLeft);
			tessellator.addVertexWithUV(d12, d13, d16, d9, d11);
			tessellator.setColorOpaque_F(this.colorRedBottomLeft, this.colorGreenBottomLeft, this.colorBlueBottomLeft);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.setColorOpaque_F(this.colorRedBottomRight, this.colorGreenBottomRight, this.colorBlueBottomRight);
			tessellator.addVertexWithUV(d12, d14, d15, d8, d10);
			tessellator.setColorOpaque_F(this.colorRedTopRight, this.colorGreenTopRight, this.colorBlueTopRight);
			tessellator.addVertexWithUV(d12, d14, d16, d3, d5);
		} else {
			tessellator.addVertexWithUV(d12, d13, d16, d9, d11);
			tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
			tessellator.addVertexWithUV(d12, d14, d15, d8, d10);
			tessellator.addVertexWithUV(d12, d14, d16, d3, d5);
		}

		ci.cancel();
	}

}

package dotBlueShoes.GemsMod.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.render.dynamictexture.DynamicTexture;
import net.minecraft.client.render.dynamictexture.DynamicTextureFireflyJar;
import net.minecraft.core.Global;
import net.minecraft.core.util.helper.Textures;

import java.awt.image.BufferedImage;

public class TextureAtlasHandler extends DynamicTexture {
	private final String name;
	private final byte[] originalData;
	private int elapsedTicks = 0;

	public TextureAtlasHandler(Minecraft minecraft, String spriteAtlas, int coordX, int coordY, int resolution, int textureIndex) {
		super(textureIndex, resolution, 1);

		this.originalData = new byte[resolution * resolution * 4]; // 16 * 16 * 4 -> x * y * rgba
		this.name = spriteAtlas;

		ClassLoader classLoader = getClass().getClassLoader();

		//BufferedImage atlas = Textures.readImage(minecraft.texturePackList.selectedTexturePack.getResourceAsStream(this.getTextureName()));
		BufferedImage atlas = Textures.readImage(classLoader.getResourceAsStream(this.getTextureName()));



		//System.out.println("Width: " + Integer.toString(Global.TEXTURE_ATLAS_WIDTH_TILES));
		//System.out.println("Index: " + textureIndex);

		//System.out.println("X: " + tileX);
		//System.out.println("Y: " + tileY);

		for (int x = 0; x < resolution; ++x) {
			for (int y = 0; y < resolution; ++y) {
				putPixel(this.originalData, y * resolution + x, atlas.getRGB(coordX * resolution + x, coordY * resolution + y));
			}
		}

		///int atlasWidth = Global.TEXTURE_ATLAS_WIDTH_TILES;
		///int tileX = textureIndex % atlasWidth;
		///int tileY = textureIndex / atlasWidth;
		///for (int x = 0; x < resolution; ++x) {
		///	for (int y = 0; y < resolution; ++y) {
		///		DynamicTextureFireflyJar.putPixel(this.originalData, y * resolution + x, atlas.getRGB(tileX * resolution + x, tileY * resolution + y));
		///	}
		///}

		//for (int x = 0; x < resolution; ++x) {
		//	for (int y = 0; y < resolution; ++y) {
		//		int c = image.getRGB(x, resolution + y);
		//		putPixel(this.frames, (resolution * resolution) + (y * resolution) + x, c);
				// NO IDEA why there is a 256 in front ...
				// 0.  (16 * 16) + (0 * 16) + 0  // 1st pixel
				// 1.  (16 * 16) + (0 * 16) + 1  // 2nd pixel
				// 16. (16 * 16) + (1 * 16) + 0  // next row 1st pixel
				// n.  (16 * 16) + (15 * 16) + 15 // because we're going from 0 to 15 this is the last pixel
		//	}
		//}

		//}
	}

	public void update() {
		this.elapsedTicks++;
		//System.out.println("CALL");

		for (int x = 0; x < this.resolution; ++x) {
			for (int y = 0; y < this.resolution; ++y) {
				transferPixel(this.originalData, (y * this.resolution) + x, this.imageData, (y * this.resolution) + x);
			}
		}

		//for (int x = 0; x < resolution; ++x) {
		//	for (int y = 0; y < resolution; ++y) {
		//		putPixel(this.originalData, this.elapsedTicks + y * resolution + x, atlas.getRGB(coordX * resolution + x, coordY * resolution + y));
		//	}
		//}

	}

	@Override
	public String getTextureName() {
		return name;
	}

}

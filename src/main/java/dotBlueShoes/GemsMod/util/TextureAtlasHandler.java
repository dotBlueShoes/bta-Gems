package dotBlueShoes.GemsMod.util;

import net.minecraft.client.render.dynamictexture.DynamicTexture;
import net.minecraft.core.util.helper.Textures;

import java.awt.image.BufferedImage;

public class TextureAtlasHandler extends DynamicTexture {
	private final String textureName;
	private final byte[] frames;
	private int elapsedTicks = 0;

	public TextureAtlasHandler(String textureName, String animationSource, int textureIndex, int resolution, int width) {
		super(textureIndex, resolution, width);
		this.textureName = textureName;
		BufferedImage image = Textures.readImage(turniplabs.halplibe.util.TextureHandler.class.getResourceAsStream(animationSource));
		//if (image == Textures.missingTexture) {
		//	throw new RuntimeException("Animation " + animationSource + " couldn't be found!");
		//} else if (image.getWidth() != resolution) {
		//	throw new RuntimeException("Animation " + animationSource + " doesn't have the same width as textures in " + textureName + "!");
		//} else if (image.getHeight() % image.getWidth() != 0) {
		//	throw new RuntimeException("Invalid Height for animation! " + animationSource);
		//} else {

		this.frames = new byte[resolution * resolution * 4];
		// 16 * 16 * 4 -> x * y * rgba

		for (int x = 0; x < resolution; ++x) {
			for (int y = 0; y < resolution; ++y) {
				int c = image.getRGB(x, resolution + y);
				putPixel(this.frames, (resolution * resolution) + (y * resolution) + x, c);
				// NO IDEA why there is a 256 in front ...
				// 0.  (16 * 16) + (0 * 16) + 0  // 1st pixel
				// 1.  (16 * 16) + (0 * 16) + 1  // 2nd pixel
				// 16. (16 * 16) + (1 * 16) + 0  // next row 1st pixel
				// n.  (16 * 16) + (15 * 16) + 15 // because we're going from 0 to 15 this is the last pixel
			}
		}

		//}
	}

	public void update() {
		this.elapsedTicks = (this.elapsedTicks + 1);

		for (int i = 0; i < this.resolution; ++i) {
			for (int j = 0; j < this.resolution; ++j) {
				transferPixel(this.frames, this.elapsedTicks * this.resolution * this.resolution + j * this.resolution + i, this.imageData, j * this.resolution + i);
			}
		}

	}

	public String getTextureName() {
		return this.textureName;
	}
}

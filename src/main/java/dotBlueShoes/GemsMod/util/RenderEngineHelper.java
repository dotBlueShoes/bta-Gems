package dotBlueShoes.GemsMod.util;

import dotBlueShoes.GemsMod.GemsMod;
import net.minecraft.client.GLAllocation;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.client.render.texturepack.TexturePackBase;
import net.minecraft.core.util.helper.Textures;

import java.io.IOException;
import java.io.InputStream;

public class RenderEngineHelper {

	private static final String STRING_STREAM_ERROR = "Could not load specified resource! STREAM IS NULL!";

	public static int getCustomTexture(RenderEngine renderEngine, String texturePath) {
		/// With this we're at the TOP e.g. resources root.
		TexturePackBase texturePack = renderEngine.texturePacks.selectedTexturePack;
		int id = GLAllocation.generateTexture();

		try (InputStream inputStream = texturePack.getResourceAsStream(texturePath)) {

			/// When NULL setup "Missing Texture instead".
			if (inputStream == null) {

				GemsMod.LOGGER.info(STRING_STREAM_ERROR);
				renderEngine.setupTexture(Textures.missingTexture, id, false);

			} else {

				//GemsMod.LOGGER.info("Sprite Found!");
				renderEngine.setupTexture(Textures.readImage(inputStream), id, false);

			}

			renderEngine.getTextureMap().put(texturePath, id);
			return id;

		} catch (IOException exception) {
			exception.printStackTrace();

			/// When EXCEPTION setup "Missing Texture instead".
			renderEngine.setupTexture(Textures.missingTexture, id, false);
			renderEngine.getTextureMap().put(texturePath, id);
			return id;
		}

	}
}

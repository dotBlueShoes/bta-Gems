package dotBlueShoes.GemsMod.mixin;

import dotBlueShoes.GemsMod.GemsMod;
import dotBlueShoes.GemsMod.Global;
import net.minecraft.client.GLAllocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.core.util.helper.Textures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Mixin(RenderEngine.class)
public class RenderEngineAccessor {

	// Not sure if that works?
	// Maybe this instead? //Map<String, Integer> textureMap = ((RenderEngine) (Object) this).getTextureMap();
	@Shadow
	private Map<String, Integer> textureMap = new HashMap<String, Integer>();

	//@Inject(at = @At("HEAD"), method = "initDynamicTextures()V", remap = false)
	@Inject(method = "initDynamicTextures", at = @At("TAIL"), remap = false)
	public void initDynamicTextures(CallbackInfo ci) {
		getCustomTexture("assets/" + Global.MOD_ID + "/" + Global.IMAGE_TILEMAP_GEMS);
	}

	private void getCustomTexture(String texturePath) {
		GemsMod.LOGGER.info("This line is printed by an GemsMod mixin!!!");

		// With this we're at the TOP e.g. resources root.
		ClassLoader classLoader = getClass().getClassLoader();

		try (InputStream inputStream = classLoader.getResourceAsStream(texturePath)) {
			if (inputStream == null) {
				GemsMod.LOGGER.info("Could not load specified resource! STREAM IS NULL!");
			} else {
				int id = GLAllocation.generateTexture();
				((RenderEngine) (Object) this).setupTexture(Textures.readImage(inputStream), id, false);
				textureMap.put(texturePath, id);
				//((RenderEngine)(Object)this).textureMap.put(name, id);
				//return id;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}


	}

}

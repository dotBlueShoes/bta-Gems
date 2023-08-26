package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.init.Blocks;
import dotBlueShoes.GemsMod.init.Items;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// ABOUT
//  following function loads properly loads a texture.
//  but that texture has to be 16x16 and only apply to this item.
// ItemHelper.createItem(Global.MOD_ID, EXAMPLE_ITEM, "example_item", "pig_steel_chunk.png");
//  I could load a sprite atlas myself and then assign sprites in it to the items/blocks I want.
//  If I would like to work on my own sprite atlas I would need to do the following:
//  - Mixin into RenderEngine - DONE

// HOW DOES HALPLIBE works?
// -> TextureHelper.getOrCreateItemTexture(modId, texture);
//    -> TextureHelper.addTextureToItems(modId, itemTexture, newCoords[0], newCoords[1]);
//       -> TextureHelper.textureHandlers.add(new TextureHandler("/gui/items.png", "/assets/" + modId + "/item/" + itemTexture, Block.texCoordToIndex(x, y), 16, 1));
//
// TextureHandler - extends DynamicTexture
// RenderEngineMixin - places TextureHandlers into needed array.
//
// Its not like something is added to an existing texture there are checks to see whether our texture is 16x16.


public class GemsMod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger(Global.MOD_ID);

	@Override
	public void onInitialize() {

		//Minecraft mc = Minecraft.getMinecraft(Minecraft.class);
		//if (mc != null) {
		//	LOGGER.info("GOT MC!");
		//}

		Blocks.onInitialize();
		Items.onInitialize();

		LOGGER.info("Gems initialized.");
	}

}

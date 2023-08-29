package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.util.Pair;
import dotBlueShoes.GemsMod.util.Range;
import dotBlueShoes.GemsMod.util.TextureAtlas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Global {

	public static final String MOD_ID = "gems_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(Global.MOD_ID);

	/// Not final so its resolution can be changed by texturePacks.
	public static TextureAtlas atlasGems = new TextureAtlas(
		MOD_ID, "item/tilemap_gems.png",
		new Pair<>(10, 3), 16
	);

	public static TextureAtlas[] atlases = {
		atlasGems
	};

}

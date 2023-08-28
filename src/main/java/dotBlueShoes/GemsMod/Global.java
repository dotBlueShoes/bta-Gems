package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.util.Pair;
import dotBlueShoes.GemsMod.util.Range;
import dotBlueShoes.GemsMod.util.TextureAtlas;

public class Global {

	public static final String MOD_ID = "gems_mod";

	/// Not final so its resolution can be changed by texturePacks.
	public static TextureAtlas atlasGems = new TextureAtlas(
		MOD_ID, "item/tilemap_gems.png",
		new Pair<>(10, 3), 16,
		new Range<>(17001, 1)
	);

	public static TextureAtlas[] atlases = {
		atlasGems
	};

}

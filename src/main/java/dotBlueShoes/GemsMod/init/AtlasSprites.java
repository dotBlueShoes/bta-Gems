package dotBlueShoes.GemsMod.init;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.util.Pair;
import dotBlueShoes.GemsMod.util.TextureAtlas;

public class AtlasSprites {

	public static TextureAtlas gemsTextureAtlas = new TextureAtlas(
		Global.MOD_ID,
		"gems.png",
		new Pair<>(10, 4), 16
	);

	public static TextureAtlas[] atlases = {
		gemsTextureAtlas
	};

}

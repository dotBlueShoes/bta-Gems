package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.atlas_lib.utility.Pair;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;

public class AtlasSprites {

	public static SpriteAtlas gemsSpriteAtlas = new SpriteAtlas(
		Global.MOD_ID,
		"gems.png",
		new Pair<>(10, 4), 16
	);

	public static SpriteAtlas[] atlases = {
		gemsSpriteAtlas
	};

}

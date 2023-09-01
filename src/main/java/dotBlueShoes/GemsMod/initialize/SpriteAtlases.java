package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.atlas_lib.utility.Pair;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;

import java.util.ArrayList;
import java.util.List;

public class SpriteAtlases {

	public static SpriteAtlas gemsSpriteAtlas = new SpriteAtlas(
		Global.MOD_ID,
		"gems.png",
		new Pair<>(10, 8), 16
	);

	public static List<SpriteAtlas> atlases = new ArrayList<SpriteAtlas>();

	public static void onInitialize() {
		atlases.add(gemsSpriteAtlas);
		dotBlueShoes.atlas_lib.initialization.SpriteAtlases.atlases.addAll(atlases);
	}

}

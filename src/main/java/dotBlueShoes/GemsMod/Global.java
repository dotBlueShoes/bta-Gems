package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.util.Pair;
import dotBlueShoes.GemsMod.util.TextureAtlas;

public class Global {

	public static final String MOD_ID = "gems_mod";
	public static final TextureAtlas atlasGems =
		new TextureAtlas(MOD_ID, "item/tilemap_gems.png", new Pair<>(10, 3), 16);

	public static final int OPENGL_VERSION = 3553;

}

package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.initialize.*;
import net.fabricmc.api.ModInitializer;

public class GemsMod implements ModInitializer {

	@Override
	public void onInitialize() {

		SpriteAtlases.onInitialize();
		Blocks.onInitialize();
		Items.onInitialize();
		Recipes.onInitialize();

		Global.LOGGER.info("Gems initialized.");
	}

}

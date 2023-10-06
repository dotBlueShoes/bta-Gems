package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.handlers.Registry;
import dotBlueShoes.GemsMod.initialize.*;
import dotBlueShoes.GemsMod.handlers.Config;
import net.fabricmc.api.ModInitializer;

public class GemsMod implements ModInitializer {

	@Override
	public void onInitialize() {

		Registry.onInitialize();
		Config.onInitialize();
		SpriteAtlases.onInitialize();
		Blocks.onInitialize();
		Items.onInitialize();
		Recipes.onInitialize();

		Global.LOGGER.info("Gems initialized.");
	}

}

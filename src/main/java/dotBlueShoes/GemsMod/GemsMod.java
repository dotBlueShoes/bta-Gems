package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.handlers.Registry;
import dotBlueShoes.GemsMod.initialize.*;
import dotBlueShoes.GemsMod.handlers.Config;
import net.fabricmc.api.ModInitializer;
import turniplabs.halplibe.mixin.accessors.RenderPlayerAccessor;
import org.apache.commons.lang3.ArrayUtils;

public class GemsMod implements ModInitializer {

	@Override
	public void onInitialize() {

		//String[] armorFilenamePrefix = RenderPlayerAccessor.getArmorFilenamePrefix();
		//for (String filenamePrefix : armorFilenamePrefix) {
		//	ArrayUtils.add(armorFilenamePrefix, "sample");
		//	Global.LOGGER.info(filenamePrefix);
		//}

		Registry.onInitialize();
		Config.onInitialize();
		SpriteAtlases.onInitialize();
		Blocks.onInitialize();
		Items.onInitialize();
		Recipes.onInitialize();

		Global.LOGGER.info("Gems initialized.");
	}

}

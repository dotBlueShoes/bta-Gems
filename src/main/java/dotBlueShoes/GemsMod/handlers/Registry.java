package dotBlueShoes.GemsMod.handlers;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.initialize.Blocks;
import dotBlueShoes.GemsMod.initialize.Items;
import net.fabricmc.loader.api.FabricLoader;
import turniplabs.halplibe.helper.BlockHelper;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.RegistryHelper;

import java.io.File;

public class Registry {

	private static int newBlockId = Global.defaultStartIdentifierBlock;
	private static int newItemId = Global.defaultStartIdentifierItem;

	public static void onInitialize() {

		// Procedure required to get valid blockIds and itemIds.
		File halplibe_config = new File(FabricLoader.getInstance().getConfigDir() + "/config/bta-halplibe.properties");
		RegistryHelper.scheduleRegistry(halplibe_config.exists(), ()-> {
			newBlockId = BlockHelper.findOpenIds(Blocks.ORE_BLOCKS.length);
			newItemId = ItemHelper.findOpenIds(Items.ITEMS.length);
		});

	}

	public static int getNewBlockId() {
		newBlockId++;
		return newBlockId;
	}
	public static int getNewItemId() {
		newItemId++;
		return newItemId;
	}

	public static String getModKey(String name) {
		return Global.MOD_ID + "." + name;
	}

}

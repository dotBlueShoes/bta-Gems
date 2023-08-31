package dotBlueShoes.GemsMod.utility;

import dotBlueShoes.GemsMod.Global;
import net.minecraft.core.block.Block;

public class Registry {

	private static int newBlockId = Block.highestBlockId;
	private static int newItemId = 17000;


	public static int GetNewBlockId() {
		newBlockId++;
		return newBlockId;
	}
	public static int GetNewItemId() {
		newItemId++;
		return newItemId;
	}

	public static String GetModKey(String name) {
		return Global.MOD_ID + "." + name;
	}

}

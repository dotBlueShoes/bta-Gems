package dotBlueShoes.GemsMod.util;

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

}

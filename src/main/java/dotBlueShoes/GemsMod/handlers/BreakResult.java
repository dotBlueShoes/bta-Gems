package dotBlueShoes.GemsMod.handlers;

import dotBlueShoes.GemsMod.Global;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

public class BreakResult {

	// 90-99 (5%)  -> poolC (1, 0    , 0 + 1)
	// 75-89 (20%) -> poolB (0, 2    , 0 + 2)
	// 0-74  (75%) -> poolA (0, 0 + 2, 1 + 1)
	public static ItemStack[] GetPoolsBreakResult(Item[] breakResult) {
		int chance = Global.rand.nextInt(100);
		if (chance >= 90) {
			return new ItemStack[]{
				new ItemStack(breakResult[0], 1),
				new ItemStack(breakResult[1], 0),
				new ItemStack(breakResult[2], Global.rand.nextInt(2)),
			};
		} else if (chance >= 75) {
			return new ItemStack[]{
				new ItemStack(breakResult[0], 0),
				new ItemStack(breakResult[1], 2),
				new ItemStack(breakResult[2],  Global.rand.nextInt(3)),
			};
		} else {
			return new ItemStack[]{
				new ItemStack(breakResult[0], 0),
				new ItemStack(breakResult[1], Global.rand.nextInt(3)),
				new ItemStack(breakResult[2], 1 + Global.rand.nextInt(2)),
			};
		}
	}

}

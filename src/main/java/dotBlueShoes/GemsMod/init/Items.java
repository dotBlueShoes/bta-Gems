package dotBlueShoes.GemsMod.init;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.util.Registry;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.RecipeHelper;

public class Items {

	public static final Item EXAMPLE_ITEM = new Item(Registry.GetItemRegistryId() + 1).setIconCoord(0, 0);


	private static void createItem() {
		//int[] possibleCoords = registeredItemTextures.get(modId + ":" + itemTexture);
	}

	public static void onInitialize() {
		//ItemHelper.createItem(Global.MOD_ID, EXAMPLE_ITEM, "example_item", "pigsteelChunk.png");
		EXAMPLE_ITEM.setKey(Global.MOD_ID + "." + "example_item");

		// RECIPES
		RecipeHelper.Crafting.createRecipe(EXAMPLE_ITEM, 1, new Object[]{"AA", "AA", 'A', Item.stick});
		RecipeHelper.Crafting.createRecipe(Item.stick, 1, new Object[]{"AA", "AA", 'A', EXAMPLE_ITEM});
	}

}

package dotBlueShoes.GemsMod.init;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.items.AtlasSpriteItem;
import dotBlueShoes.GemsMod.util.Registry;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.RecipeHelper;

import static dotBlueShoes.GemsMod.init.AtlasSprites.gemsTextureAtlas;

public class Items {

	public static final Item EXAMPLE_ITEM = new Item(Registry.GetNewItemId()).setIconCoord(0, 0);

	public static final AtlasSpriteItem GEM_WHOLE_TOPAZ = new AtlasSpriteItem(
		"gem_whole_topaz",
		gemsTextureAtlas
	).setItemCoord(0, 0);

	public static final AtlasSpriteItem GEM_NORMAL_TOPAZ = new AtlasSpriteItem(
		"gem_normal_topaz",
		gemsTextureAtlas
	).setItemCoord(0, 1);

	public static final AtlasSpriteItem GEM_TINY_TOPAZ = new AtlasSpriteItem(
		"gem_tiny_topaz",
		gemsTextureAtlas
	).setItemCoord(0, 2);

	public static final AtlasSpriteItem GEM_WHOLE_TANZANITE = new AtlasSpriteItem(
		"gem_whole_tanzanite",
		gemsTextureAtlas
	).setItemCoord(1, 0);

	public static final AtlasSpriteItem GEM_NORMAL_TANZANITE = new AtlasSpriteItem(
		"gem_normal_tanzanite",
		gemsTextureAtlas
	).setItemCoord(1, 1);

	public static final AtlasSpriteItem GEM_TINY_TANZANITE = new AtlasSpriteItem(
		"gem_tiny_tanzanite",
		gemsTextureAtlas
	).setItemCoord(1, 2);

	public static final AtlasSpriteItem GEM_WHOLE_SAPPHIRE = new AtlasSpriteItem(
		"gem_whole_sapphire",
		gemsTextureAtlas
	).setItemCoord(2, 0);

	public static final AtlasSpriteItem GEM_NORMAL_SAPPHIRE = new AtlasSpriteItem(
		"gem_normal_sapphire",
		gemsTextureAtlas
	).setItemCoord(2, 1);

	public static final AtlasSpriteItem GEM_TINY_SAPPHIRE = new AtlasSpriteItem(
		"gem_tiny_sapphire",
		gemsTextureAtlas
	).setItemCoord(2, 2);

	public static final AtlasSpriteItem GEM_WHOLE_RUBY = new AtlasSpriteItem(
		"gem_whole_ruby",
		gemsTextureAtlas
	).setItemCoord(3, 0);

	public static final AtlasSpriteItem GEM_NORMAL_RUBY = new AtlasSpriteItem(
		"gem_normal_ruby",
		gemsTextureAtlas
	).setItemCoord(3, 1);

	public static final AtlasSpriteItem GEM_TINY_RUBY = new AtlasSpriteItem(
		"gem_tiny_ruby",
		gemsTextureAtlas
	).setItemCoord(3, 2);

	public static final AtlasSpriteItem GEM_WHOLE_PERIDOT = new AtlasSpriteItem(
		"gem_whole_peridot",
		gemsTextureAtlas
	).setItemCoord(4, 0);

	public static final AtlasSpriteItem GEM_NORMAL_PERIDOT = new AtlasSpriteItem(
		"gem_normal_peridot",
		gemsTextureAtlas
	).setItemCoord(4, 1);

	public static final AtlasSpriteItem GEM_TINY_PERIDOT = new AtlasSpriteItem(
		"gem_tiny_peridot",
		gemsTextureAtlas
	).setItemCoord(4, 2);

	public static final AtlasSpriteItem GEM_WHOLE_MALACHITE = new AtlasSpriteItem(
		"gem_whole_malachite",
		gemsTextureAtlas
	).setItemCoord(5, 0);

	public static final AtlasSpriteItem GEM_NORMAL_MALACHITE = new AtlasSpriteItem(
		"gem_normal_malachite",
		gemsTextureAtlas
	).setItemCoord(5, 1);

	public static final AtlasSpriteItem GEM_TINY_MALACHITE = new AtlasSpriteItem(
		"gem_tiny_malachite",
		gemsTextureAtlas
	).setItemCoord(5, 2);

	public static final AtlasSpriteItem GEM_WHOLE_EMERALD = new AtlasSpriteItem(
		"gem_whole_emerald",
		gemsTextureAtlas
	).setItemCoord(6, 0);

	public static final AtlasSpriteItem GEM_NORMAL_EMERALD = new AtlasSpriteItem(
		"gem_normal_emerald",
		gemsTextureAtlas
	).setItemCoord(6, 1);

	public static final AtlasSpriteItem GEM_TINY_EMERALD = new AtlasSpriteItem(
		"gem_tiny_emerald",
		gemsTextureAtlas
	).setItemCoord(6, 2);

	public static final AtlasSpriteItem GEM_WHOLE_AMBER = new AtlasSpriteItem(
		"gem_whole_amber",
		gemsTextureAtlas
	).setItemCoord(7, 0);

	public static final AtlasSpriteItem GEM_NORMAL_AMBER = new AtlasSpriteItem(
		"gem_normal_amber",
		gemsTextureAtlas
	).setItemCoord(7, 1);

	public static final AtlasSpriteItem GEM_TINY_AMBER = new AtlasSpriteItem(
		"gem_tiny_amber",
		gemsTextureAtlas
	).setItemCoord(7, 2);

	public static final AtlasSpriteItem GEM_WHOLE_DIAMOND = new AtlasSpriteItem(
		"gem_whole_diamond",
		gemsTextureAtlas
	).setItemCoord(8, 0);

	public static final AtlasSpriteItem GEM_NORMAL_DIAMOND = new AtlasSpriteItem(
		"gem_normal_diamond",
		gemsTextureAtlas
	).setItemCoord(8, 1);

	public static final AtlasSpriteItem GEM_TINY_DIAMOND = new AtlasSpriteItem(
		"gem_tiny_diamond",
		gemsTextureAtlas
	).setItemCoord(8, 2);

	public static final AtlasSpriteItem GEM_WHOLE_BLACK_DIAMOND = new AtlasSpriteItem(
		"gem_whole_black_diamond",
		gemsTextureAtlas
	).setItemCoord(9, 0);

	public static final AtlasSpriteItem GEM_NORMAL_BLACK_DIAMOND = new AtlasSpriteItem(
		"gem_normal_black_diamond",
		gemsTextureAtlas
	).setItemCoord(9, 1);

	public static final AtlasSpriteItem GEM_TINY_BLACK_DIAMOND = new AtlasSpriteItem(
		"gem_tiny_black_diamond",
		gemsTextureAtlas
	).setItemCoord(9, 2);


	public static void onInitialize() {
		//ItemHelper.createItem(Global.MOD_ID, EXAMPLE_ITEM, "example_item", "pigsteelChunk.png");
		EXAMPLE_ITEM.setKey(Global.MOD_ID + "." + "example_item");
		//GEM_TINY_BLACK_DIAMOND.setKey(Global.MOD_ID + "." + "gem_tiny_black_diamond");

		// RECIPES
		RecipeHelper.Crafting.createRecipe(GEM_TINY_BLACK_DIAMOND, 1, new Object[]{"AA", "AA", 'A', Item.stick});
		RecipeHelper.Crafting.createRecipe(Item.stick, 1, new Object[]{"AA", "AA", 'A', EXAMPLE_ITEM});
	}

}

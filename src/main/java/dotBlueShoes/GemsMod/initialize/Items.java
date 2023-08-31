package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.utility.Registry;
import dotBlueShoes.atlas_lib.items.SpriteAtlasItem;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeHelper;

public class Items {

	public static final SpriteAtlasItem GEM_WHOLE_TOPAZ = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_topaz"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(0, 0);

	public static final SpriteAtlasItem GEM_NORMAL_TOPAZ = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_topaz"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(0, 1);

	public static final SpriteAtlasItem GEM_TINY_TOPAZ = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_topaz"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(0, 2);

	public static final SpriteAtlasItem GEM_WHOLE_TANZANITE = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_tanzanite"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(1, 0);

	public static final SpriteAtlasItem GEM_NORMAL_TANZANITE = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_tanzanite"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(1, 1);

	public static final SpriteAtlasItem GEM_TINY_TANZANITE = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_tanzanite"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(1, 2);

	public static final SpriteAtlasItem GEM_WHOLE_SAPPHIRE = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_sapphire"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(2, 0);

	public static final SpriteAtlasItem GEM_NORMAL_SAPPHIRE = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_sapphire"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(2, 1);

	public static final SpriteAtlasItem GEM_TINY_SAPPHIRE = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_sapphire"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(2, 2);

	public static final SpriteAtlasItem GEM_WHOLE_RUBY = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_ruby"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(3, 0);

	public static final SpriteAtlasItem GEM_NORMAL_RUBY = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_ruby"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(3, 1);

	public static final SpriteAtlasItem GEM_TINY_RUBY = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_ruby"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(3, 2);

	public static final SpriteAtlasItem GEM_WHOLE_PERIDOT = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_peridot"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(4, 0);

	public static final SpriteAtlasItem GEM_NORMAL_PERIDOT = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_peridot"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(4, 1);

	public static final SpriteAtlasItem GEM_TINY_PERIDOT = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_peridot"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(4, 2);

	public static final SpriteAtlasItem GEM_WHOLE_MALACHITE = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_malachite"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(5, 0);

	public static final SpriteAtlasItem GEM_NORMAL_MALACHITE = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_malachite"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(5, 1);

	public static final SpriteAtlasItem GEM_TINY_MALACHITE = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_malachite"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(5, 2);

	public static final SpriteAtlasItem GEM_WHOLE_EMERALD = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_emerald"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(6, 0);

	public static final SpriteAtlasItem GEM_NORMAL_EMERALD = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_emerald"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(6, 1);

	public static final SpriteAtlasItem GEM_TINY_EMERALD = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_emerald"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(6, 2);

	public static final SpriteAtlasItem GEM_WHOLE_AMBER = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_amber"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(7, 0);

	public static final SpriteAtlasItem GEM_NORMAL_AMBER = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_amber"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(7, 1);

	public static final SpriteAtlasItem GEM_TINY_AMBER = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_amber"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(7, 2);

	public static final SpriteAtlasItem GEM_NORMAL_DIAMOND = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_diamond"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(8, 1);

	public static final SpriteAtlasItem GEM_TINY_DIAMOND = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_diamond"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(8, 2);

	public static final SpriteAtlasItem GEM_WHOLE_BLACK_DIAMOND = new SpriteAtlasItem(
		Registry.GetModKey("gem_whole_black_diamond"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(9, 0);

	public static final SpriteAtlasItem GEM_NORMAL_BLACK_DIAMOND = new SpriteAtlasItem(
		Registry.GetModKey("gem_normal_black_diamond"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(9, 1);

	public static final SpriteAtlasItem GEM_TINY_BLACK_DIAMOND = new SpriteAtlasItem(
		Registry.GetModKey("gem_tiny_black_diamond"),
		Registry.GetNewItemId(),
		AtlasSprites.gemsSpriteAtlas
	).setSpriteCoord(9, 2);

	public static final Item[] ITEMS = {
		GEM_WHOLE_TOPAZ,
		GEM_NORMAL_TOPAZ,
		GEM_TINY_TOPAZ,
		GEM_WHOLE_TANZANITE,
		GEM_NORMAL_TANZANITE,
		GEM_TINY_TANZANITE,
		GEM_WHOLE_SAPPHIRE,
		GEM_NORMAL_SAPPHIRE,
		GEM_TINY_SAPPHIRE,
		GEM_WHOLE_RUBY,
		GEM_NORMAL_RUBY,
		GEM_TINY_RUBY,
		GEM_WHOLE_PERIDOT,
		GEM_NORMAL_PERIDOT,
		GEM_TINY_PERIDOT,
		GEM_WHOLE_MALACHITE,
		GEM_NORMAL_MALACHITE,
		GEM_TINY_MALACHITE,
		GEM_WHOLE_EMERALD,
		GEM_NORMAL_EMERALD,
		GEM_TINY_EMERALD,
		GEM_WHOLE_AMBER,
		GEM_NORMAL_AMBER,
		GEM_TINY_AMBER,
		GEM_NORMAL_DIAMOND,
		GEM_TINY_DIAMOND,
		GEM_WHOLE_BLACK_DIAMOND,
		GEM_NORMAL_BLACK_DIAMOND,
		GEM_TINY_BLACK_DIAMOND,
	};


	public static void onInitialize() {

	}

}
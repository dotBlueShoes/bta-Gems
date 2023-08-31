package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.utility.Registry;
import dotBlueShoes.atlas_lib.blocks.SpriteAtlasBlock;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import turniplabs.halplibe.helper.BlockBuilder;


public class Blocks {

	// TODO:
	// 1. Change Texture Map so i can have a custom texture on it.
	// 2. Harvest
	// 3. Recipe
	// 4. World Generation
	// 5. Variants

	//public static final Block EXAMPLE_BLOCK = new Block("example_block", Registry.GetNewBlockId(), Material.dirt);

	public static final Block ORE_TOPAZ = new SpriteAtlasBlock(
		Registry.GetModKey("ore_topaz"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(0, 3);

	public static final Block ORE_TANZANITE = new SpriteAtlasBlock(
		Registry.GetModKey("ore_tanzanite"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(1, 3);

	public static final Block ORE_SAPPHIRE = new SpriteAtlasBlock(
		Registry.GetModKey("ore_sapphire"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(2, 3);

	public static final Block ORE_RUBY = new SpriteAtlasBlock(
		Registry.GetModKey("ore_ruby"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(3, 3);

	public static final Block ORE_PERIDOT = new SpriteAtlasBlock(
		Registry.GetModKey("ore_peridot"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(4, 3);

	public static final Block ORE_MALACHITE = new SpriteAtlasBlock(
		Registry.GetModKey("ore_malachite"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(5, 3);

	public static final Block ORE_EMERALD = new SpriteAtlasBlock(
		Registry.GetModKey("ore_emerald"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(6, 3);

	public static final Block ORE_AMBER = new SpriteAtlasBlock(
		Registry.GetModKey("ore_amber"),
		Registry.GetNewBlockId(),
		Material.stone,
		AtlasSprites.gemsSpriteAtlas
	).setFullBlockCoord(7, 3);

	public static final Block[] BLOCKS = {
		ORE_TOPAZ,
		ORE_TANZANITE,
		ORE_SAPPHIRE,
		ORE_RUBY,
		ORE_PERIDOT,
		ORE_MALACHITE,
		ORE_EMERALD,
		ORE_AMBER
	};

	public static final BlockBuilder customBuilder = new BlockBuilder(Global.MOD_ID);

	public static void onInitialize() {
		for (Block block : BLOCKS) {
			customBuilder.build(block);
		}
	}

}

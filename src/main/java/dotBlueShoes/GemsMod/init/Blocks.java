package dotBlueShoes.GemsMod.init;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.blocks.AtlasSpriteBlock;
import dotBlueShoes.GemsMod.util.Registry;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;


public class Blocks {

	// TODO:
	// 1. Change Texture Map so i can have a custom texture on it.
	// 2. Harvest
	// 3. Recipe
	// 4. World Generation
	// 5. Variants

	public static final Block EXAMPLE_BLOCK = new Block("example_block", Registry.GetNewBlockId(), Material.dirt);

	public static final Block ORE_TOPAZ = new AtlasSpriteBlock(
		"ore_topaz",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(0, 3);

	public static final Block ORE_TANZANITE = new AtlasSpriteBlock(
		"ore_tanzanite",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(1, 3);

	public static final Block ORE_SAPPHIRE = new AtlasSpriteBlock(
		"ore_sapphire",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(2, 3);

	public static final Block ORE_RUBY = new AtlasSpriteBlock(
		"ore_ruby",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(3, 3);

	public static final Block ORE_PERIDOT = new AtlasSpriteBlock(
		"ore_peridot",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(4, 3);

	public static final Block ORE_MALACHITE = new AtlasSpriteBlock(
		"ore_malachite",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(5, 3);

	public static final Block ORE_EMERALD = new AtlasSpriteBlock(
		"ore_emerald",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(6, 3);

	public static final Block ORE_AMBER = new AtlasSpriteBlock(
		"ore_amber",
		Material.stone,
		AtlasSprites.gemsTextureAtlas
	).setFullBlockCoord(7, 3);

	public static final BlockBuilder blockBuilder = new BlockBuilder(Global.MOD_ID)
		.setTextures(8, 4) // clay
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.setHardness(0.6f); // clay

	public static final BlockBuilder customBuilder = new BlockBuilder(Global.MOD_ID);

	public static void onInitialize() {
		blockBuilder.build(EXAMPLE_BLOCK);
		customBuilder.build(ORE_TOPAZ);
		customBuilder.build(ORE_TANZANITE);
		customBuilder.build(ORE_SAPPHIRE);
		customBuilder.build(ORE_RUBY);
		customBuilder.build(ORE_PERIDOT);
		customBuilder.build(ORE_MALACHITE);
		customBuilder.build(ORE_EMERALD);
		customBuilder.build(ORE_AMBER);

		Global.LOGGER.info("aid:" + ORE_EMERALD.id);
		Global.LOGGER.info("length: " + Integer.toString(Block.blocksList.length));
	}

}

package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.utility.Registry;
import dotBlueShoes.GemsMod.blocks.GemOreBlock;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.BlockBuilder;


public class Blocks {

	// TODO:
	// 1. Fix Texture
	// 2. Harvest
	// 4. World Generation
	// 5. Variants
	// 6. DIAMOND ORE OVERRIDE

	public static final Block ORE_TOPAZ = new GemOreBlock(
		Registry.GetModKey("ore_topaz"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ }
	)   .setFullBlockCoord(0, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_TANZANITE = new GemOreBlock(
		Registry.GetModKey("ore_tanzanite"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE }
	)   .setFullBlockCoord(1, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_SAPPHIRE = new GemOreBlock(
		Registry.GetModKey("ore_sapphire"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE }
	)   .setFullBlockCoord(2, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_RUBY = new GemOreBlock(
		Registry.GetModKey("ore_ruby"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY }
	)   .setFullBlockCoord(3, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_PERIDOT = new GemOreBlock(
		Registry.GetModKey("ore_peridot"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT }
	)   .setFullBlockCoord(4, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_MALACHITE = new GemOreBlock(
		Registry.GetModKey("ore_malachite"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE }
	)   .setFullBlockCoord(5, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_EMERALD = new GemOreBlock(
		Registry.GetModKey("ore_emerald"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD }
	)   .setFullBlockCoord(6, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_AMBER = new GemOreBlock(
		Registry.GetModKey("ore_amber"),
		Registry.GetNewBlockId(),
		Material.stone,
		SpriteAtlases.gemsSpriteAtlas,
		new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
	)   .setFullBlockCoord(7, 3)
		.withHardness(3.0F)
		.withBlastResistance(5.0F)
		.withTags(BlockTags.MINEABLE_BY_PICKAXE);

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

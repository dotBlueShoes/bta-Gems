package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.blocks.GemOreBlock;
import dotBlueShoes.GemsMod.utility.Registry;
import dotBlueShoes.GemsMod.blocks.GemOreBlockOLD;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import turniplabs.halplibe.helper.BlockBuilder;


public class Blocks {

	// TODO:
	// 1. Fix Texture
	// 2. Harvest
	// 4. World Generation
	// 5. Variants
	// 6. DIAMOND ORE OVERRIDE

	//public static final Block ORE_TOPAZ = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_topaz"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ }
	//)   .setFullBlockCoord(0, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);
//
	//public static final Block ORE_TANZANITE = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_tanzanite"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE }
	//)   .setFullBlockCoord(1, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);
//
	//public static final Block ORE_SAPPHIRE = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_sapphire"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE }
	//)   .setFullBlockCoord(2, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);
//
	//public static final Block ORE_RUBY = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_ruby"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY }
	//)   .setFullBlockCoord(3, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);
//
	//public static final Block ORE_PERIDOT = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_peridot"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT }
	//)   .setFullBlockCoord(4, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);
//
	//public static final Block ORE_MALACHITE = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_malachite"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE }
	//)   .setFullBlockCoord(5, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);
//
	//public static final Block ORE_EMERALD = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_emerald"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD }
	//)   .setFullBlockCoord(6, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);
//
	//public static final Block ORE_AMBER = new GemOreBlockOLD(
	//	Registry.GetModKey("ore_amber"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
	//)   .setFullBlockCoord(7, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	// Something wrong with Registry.GetNewBlockId() i believe ...
	//  for some reason if DUMMY_BLOCK is absent in BLOCKS then last block in array 'ORE_AMBER'
	//  throws id-oriented error!!!
	//public static final Block DUMMY_BLOCK = new GemOreBlockOLD(
	//	Registry.GetModKey("dummy_block"),
	//	Registry.GetNewBlockId(),
	//	Material.stone,
	//	SpriteAtlases.gemsSpriteAtlas,
	//	new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
	//)   .setFullBlockCoord(7, 3)
	//	.withHardness(3.0F)
	//	.withBlastResistance(5.0F)
	//	.withTags(BlockTags.MINEABLE_BY_PICKAXE);

	public static final Block ORE_TOPAZ = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_topaz.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_topaz",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ })
		);

	public static final Block ORE_TANZANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_tanzanite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_tanzanite",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE })
		);

	public static final Block ORE_SAPPHIRE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_sapphire.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_sapphire",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE })
		);

	public static final Block ORE_RUBY = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_ruby.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_ruby",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY })
		);

	public static final Block ORE_PERIDOT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_peridot.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_peridot",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT })
		);

	public static final Block ORE_MALACHITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_malachite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_malachite",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE })
		);

	public static final Block ORE_EMERALD = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_emerald.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_emerald",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD })
		);

	public static final Block ORE_AMBER = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_amber.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			"ore_amber",
			Registry.GetNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
		));
	//.withHardness(3.0f).withBlastResistance(5.0f)
	//public static final Block DUMMY_BLOCK = new BlockBuilder(Global.MOD_ID)
	//	.setHardness(3.0f)
	//	.setResistance(5.0f)
	//	.setTags(BlockTags.MINEABLE_BY_PICKAXE)
	//	.build(new Block(
	//		"block_dummy",
	//		Registry.GetNewBlockId(),
	//		Material.stone
	//	));

	public static final Block[] ORE_BLOCKS = {
		ORE_TOPAZ,
		ORE_TANZANITE,
		ORE_SAPPHIRE,
		ORE_RUBY,
		ORE_PERIDOT,
		ORE_MALACHITE,
		ORE_EMERALD,
		ORE_AMBER,
	};

	//public static final BlockBuilder customBuilder = new BlockBuilder(Global.MOD_ID);

	public static void onInitialize() {
		for (Block block : ORE_BLOCKS) {
			ItemToolPickaxe.miningLevels.put(block, 2);
		}

		//for (Block block : BLOCKS) {
		//	customBuilder.build(block);
		//}
	}

}

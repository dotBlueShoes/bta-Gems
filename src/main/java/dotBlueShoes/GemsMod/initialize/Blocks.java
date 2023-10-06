package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.blocks.GemOreBlock;
import dotBlueShoes.GemsMod.handlers.Registry;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import turniplabs.halplibe.helper.BlockBuilder;


public class Blocks {

	// TODO:
	// 5. Variants
	// 6. DIAMOND ORE OVERRIDE

	public static final Block ORE_TOPAZ = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_topaz.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_topaz"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ })
		);

	public static final Block ORE_TANZANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_tanzanite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_tanzanite"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE })
		);

	public static final Block ORE_SAPPHIRE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_sapphire.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_sapphire"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE })
		);

	public static final Block ORE_RUBY = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_ruby.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_ruby"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY })
		);

	public static final Block ORE_PERIDOT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_peridot.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_peridot"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT })
		);

	public static final Block ORE_MALACHITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_malachite.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_malachite"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE })
		);

	public static final Block ORE_EMERALD = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_emerald.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_emerald"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD })
		);

	public static final Block ORE_AMBER = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures("ore_amber.png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey("ore_amber"),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
		));

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


	public static void onInitialize() {
		for (Block block : ORE_BLOCKS) {
			ItemToolPickaxe.miningLevels.put(block, 2);
		}
	}

}

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

	public static final Block ORE_TOPAZ_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TOPAZ + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TOPAZ + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ })
		);

	public static final Block ORE_TOPAZ_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TOPAZ + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TOPAZ + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ })
		);

	public static final Block ORE_TOPAZ_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TOPAZ + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TOPAZ + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ })
		);

	public static final Block ORE_TOPAZ_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TOPAZ + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TOPAZ + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_TINY_TOPAZ })
		);

	public static final Block ORE_TANZANITE_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TANZANITE + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TANZANITE + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE })
		);

	public static final Block ORE_TANZANITE_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TANZANITE + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TANZANITE + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE })
		);

	public static final Block ORE_TANZANITE_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TANZANITE + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TANZANITE + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE })
		);

	public static final Block ORE_TANZANITE_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_TANZANITE + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_TANZANITE + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_TINY_TANZANITE })
		);

	public static final Block ORE_SAPPHIRE_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_SAPPHIRE + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_SAPPHIRE + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE })
		);

	public static final Block ORE_SAPPHIRE_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_SAPPHIRE + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_SAPPHIRE + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE })
		);

	public static final Block ORE_SAPPHIRE_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_SAPPHIRE + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_SAPPHIRE + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE })
		);

	public static final Block ORE_SAPPHIRE_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_SAPPHIRE + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_SAPPHIRE + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_TINY_SAPPHIRE })
		);

	public static final Block ORE_RUBY_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_RUBY + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_RUBY + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY })
		);

	public static final Block ORE_RUBY_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_RUBY + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_RUBY + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY })
		);

	public static final Block ORE_RUBY_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_RUBY + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_RUBY + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY })
		);

	public static final Block ORE_RUBY_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_RUBY + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_RUBY + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_TINY_RUBY })
		);

	public static final Block ORE_PERIDOT_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_PERIDOT + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_PERIDOT + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT })
		);

	public static final Block ORE_PERIDOT_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_PERIDOT + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_PERIDOT + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT })
		);

	public static final Block ORE_PERIDOT_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_PERIDOT + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_PERIDOT + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT })
		);

	public static final Block ORE_PERIDOT_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_PERIDOT + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_PERIDOT + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_TINY_PERIDOT })
		);

	public static final Block ORE_MALACHITE_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_MALACHITE + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_MALACHITE + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE })
		);

	public static final Block ORE_MALACHITE_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_MALACHITE + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_MALACHITE + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE })
		);

	public static final Block ORE_MALACHITE_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_MALACHITE + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_MALACHITE + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE })
		);

	public static final Block ORE_MALACHITE_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_MALACHITE + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_MALACHITE + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_TINY_MALACHITE })
		);

	public static final Block ORE_EMERALD_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_EMERALD + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_EMERALD + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD })
		);

	public static final Block ORE_EMERALD_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_EMERALD + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_EMERALD + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD })
		);

	public static final Block ORE_EMERALD_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_EMERALD + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_EMERALD + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD })
		);

	public static final Block ORE_EMERALD_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_EMERALD + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_EMERALD + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_TINY_EMERALD })
		);

	public static final Block ORE_AMBER_STONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_AMBER + Global.SS + Global.S_STONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_AMBER + "." + Global.S_STONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
		));

	public static final Block ORE_AMBER_BASALT = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_AMBER + Global.SS + Global.S_BASALT + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_AMBER + "." + Global.S_BASALT),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
		));

	public static final Block ORE_AMBER_LIMESTONE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_AMBER + Global.SS + Global.S_LIMESTONE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_AMBER + "." + Global.S_LIMESTONE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
		));

	public static final Block ORE_AMBER_GRANITE = new BlockBuilder(Global.MOD_ID)
		.setHardness(3.0f)
		.setResistance(5.0f)
		.setTextures(Global.S_ORE + Global.SS + Global.S_AMBER + Global.SS + Global.S_GRANITE + ".png")
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new GemOreBlock(
			Registry.getModKey(Global.S_ORE + "." + Global.S_AMBER + "." + Global.S_GRANITE),
			Registry.getNewBlockId(),
			Material.stone,
			new Item[] { Items.GEM_WHOLE_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_TINY_AMBER }
		));

	public static final int GEM_ORE_BLOCKS = 8;
	public static final int GEM_ORE_BLOCK_ITERATOR = 4;

	public static final Block[] ORE_BLOCKS = {
		ORE_TOPAZ_STONE,
		ORE_TANZANITE_STONE,
		ORE_SAPPHIRE_STONE,
		ORE_RUBY_STONE,
		ORE_PERIDOT_STONE,
		ORE_MALACHITE_STONE,
		ORE_EMERALD_STONE,
		ORE_AMBER_STONE,
		ORE_TOPAZ_BASALT,
		ORE_TANZANITE_BASALT,
		ORE_SAPPHIRE_BASALT,
		ORE_RUBY_BASALT,
		ORE_PERIDOT_BASALT,
		ORE_MALACHITE_BASALT,
		ORE_EMERALD_BASALT,
		ORE_AMBER_BASALT,
		ORE_TOPAZ_LIMESTONE,
		ORE_TANZANITE_LIMESTONE,
		ORE_SAPPHIRE_LIMESTONE,
		ORE_RUBY_LIMESTONE,
		ORE_PERIDOT_LIMESTONE,
		ORE_MALACHITE_LIMESTONE,
		ORE_EMERALD_LIMESTONE,
		ORE_AMBER_LIMESTONE,
		ORE_TOPAZ_GRANITE,
		ORE_TANZANITE_GRANITE,
		ORE_SAPPHIRE_GRANITE,
		ORE_RUBY_GRANITE,
		ORE_PERIDOT_GRANITE,
		ORE_MALACHITE_GRANITE,
		ORE_EMERALD_GRANITE,
		ORE_AMBER_GRANITE,
	};


	public static void onInitialize() {
		for (Block block : ORE_BLOCKS) {
			ItemToolPickaxe.miningLevels.put(block, 2);
		}
	}

}

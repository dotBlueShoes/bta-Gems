package dotBlueShoes.GemsMod.init;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.util.Registry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;


public class Blocks {

	public static final Block EXAMPLE_BLOCK = new Block("example_block", Registry.GetBlockRegistryId() + 1, Material.dirt);

	// TODO:
	// 1. Change Texture Map so i can have a custom texture on it.
	// 2. Harvest
	// 3. Recipe
	// 4. World Generation
	// 5. Variants
	public static final BlockBuilder blockBuilder = new BlockBuilder(Global.MOD_ID)
		.setTextures(8, 4) // clay
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.setHardness(0.6f); // clay

	public static void onInitialize() {
		blockBuilder.build(EXAMPLE_BLOCK);
	}

}

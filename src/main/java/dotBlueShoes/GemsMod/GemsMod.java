package dotBlueShoes.GemsMod;

import dotBlueShoes.GemsMod.blocks.ModBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.RecipeHelper;
import turniplabs.halplibe.helper.TextureHelper;


// TODO:
// 1. What is the HalpLibe.java addModId() function.

public class GemsMod implements ModInitializer {
    public static final String MOD_ID = "gems_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// both ids correlate !

	public static int GetModRegistryId() {
		return 900;
	}

	//public static final Block EXAMPLE_BLOCK = new Block("example_block", GetModRegistryId() + 1, Material.dirt);

	public static final Item EXAMPLE_ITEM = new Item(Item.highestItemId + 1);
	//public static final Item EXAMPLE_ITEM = Item.diamond;

	public static final BlockBuilder blockBuilder = new BlockBuilder(MOD_ID)
		.setTextures(8, 4) // clay
		.setTags(BlockTags.MINEABLE_BY_SHOVEL)
		.setHardness(0.6f); // clay
	//

    @Override
    public void onInitialize() {

	    //TextureHelper.addTextureToItems(MOD_ID, "pigsteelChunk.png", 0, 14);
	    //ItemHelper.createItem(MOD_ID, EXAMPLE_ITEM, "example_block", "pigsteelChunk.png");

	    RecipeHelper.Crafting.createRecipe(EXAMPLE_ITEM, 1, new Object[]{"AA", "AA", 'A', Item.stick});
	    RecipeHelper.Crafting.createRecipe(Item.stick, 1, new Object[]{"AA", "AA", 'A', EXAMPLE_ITEM});

		// TODO:
	    // 1. Change Texture Map so i can have a custom texture on it.
	    // 2. Harvest
	    // 3. Recipe
	    // 4. World Generation
	    // 5. Variants
	    //blockBuilder.build(EXAMPLE_BLOCK);

	    //Registries.BIOMES
	    //Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), EXAMPLE_BLOCK);
	    //Registry.register(Registries.ITEM, new Identifier("tutorial", "example_block"), new BlockItem(EXAMPLE_BLOCK, new FabricItemSettings()));
        LOGGER.info("Gems initialized.");
    }
}

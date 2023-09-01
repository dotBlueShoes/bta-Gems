package dotBlueShoes.GemsMod.initialize;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeHelper;

public class Recipes {

	public static void initializeCraftingRecipes() {

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_BLACK_DIAMOND, 1), new Object[]{
			Items.GEM_WHOLE_TOPAZ,
			Items.GEM_WHOLE_TANZANITE,
			Items.GEM_WHOLE_SAPPHIRE,
			Items.GEM_WHOLE_RUBY,
			Items.GEM_WHOLE_PERIDOT,
			Items.GEM_WHOLE_MALACHITE,
			Items.GEM_WHOLE_EMERALD,
			Items.GEM_WHOLE_AMBER,
			Item.diamond
		});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_BLACK_DIAMOND, 1), new Object[]{
			Items.GEM_NORMAL_TOPAZ,
			Items.GEM_NORMAL_TANZANITE,
			Items.GEM_NORMAL_SAPPHIRE,
			Items.GEM_NORMAL_RUBY,
			Items.GEM_NORMAL_PERIDOT,
			Items.GEM_NORMAL_MALACHITE,
			Items.GEM_NORMAL_EMERALD,
			Items.GEM_NORMAL_AMBER,
			Items.GEM_NORMAL_DIAMOND,
		});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_BLACK_DIAMOND, 1), new Object[]{
			Items.GEM_TINY_TOPAZ,
			Items.GEM_TINY_TANZANITE,
			Items.GEM_TINY_SAPPHIRE,
			Items.GEM_TINY_RUBY,
			Items.GEM_TINY_PERIDOT,
			Items.GEM_TINY_MALACHITE,
			Items.GEM_TINY_EMERALD,
			Items.GEM_TINY_AMBER,
			Items.GEM_TINY_DIAMOND,
		});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_TOPAZ, 1), new Object[]{Items.GEM_NORMAL_TOPAZ, Items.GEM_NORMAL_TOPAZ, Items.GEM_NORMAL_TOPAZ});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_TOPAZ, 3), new Object[]{Items.GEM_WHOLE_TOPAZ});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_TOPAZ, 1), new Object[]{Items.GEM_TINY_TOPAZ, Items.GEM_TINY_TOPAZ, Items.GEM_TINY_TOPAZ});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_TOPAZ, 3), new Object[]{Items.GEM_NORMAL_TOPAZ});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_TANZANITE, 1), new Object[]{Items.GEM_NORMAL_TANZANITE, Items.GEM_NORMAL_TANZANITE, Items.GEM_NORMAL_TANZANITE});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_TANZANITE, 3), new Object[]{Items.GEM_WHOLE_TANZANITE});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_TANZANITE, 1), new Object[]{Items.GEM_TINY_TANZANITE, Items.GEM_TINY_TANZANITE, Items.GEM_TINY_TANZANITE});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_TANZANITE, 3), new Object[]{Items.GEM_NORMAL_TANZANITE});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_SAPPHIRE, 1), new Object[]{Items.GEM_NORMAL_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE, Items.GEM_NORMAL_SAPPHIRE});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_SAPPHIRE, 3), new Object[]{Items.GEM_WHOLE_SAPPHIRE});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_SAPPHIRE, 1), new Object[]{Items.GEM_TINY_SAPPHIRE, Items.GEM_TINY_SAPPHIRE, Items.GEM_TINY_SAPPHIRE});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_SAPPHIRE, 3), new Object[]{Items.GEM_NORMAL_SAPPHIRE});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_RUBY, 1), new Object[]{Items.GEM_NORMAL_RUBY, Items.GEM_NORMAL_RUBY, Items.GEM_NORMAL_RUBY});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_RUBY, 3), new Object[]{Items.GEM_WHOLE_RUBY});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_RUBY, 1), new Object[]{Items.GEM_TINY_RUBY, Items.GEM_TINY_RUBY, Items.GEM_TINY_RUBY});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_RUBY, 3), new Object[]{Items.GEM_NORMAL_RUBY});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_PERIDOT, 1), new Object[]{Items.GEM_NORMAL_PERIDOT, Items.GEM_NORMAL_PERIDOT, Items.GEM_NORMAL_PERIDOT});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_PERIDOT, 3), new Object[]{Items.GEM_WHOLE_PERIDOT});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_PERIDOT, 1), new Object[]{Items.GEM_TINY_PERIDOT, Items.GEM_TINY_PERIDOT, Items.GEM_TINY_PERIDOT});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_PERIDOT, 3), new Object[]{Items.GEM_NORMAL_PERIDOT});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_MALACHITE, 1), new Object[]{Items.GEM_NORMAL_MALACHITE, Items.GEM_NORMAL_MALACHITE, Items.GEM_NORMAL_MALACHITE});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_MALACHITE, 3), new Object[]{Items.GEM_WHOLE_MALACHITE});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_MALACHITE, 1), new Object[]{Items.GEM_TINY_MALACHITE, Items.GEM_TINY_MALACHITE, Items.GEM_TINY_MALACHITE});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_MALACHITE, 3), new Object[]{Items.GEM_NORMAL_MALACHITE});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_EMERALD, 1), new Object[]{Items.GEM_NORMAL_EMERALD, Items.GEM_NORMAL_EMERALD, Items.GEM_NORMAL_EMERALD});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_EMERALD, 3), new Object[]{Items.GEM_WHOLE_EMERALD});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_EMERALD, 1), new Object[]{Items.GEM_TINY_EMERALD, Items.GEM_TINY_EMERALD, Items.GEM_TINY_EMERALD});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_EMERALD, 3), new Object[]{Items.GEM_NORMAL_EMERALD});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_AMBER, 1), new Object[]{Items.GEM_NORMAL_AMBER, Items.GEM_NORMAL_AMBER, Items.GEM_NORMAL_AMBER});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_AMBER, 3), new Object[]{Items.GEM_WHOLE_AMBER});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_AMBER, 1), new Object[]{Items.GEM_TINY_AMBER, Items.GEM_TINY_AMBER, Items.GEM_TINY_AMBER});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_AMBER, 3), new Object[]{Items.GEM_NORMAL_AMBER});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Item.diamond, 1), new Object[]{Items.GEM_NORMAL_DIAMOND, Items.GEM_NORMAL_DIAMOND, Items.GEM_NORMAL_DIAMOND});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_DIAMOND, 3), new Object[]{Item.diamond});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_DIAMOND, 1), new Object[]{Items.GEM_TINY_DIAMOND, Items.GEM_TINY_DIAMOND, Items.GEM_TINY_DIAMOND});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_DIAMOND, 3), new Object[]{Items.GEM_NORMAL_DIAMOND});


		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_WHOLE_BLACK_DIAMOND, 1), new Object[]{Items.GEM_NORMAL_BLACK_DIAMOND, Items.GEM_NORMAL_BLACK_DIAMOND, Items.GEM_NORMAL_BLACK_DIAMOND});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_BLACK_DIAMOND, 3), new Object[]{Items.GEM_WHOLE_BLACK_DIAMOND});

		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_NORMAL_BLACK_DIAMOND, 1), new Object[]{Items.GEM_TINY_BLACK_DIAMOND, Items.GEM_TINY_BLACK_DIAMOND, Items.GEM_TINY_BLACK_DIAMOND});
		RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(Items.GEM_TINY_BLACK_DIAMOND, 3), new Object[]{Items.GEM_NORMAL_BLACK_DIAMOND});

	}

	public static void initializeSmeltingRecipes() {
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_AMBER, Blocks.ORE_AMBER);
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_EMERALD, Blocks.ORE_EMERALD);
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_RUBY, Blocks.ORE_RUBY);
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_PERIDOT, Blocks.ORE_PERIDOT);
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_MALACHITE, Blocks.ORE_MALACHITE);
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_SAPPHIRE, Blocks.ORE_SAPPHIRE);
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_TANZANITE, Blocks.ORE_TANZANITE);
		RecipeHelper.Smelting.createRecipe(Items.GEM_WHOLE_TOPAZ, Blocks.ORE_TOPAZ);
		// NO DIAMOND
	}

	public static void initializeBlastingRecipes() {
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_AMBER, Blocks.ORE_AMBER);
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_EMERALD, Blocks.ORE_EMERALD);
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_RUBY, Blocks.ORE_RUBY);
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_PERIDOT, Blocks.ORE_PERIDOT);
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_MALACHITE, Blocks.ORE_MALACHITE);
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_SAPPHIRE, Blocks.ORE_SAPPHIRE);
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_TANZANITE, Blocks.ORE_TANZANITE);
		RecipeHelper.Blasting.createRecipe(Items.GEM_WHOLE_TOPAZ, Blocks.ORE_TOPAZ);
		// NO DIAMOND
	}

	public static void onInitialize() {
		initializeCraftingRecipes();
		initializeSmeltingRecipes();
		initializeBlastingRecipes();
	}

}

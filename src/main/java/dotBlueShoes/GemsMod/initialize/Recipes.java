package dotBlueShoes.GemsMod.initialize;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeHelper;

public class Recipes {

	final static String[] RECIPE_AXE = {
		" AA",
		" BA",
		" B "
	};

	final static String[] RECIPE_HOE = {
		" AA",
		" B ",
		" B "
	};

	final static String[] RECIPE_PICKAXE = {
		"AAA",
		" B ",
		" B "
	};

	final static String[] RECIPE_SHOVEL = {
		" A ",
		" B ",
		" B "
	};

	final static String[] RECIPE_SWORD = {
		" A ",
		" A ",
		" B "
	};

	final static String[] RECIPE_HELMET = {
		"AAA",
		"A A",
		"   "
	};

	final static String[] RECIPE_CHESTPLATE = {
		"A A",
		"AAA",
		"AAA"
	};

	final static String[] RECIPE_LEGGINGS = {
		"AAA",
		"A A",
		"A A"
	};

	final static String[] RECIPE_BOOTS = {
		"   ",
		"A A",
		"A A"
	};

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


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_AMBER_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_AMBER,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_EMERALD_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_EMERALD,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_RUBY_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_RUBY,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_PERIDOT_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_PERIDOT,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_MALACHITE_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_MALACHITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_SAPPHIRE_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_SAPPHIRE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TANZANITE_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_TANZANITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TOPAZ_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_TOPAZ,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_BLACK_DIAMOND_AXE, 1), new Object[]{
			RECIPE_AXE,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND,
			'B', Item.stick
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_AMBER_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_AMBER,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_EMERALD_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_EMERALD,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_RUBY_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_RUBY,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_PERIDOT_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_PERIDOT,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_MALACHITE_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_MALACHITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_SAPPHIRE_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_SAPPHIRE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TANZANITE_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_TANZANITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TOPAZ_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_TOPAZ,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_BLACK_DIAMOND_HOE, 1), new Object[]{
			RECIPE_HOE,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND,
			'B', Item.stick
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_AMBER_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_AMBER,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_EMERALD_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_EMERALD,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_RUBY_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_RUBY,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_PERIDOT_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_PERIDOT,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_MALACHITE_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_MALACHITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_SAPPHIRE_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_SAPPHIRE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TANZANITE_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_TANZANITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TOPAZ_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_TOPAZ,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_BLACK_DIAMOND_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND,
			'B', Item.stick
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_AMBER_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_AMBER,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_EMERALD_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_EMERALD,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_RUBY_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_RUBY,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_PERIDOT_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_PERIDOT,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_MALACHITE_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_MALACHITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_SAPPHIRE_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_SAPPHIRE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TANZANITE_PICKAXE, 1), new Object[]{
			RECIPE_PICKAXE,
			'A', Items.GEM_WHOLE_TANZANITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TOPAZ_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_TOPAZ,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_BLACK_DIAMOND_SHOVEL, 1), new Object[]{
			RECIPE_SHOVEL,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND,
			'B', Item.stick
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_AMBER_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_AMBER,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_EMERALD_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_EMERALD,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_RUBY_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_RUBY,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_PERIDOT_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_PERIDOT,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_MALACHITE_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_MALACHITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_SAPPHIRE_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_SAPPHIRE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TANZANITE_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_TANZANITE,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_TOPAZ_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_TOPAZ,
			'B', Item.stick
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.GEM_BLACK_DIAMOND_SWORD, 1), new Object[]{
			RECIPE_SWORD,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND,
			'B', Item.stick
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_AMBER_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_AMBER
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_EMERALD_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_EMERALD
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_RUBY_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_RUBY
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_PERIDOT_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_PERIDOT
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_MALACHITE_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_MALACHITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_SAPPHIRE_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_SAPPHIRE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TANZANITE_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_TANZANITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TOPAZ_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_TOPAZ
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_BLACK_DIAMOND_HELMET, 1), new Object[]{
			RECIPE_HELMET,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_AMBER_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_AMBER
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_EMERALD_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_EMERALD
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_RUBY_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_RUBY
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_PERIDOT_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_PERIDOT
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_MALACHITE_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_MALACHITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_SAPPHIRE_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_SAPPHIRE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TANZANITE_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_TANZANITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TOPAZ_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_TOPAZ
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_BLACK_DIAMOND_CHESTPLATE, 1), new Object[]{
			RECIPE_CHESTPLATE,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_AMBER_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_AMBER
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_EMERALD_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_EMERALD
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_RUBY_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_RUBY
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_PERIDOT_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_PERIDOT
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_MALACHITE_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_MALACHITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_SAPPHIRE_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_SAPPHIRE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TANZANITE_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_TANZANITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TOPAZ_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_TOPAZ
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_BLACK_DIAMOND_LEGGINGS, 1), new Object[]{
			RECIPE_LEGGINGS,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND
		});


		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_AMBER_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_AMBER
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_EMERALD_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_EMERALD
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_RUBY_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_RUBY
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_PERIDOT_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_PERIDOT
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_MALACHITE_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_MALACHITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_SAPPHIRE_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_SAPPHIRE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TANZANITE_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_TANZANITE
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_TOPAZ_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_TOPAZ
		});

		RecipeHelper.Crafting.createRecipe(new ItemStack(Items.ARMOR_BLACK_DIAMOND_BOOTS, 1), new Object[]{
			RECIPE_BOOTS,
			'A', Items.GEM_WHOLE_BLACK_DIAMOND
		});
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

package dotBlueShoes.GemsMod;

import net.minecraft.core.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Global {

	public static Random rand = new Random();

	public static int defaultStartIdentifierBlock = Block.highestBlockId;
	public static int defaultStartIdentifierItem = 17000;

	public static boolean isDisabledWorldGen = false;       // Main
	public static boolean isOverrideDiamondWorldGen = true; // Dependant
	public static boolean isDisabledRecipes = false;        // Main
	public static boolean isOverrideDiamondOreDrops = true; // Dependant

	public static final String MOD_ID = "gems_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Colors

	public static final int COLOR_TOPAZ         = 0xDB7D43;
	public static final int COLOR_TANZANITE     = 0x521F99;
	public static final int COLOR_SAPPHIRE      = 0x1b6996;
	public static final int COLOR_RUBY          = 0xC91C56;
	public static final int COLOR_PERIDOT       = 0x487415;
	public static final int COLOR_MALACHITE     = 0x0a6a5a;
	public static final int COLOR_EMERALD       = 0x17dd62;
	public static final int COLOR_AMBER         = 0xE09528;
	public static final int COLOR_DIAMOND       = 0x20c5b5;
	public static final int COLOR_BLACK_DIAMOND = 0x545454;

	// Strings ...
	// TOPAZ "topaz" Topaz
	// TANZANITE "tanzanite" Tanzanite
	// SAPPHIRE "sapphire" Sapphire
	// RUBY "ruby" Ruby
	// PERIDOT "peridot" Peridot
	// MALACHITE "malachite" Malachite
	// EMERALD "emerald" Emerald
	// AMBER "amber" Amber
	// DIAMOND "diamond" Diamond
	// BLACK_DIAMOND "black_diamond" Black Diamond

	public static final String S_TOPAZ = "gem_topaz_";
	public static final String S_TANZANITE = "gem_tanzanite_";
	public static final String S_SAPPHIRE = "gem_sapphire_";
	public static final String S_RUBY = "gem_ruby_";
	public static final String S_PERIDOT = "gem_peridot_";
	public static final String S_MALACHITE = "gem_malachite_";
	public static final String S_EMERALD = "gem_emerald_";
	public static final String S_AMBER = "gem_amber_";
	public static final String S_DIAMOND = "gem_diamond_";
	public static final String S_BLACK_DIAMOND = "gem_black_diamond_";

	public static final String S_SWORD = "sword";
	public static final String S_AXE = "axe";
	public static final String S_PICKAXE = "pickaxe";
	public static final String S_SHOVEL = "shovel";
	public static final String S_HOE = "hoe";

	public static final String S_HELM = "helmet";
	public static final String S_CHESTPLATE = "chestplate";
	public static final String S_BOOTS = "boots";
	public static final String S_LEGGINGS = "leggings";

}

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

	public static final int COLOR_TOPAZ         = 0xDB7D43; // armor - 643b1d
	public static final int COLOR_TANZANITE     = 0x521F99; // 2f0f5c
	public static final int COLOR_SAPPHIRE      = 0x1b6996; // 175274
	public static final int COLOR_RUBY          = 0xC91C56; // 811130
	public static final int COLOR_PERIDOT       = 0x487415; // 415e1e
	public static final int COLOR_MALACHITE     = 0x0a6a5a; // 216a5e
	public static final int COLOR_EMERALD       = 0x17dd62; // 0d6e32
	public static final int COLOR_AMBER         = 0xE09528; // 8b580e
	public static final int COLOR_DIAMOND       = 0x20c5b5;
	public static final int COLOR_BLACK_DIAMOND = 0x545454; // 292929

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

	public static final String SS = "_";

	public static final String S_TOPAZ = "gem_topaz";
	public static final String S_TANZANITE = "gem_tanzanite";
	public static final String S_SAPPHIRE = "gem_sapphire";
	public static final String S_RUBY = "gem_ruby";
	public static final String S_PERIDOT = "gem_peridot";
	public static final String S_MALACHITE = "gem_malachite";
	public static final String S_EMERALD = "gem_emerald";
	public static final String S_AMBER = "gem_amber";
	public static final String S_DIAMOND = "gem_diamond";
	public static final String S_BLACK_DIAMOND = "gem_black_diamond";

	public static final String S_ORE = "ore";

	public static final String S_STONE = "stone";
	public static final String S_BASALT = "basalt";
	public static final String S_LIMESTONE = "limestone";
	public static final String S_GRANITE = "granite";

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

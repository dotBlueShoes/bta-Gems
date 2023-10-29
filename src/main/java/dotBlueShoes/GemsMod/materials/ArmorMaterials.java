package dotBlueShoes.GemsMod.materials;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.handlers.Registry;
import net.minecraft.core.item.material.ArmorMaterial;
import turniplabs.halplibe.helper.ArmorHelper;

public class ArmorMaterials {

	// DEFAULTS - DIAMOND
	static final int DEF_DURABILITY = 800;
	static final float DEF_COMBAT = 66.0f;
	static final float DEF_BLAST = 66.0f;
	static final float DEF_FIRE = 124.0f;
	static final float DEF_FALL = 66.0f;

	// STEPS - I am lazy :)
	static final int    S1 = 50;
	static final float  S2 = 9;
	static final float  S3 = 9;
	static final float  S4 = 23;
	static final float  S5 = 9;

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_TOPAZ = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_TOPAZ),
		DEF_DURABILITY - (2 * S1),
		DEF_COMBAT + (2 * S2),
		DEF_BLAST + (2 * S3),
		DEF_FIRE - (4 * S4),
		DEF_FALL + (1 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_TANZANITE = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_TANZANITE),
		DEF_DURABILITY + S1,
		DEF_COMBAT + (2 * S2),
		DEF_BLAST + (1 * S3),
		DEF_FIRE - (1 * S4),
		DEF_FALL - (2 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_SAPPHIRE = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_SAPPHIRE),
		DEF_DURABILITY - S1,
		DEF_COMBAT - (2 * S2),
		DEF_BLAST + (2 * S3),
		DEF_FIRE + (2 * S4),
		DEF_FALL - (2 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_RUBY = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_RUBY),
		DEF_DURABILITY - S1,
		DEF_COMBAT + (1 * S2),
		DEF_BLAST - (1 * S3),
		DEF_FIRE - (2 * S4),
		DEF_FALL + (2 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_PERIDOT = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_PERIDOT),
		DEF_DURABILITY + S1,
		DEF_COMBAT - (3 * S2),
		DEF_BLAST + (2 * S3),
		DEF_FIRE - (3 * S4),
		DEF_FALL + (2 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_MALACHITE = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_MALACHITE),
		DEF_DURABILITY + (2 * S1),
		DEF_COMBAT - (1 * S2),
		DEF_BLAST - (1 * S3),
		DEF_FIRE - (2 * S4),
		DEF_FALL - (1 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_EMERALD = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_EMERALD),
		DEF_DURABILITY - (4 * S1),
		DEF_COMBAT - (1 * S2),
		DEF_BLAST - (2 * S3),
		DEF_FIRE + (1 * S4),
		DEF_FALL + (2 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_AMBER = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_AMBER),
		DEF_DURABILITY,
		DEF_COMBAT + (1 * S2),
		DEF_BLAST - (1 * S3),
		DEF_FIRE + (1 * S4),
		DEF_FALL - (1 * S5)
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_BLACK_DIAMOND = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_BLACK_DIAMOND),
		(DEF_DURABILITY * 2) + 256,
		DEF_COMBAT + (6 * S2),
		DEF_BLAST + (2 * S3),
		DEF_FIRE + (2 * S4),
		DEF_FALL + (6 * S5)
	);

	public static final ArmorMaterial[] ARMOR_MATERIALS = {
		ARMOR_MATERIAL_GEM_TOPAZ,
		ARMOR_MATERIAL_GEM_TANZANITE,
		ARMOR_MATERIAL_GEM_SAPPHIRE,
		ARMOR_MATERIAL_GEM_RUBY,
		ARMOR_MATERIAL_GEM_PERIDOT,
		ARMOR_MATERIAL_GEM_MALACHITE,
		ARMOR_MATERIAL_GEM_EMERALD,
		ARMOR_MATERIAL_GEM_AMBER,
		ARMOR_MATERIAL_GEM_BLACK_DIAMOND,
	};

}

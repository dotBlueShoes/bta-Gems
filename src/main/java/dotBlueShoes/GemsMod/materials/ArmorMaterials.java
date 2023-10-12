package dotBlueShoes.GemsMod.materials;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.handlers.Registry;
import net.minecraft.core.item.material.ArmorMaterial;
import turniplabs.halplibe.helper.ArmorHelper;

public class ArmorMaterials {

	public static final int DEF_DURABILITY = 800;   // +50
	public static final float DEF_COMBAT = 66.0f;   // +10
	public static final float DEF_BLAST = 66.0f;    // +10
	public static final float DEF_FIRE = 124.0f;    // +10
	public static final float DEF_FALL = 66.0f;     // +10

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_TOPAZ = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_TOPAZ),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_TANZANITE = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_TANZANITE),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_SAPPHIRE = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_SAPPHIRE),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_RUBY = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_RUBY),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_PERIDOT = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_PERIDOT),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_MALACHITE = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_MALACHITE),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_EMERALD = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_EMERALD),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_AMBER = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_AMBER),
		800, 66.0f, 66.0f, 124.0f, 66.0f
	);

	public static final ArmorMaterial ARMOR_MATERIAL_GEM_BLACK_DIAMOND = ArmorHelper.createArmorMaterial(
		Registry.getModPath(Global.S_BLACK_DIAMOND),
		800, 66.0f, 66.0f, 124.0f, 66.0f
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

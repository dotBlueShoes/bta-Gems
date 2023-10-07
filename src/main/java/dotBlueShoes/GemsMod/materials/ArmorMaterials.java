package dotBlueShoes.GemsMod.materials;

import dotBlueShoes.GemsMod.handlers.Registry;
import net.minecraft.core.item.material.ArmorMaterial;

public class ArmorMaterials {

	private static final int INDEX_SPECIAL = -1;

	public static final ArmorMaterial ARMOR_MATERIAL_TOPAZ = new ArmorMaterial(
		Registry.getModKey("topaz"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_TANZANITE = new ArmorMaterial(
		Registry.getModKey("tanzanite"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = new ArmorMaterial(
		Registry.getModKey("sapphire"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = new ArmorMaterial(
		Registry.getModKey("ruby"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_PERIDOT = new ArmorMaterial(
		Registry.getModKey("peridot"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_MALACHITE = new ArmorMaterial(
		Registry.getModKey("malachite"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = new ArmorMaterial(
		Registry.getModKey("emerald"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_AMBER = new ArmorMaterial(
		Registry.getModKey("amber"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial ARMOR_MATERIAL_BLACK_DIAMOND = new ArmorMaterial(
		Registry.getModKey("black_diamond"),
		INDEX_SPECIAL,
		800
	);

	public static final ArmorMaterial[] ARMOR_MATERIALS = {
		ARMOR_MATERIAL_TOPAZ,
		ARMOR_MATERIAL_TANZANITE,
		ARMOR_MATERIAL_SAPPHIRE,
		ARMOR_MATERIAL_RUBY,
		ARMOR_MATERIAL_PERIDOT,
		ARMOR_MATERIAL_MALACHITE,
		ARMOR_MATERIAL_EMERALD,
		ARMOR_MATERIAL_AMBER,
		ARMOR_MATERIAL_BLACK_DIAMOND,
	};

}

package dotBlueShoes.GemsMod.materials;

import net.minecraft.core.item.material.ToolMaterial;

public class ToolMaterials {

	// DEFAULTS - DIAMOND
	static final int DEF_DURABILITY         = 1536;
	static final float DEF_EFFICIENCY       = 14.0f;
	static final float DEF_HASTE_EFFICIENCY = 30.0f;
	static final int DEF_DAMAGE           = 4;
	static final int DEF_BLOCK_HIT_DELAY  = 4;

	// STEPS - I am lazy :)
	static final int    S1 = 192;
	static final float  S2 = 4;
	static final float  S3 = 6;
	static final int    S4 = 1;

	public static final ToolMaterial TOOL_MATERIAL_GEM_TOPAZ = new ToolMaterial()
		.setDurability(DEF_DURABILITY - S1)
		.setEfficiency(DEF_EFFICIENCY + S2, DEF_HASTE_EFFICIENCY - (2 * S3))
		.setMiningLevel(3)
		.setDamage(DEF_DAMAGE + S4)
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY)
		.setSilkTouch(true);

	public static final ToolMaterial TOOL_MATERIAL_GEM_TANZANITE = new ToolMaterial()
		.setDurability(DEF_DURABILITY + S1)
		.setEfficiency(DEF_EFFICIENCY - (2 * S2), DEF_HASTE_EFFICIENCY - (2 * S3))
		.setMiningLevel(3)
		.setDamage(DEF_DAMAGE + S4)
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY);

	public static final ToolMaterial TOOL_MATERIAL_GEM_SAPPHIRE = new ToolMaterial()
		.setDurability(DEF_DURABILITY + S1)
		.setEfficiency(DEF_EFFICIENCY - S2, DEF_HASTE_EFFICIENCY)
		.setMiningLevel(3)
		.setDamage(DEF_DAMAGE - S4)
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY);

	public static final ToolMaterial TOOL_MATERIAL_GEM_RUBY = new ToolMaterial()
		.setDurability(DEF_DURABILITY - (2 * S1))
		.setEfficiency(DEF_EFFICIENCY, DEF_HASTE_EFFICIENCY)
		.setMiningLevel(3)
		.setDamage(DEF_DAMAGE + S4)
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY);

	public static final ToolMaterial TOOL_MATERIAL_GEM_PERIDOT = new ToolMaterial()
		.setDurability(DEF_DURABILITY + S1)
		.setEfficiency(DEF_EFFICIENCY - (1 * S2), DEF_HASTE_EFFICIENCY + (1 * S3))
		.setMiningLevel(3)
		.setDamage(DEF_DAMAGE)
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY);

	public static final ToolMaterial TOOL_MATERIAL_GEM_MALACHITE = new ToolMaterial()
		.setDurability(DEF_DURABILITY - (6 * S1))
		.setEfficiency(DEF_EFFICIENCY - (3 * S2), DEF_HASTE_EFFICIENCY - (3 * S3))
		.setMiningLevel(4)
		.setDamage(DEF_DAMAGE - S4)
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY);

	public static final ToolMaterial TOOL_MATERIAL_GEM_EMERALD = new ToolMaterial()
		.setDurability(DEF_DURABILITY - (2 * S1))
		.setEfficiency(DEF_EFFICIENCY + (2 * S2), DEF_HASTE_EFFICIENCY + (2 * S3))
		.setMiningLevel(3)
		.setDamage(DEF_DAMAGE - (2 * S4))
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY);

	public static final ToolMaterial TOOL_MATERIAL_GEM_AMBER = new ToolMaterial()
		.setDurability(DEF_DURABILITY + (6 * S1))
		.setEfficiency(DEF_EFFICIENCY + S2, DEF_HASTE_EFFICIENCY - (3 * S3))
		.setMiningLevel(3)
		.setDamage(DEF_DAMAGE - (2 * S4))
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY);

	public static final ToolMaterial TOOL_MATERIAL_GEM_BLACK_DIAMOND = new ToolMaterial()
		.setDurability(DEF_DURABILITY * 2)
		.setEfficiency(DEF_EFFICIENCY, DEF_HASTE_EFFICIENCY)
		.setMiningLevel(4)
		.setDamage(DEF_DAMAGE)
		.setBlockHitDelay(DEF_BLOCK_HIT_DELAY)
		.setSilkTouch(true);

	public static final ToolMaterial[] TOOL_MATERIALS = {
		TOOL_MATERIAL_GEM_TOPAZ,
		TOOL_MATERIAL_GEM_TANZANITE,
		TOOL_MATERIAL_GEM_SAPPHIRE,
		TOOL_MATERIAL_GEM_RUBY,
		TOOL_MATERIAL_GEM_PERIDOT,
		TOOL_MATERIAL_GEM_MALACHITE,
		TOOL_MATERIAL_GEM_EMERALD,
		TOOL_MATERIAL_GEM_AMBER,
		TOOL_MATERIAL_GEM_BLACK_DIAMOND
	};

}

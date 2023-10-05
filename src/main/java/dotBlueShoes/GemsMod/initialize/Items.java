package dotBlueShoes.GemsMod.initialize;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.items.*;
import dotBlueShoes.GemsMod.utility.Registry;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;

public class Items {

	public static final GemItem GEM_WHOLE_TOPAZ = new GemItem(
		Registry.GetModKey("gem_whole_topaz"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(0, 0);

	public static final GemItem GEM_NORMAL_TOPAZ = new GemItem(
		Registry.GetModKey("gem_normal_topaz"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(0, 1);

	public static final GemItem GEM_TINY_TOPAZ = new GemItem(
		Registry.GetModKey("gem_tiny_topaz"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(0, 2);

	public static final GemItem GEM_WHOLE_TANZANITE = new GemItem(
		Registry.GetModKey("gem_whole_tanzanite"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(1, 0);

	public static final GemItem GEM_NORMAL_TANZANITE = new GemItem(
		Registry.GetModKey("gem_normal_tanzanite"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(1, 1);

	public static final GemItem GEM_TINY_TANZANITE = new GemItem(
		Registry.GetModKey("gem_tiny_tanzanite"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(1, 2);

	public static final GemItem GEM_WHOLE_SAPPHIRE = new GemItem(
		Registry.GetModKey("gem_whole_sapphire"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(2, 0);

	public static final GemItem GEM_NORMAL_SAPPHIRE = new GemItem(
		Registry.GetModKey("gem_normal_sapphire"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(2, 1);

	public static final GemItem GEM_TINY_SAPPHIRE = new GemItem(
		Registry.GetModKey("gem_tiny_sapphire"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(2, 2);

	public static final GemItem GEM_WHOLE_RUBY = new GemItem(
		Registry.GetModKey("gem_whole_ruby"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(3, 0);

	public static final GemItem GEM_NORMAL_RUBY = new GemItem(
		Registry.GetModKey("gem_normal_ruby"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(3, 1);

	public static final GemItem GEM_TINY_RUBY = new GemItem(
		Registry.GetModKey("gem_tiny_ruby"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(3, 2);

	public static final GemItem GEM_WHOLE_PERIDOT = new GemItem(
		Registry.GetModKey("gem_whole_peridot"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(4, 0);

	public static final GemItem GEM_NORMAL_PERIDOT = new GemItem(
		Registry.GetModKey("gem_normal_peridot"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(4, 1);

	public static final GemItem GEM_TINY_PERIDOT = new GemItem(
		Registry.GetModKey("gem_tiny_peridot"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(4, 2);

	public static final GemItem GEM_WHOLE_MALACHITE = new GemItem(
		Registry.GetModKey("gem_whole_malachite"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(5, 0);

	public static final GemItem GEM_NORMAL_MALACHITE = new GemItem(
		Registry.GetModKey("gem_normal_malachite"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(5, 1);

	public static final GemItem GEM_TINY_MALACHITE = new GemItem(
		Registry.GetModKey("gem_tiny_malachite"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(5, 2);

	public static final GemItem GEM_WHOLE_EMERALD = new GemItem(
		Registry.GetModKey("gem_whole_emerald"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(6, 0);

	public static final GemItem GEM_NORMAL_EMERALD = new GemItem(
		Registry.GetModKey("gem_normal_emerald"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(6, 1);

	public static final GemItem GEM_TINY_EMERALD = new GemItem(
		Registry.GetModKey("gem_tiny_emerald"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(6, 2);

	public static final GemItem GEM_WHOLE_AMBER = new GemItem(
		Registry.GetModKey("gem_whole_amber"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(7, 0);

	public static final GemItem GEM_NORMAL_AMBER = new GemItem(
		Registry.GetModKey("gem_normal_amber"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(7, 1);

	public static final GemItem GEM_TINY_AMBER = new GemItem(
		Registry.GetModKey("gem_tiny_amber"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(7, 2);

	public static final GemItem GEM_NORMAL_DIAMOND = new GemItem(
		Registry.GetModKey("gem_normal_diamond"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(8, 1);

	public static final GemItem GEM_TINY_DIAMOND = new GemItem(
		Registry.GetModKey("gem_tiny_diamond"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(8, 2);

	public static final GemItem GEM_WHOLE_BLACK_DIAMOND = new GemItem(
		Registry.GetModKey("gem_whole_black_diamond"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(9, 0);

	public static final GemItem GEM_NORMAL_BLACK_DIAMOND = new GemItem(
		Registry.GetModKey("gem_normal_black_diamond"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(9, 1);

	public static final GemItem GEM_TINY_BLACK_DIAMOND = new GemItem(
		Registry.GetModKey("gem_tiny_black_diamond"),
		Registry.GetNewItemId(),
		SpriteAtlases.gemsSpriteAtlas
	).setSpriteCoord(9, 2);

	// SWORDS

	public static final GemToolSwordItem GEM_TOPAZ_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TOPAZ
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_TANZANITE_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TANZANITE
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_SAPPHIRE_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_RUBY_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_RUBY
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_PERIDOT_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_PERIDOT
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_MALACHITE_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_MALACHITE
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_EMERALD_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_EMERALD
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_AMBER_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_AMBER
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	public static final GemToolSwordItem GEM_BLACK_DIAMOND_SWORD = new GemToolSwordItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_SWORD),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(0, 7)
		.setOverlayCoord(9, 3);

	// SHOVELS

	public static final GemToolShovelItem GEM_TOPAZ_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TOPAZ
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_TANZANITE_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TANZANITE
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_SAPPHIRE_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_RUBY_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_RUBY
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_PERIDOT_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_PERIDOT
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_MALACHITE_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_MALACHITE
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_EMERALD_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_EMERALD
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_AMBER_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_AMBER
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	public static final GemToolShovelItem GEM_BLACK_DIAMOND_SHOVEL = new GemToolShovelItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_SHOVEL),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(1, 7)
		.setOverlayCoord(9, 4);

	// PICKAXES

	public static final GemToolPickaxeItem GEM_TOPAZ_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TOPAZ
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_TANZANITE_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TANZANITE
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_SAPPHIRE_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_RUBY_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_RUBY
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_PERIDOT_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_PERIDOT
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_MALACHITE_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_MALACHITE
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_EMERALD_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_EMERALD
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_AMBER_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_AMBER
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	public static final GemToolPickaxeItem GEM_BLACK_DIAMOND_PICKAXE = new GemToolPickaxeItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_PICKAXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(2, 7)
		.setOverlayCoord(9, 5);

	// AXES

	public static final GemToolAxeItem GEM_TOPAZ_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TOPAZ
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_TANZANITE_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TANZANITE
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_SAPPHIRE_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_RUBY_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_RUBY
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_PERIDOT_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_PERIDOT
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_MALACHITE_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_MALACHITE
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_EMERALD_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_EMERALD
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_AMBER_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_AMBER
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	public static final GemToolAxeItem GEM_BLACK_DIAMOND_AXE = new GemToolAxeItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_AXE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(3, 7)
		.setOverlayCoord(9, 6);

	// HOES

	public static final GemToolHoeItem GEM_TOPAZ_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TOPAZ
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_TANZANITE_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_TANZANITE
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_SAPPHIRE_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_RUBY_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_RUBY
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_PERIDOT_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_PERIDOT
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_MALACHITE_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_MALACHITE
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_EMERALD_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_EMERALD
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_AMBER_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_AMBER
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	public static final GemToolHoeItem GEM_BLACK_DIAMOND_HOE = new GemToolHoeItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_HOE),
		Registry.GetNewItemId(),
		ToolMaterial.diamond,
		SpriteAtlases.gemsSpriteAtlas,
		Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(4, 7)
		.setOverlayCoord(9, 7);

	//public static final Item ARMOR_TOPAZ_HELMET = new ItemArmor(
	//	Registry.GetModKey(Global.S_TOPAZ + Global.S_HELM), Registry.GetNewItemId(), ArmorMaterial.diamond, 0
	//).setIconCoord(0, 0);

	//public static final Item ARMOR_TOPAZ_CHESTPLATE = new ItemArmor(
	//	Registry.GetModKey(Global.S_TOPAZ + Global.S_CHESTPLATE), Registry.GetNewItemId(), ArmorMaterial.diamond, 1
	//).setIconCoord(0, 1);

	//public static final Item ARMOR_TOPAZ_LEGGINGS = new ItemArmor(
	//	Registry.GetModKey(Global.S_TOPAZ + Global.S_LEGGINGS), Registry.GetNewItemId(), ArmorMaterial.diamond, 2
	//).setIconCoord(0, 2);

	//public static final Item ARMOR_TOPAZ_BOOTS = new ItemArmor(
	//	Registry.GetModKey(Global.S_TOPAZ + Global.S_BOOTS), Registry.GetNewItemId(), ArmorMaterial.diamond, 3
	//).setIconCoord(0, 3);

	public static final GemArmorItem ARMOR_TOPAZ_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TOPAZ
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_TOPAZ_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TOPAZ
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_TOPAZ_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TOPAZ
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_TOPAZ_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_TOPAZ + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TOPAZ
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_TANZANITE_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TANZANITE
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_TANZANITE_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TANZANITE
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_TANZANITE_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TANZANITE
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_TANZANITE_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_TANZANITE
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_SAPPHIRE_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_SAPPHIRE_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_SAPPHIRE_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_TANZANITE + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_SAPPHIRE_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_SAPPHIRE + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_SAPPHIRE
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_RUBY_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_RUBY
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_RUBY_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_RUBY
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_RUBY_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_RUBY
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_RUBY_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_RUBY + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_RUBY
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_PERIDOT_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_PERIDOT
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_PERIDOT_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_PERIDOT
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_PERIDOT_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_PERIDOT
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_PERIDOT_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_PERIDOT + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_PERIDOT
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_MALACHITE_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_MALACHITE
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_MALACHITE_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_MALACHITE
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_MALACHITE_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_MALACHITE
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_MALACHITE_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_MALACHITE + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_MALACHITE
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_EMERALD_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_EMERALD
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_EMERALD_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_EMERALD
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_EMERALD_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_EMERALD
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_EMERALD_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_EMERALD + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_EMERALD
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_AMBER_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_AMBER
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_AMBER_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_AMBER
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_AMBER_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_AMBER
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_AMBER_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_AMBER + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_AMBER
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);


	public static final GemArmorItem ARMOR_BLACK_DIAMOND_HELMET = new GemArmorItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_HELM), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 0,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(5, 7)
		.setOverlayCoord(8, 3);

	public static final GemArmorItem ARMOR_BLACK_DIAMOND_CHESTPLATE = new GemArmorItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_CHESTPLATE), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 1,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(6, 7)
		.setOverlayCoord(8, 4);

	public static final GemArmorItem ARMOR_BLACK_DIAMOND_LEGGINGS = new GemArmorItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_LEGGINGS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 2,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(7, 7)
		.setOverlayCoord(8, 5);

	public static final GemArmorItem ARMOR_BLACK_DIAMOND_BOOTS = new GemArmorItem(
		Registry.GetModKey(Global.S_BLACK_DIAMOND + Global.S_BOOTS), Registry.GetNewItemId(),
		ArmorMaterial.diamond, 3,
		SpriteAtlases.gemsSpriteAtlas, Global.COLOR_BLACK_DIAMOND
	)   .setSpriteCoord(8, 7)
		.setOverlayCoord(8, 6);

	public static final Item[] ITEMS = {
		GEM_WHOLE_TOPAZ,
		GEM_NORMAL_TOPAZ,
		GEM_TINY_TOPAZ,
		GEM_WHOLE_TANZANITE,
		GEM_NORMAL_TANZANITE,
		GEM_TINY_TANZANITE,
		GEM_WHOLE_SAPPHIRE,
		GEM_NORMAL_SAPPHIRE,
		GEM_TINY_SAPPHIRE,
		GEM_WHOLE_RUBY,
		GEM_NORMAL_RUBY,
		GEM_TINY_RUBY,
		GEM_WHOLE_PERIDOT,
		GEM_NORMAL_PERIDOT,
		GEM_TINY_PERIDOT,
		GEM_WHOLE_MALACHITE,
		GEM_NORMAL_MALACHITE,
		GEM_TINY_MALACHITE,
		GEM_WHOLE_EMERALD,
		GEM_NORMAL_EMERALD,
		GEM_TINY_EMERALD,
		GEM_WHOLE_AMBER,
		GEM_NORMAL_AMBER,
		GEM_TINY_AMBER,
		GEM_NORMAL_DIAMOND,
		GEM_TINY_DIAMOND,
		GEM_WHOLE_BLACK_DIAMOND,
		GEM_NORMAL_BLACK_DIAMOND,
		GEM_TINY_BLACK_DIAMOND,

		ARMOR_TOPAZ_HELMET,
		ARMOR_TOPAZ_CHESTPLATE,
		ARMOR_TOPAZ_LEGGINGS,
		ARMOR_TOPAZ_BOOTS,

		ARMOR_TANZANITE_HELMET,
		ARMOR_TANZANITE_CHESTPLATE,
		ARMOR_TANZANITE_LEGGINGS,
		ARMOR_TANZANITE_BOOTS,

		ARMOR_SAPPHIRE_HELMET,
		ARMOR_SAPPHIRE_CHESTPLATE,
		ARMOR_SAPPHIRE_LEGGINGS,
		ARMOR_SAPPHIRE_BOOTS,

		ARMOR_RUBY_HELMET,
		ARMOR_RUBY_CHESTPLATE,
		ARMOR_RUBY_LEGGINGS,
		ARMOR_RUBY_BOOTS,

		ARMOR_PERIDOT_HELMET,
		ARMOR_PERIDOT_CHESTPLATE,
		ARMOR_PERIDOT_LEGGINGS,
		ARMOR_PERIDOT_BOOTS,

		ARMOR_MALACHITE_HELMET,
		ARMOR_MALACHITE_CHESTPLATE,
		ARMOR_MALACHITE_LEGGINGS,
		ARMOR_MALACHITE_BOOTS,

		ARMOR_EMERALD_HELMET,
		ARMOR_EMERALD_CHESTPLATE,
		ARMOR_EMERALD_LEGGINGS,
		ARMOR_EMERALD_BOOTS,

		ARMOR_AMBER_HELMET,
		ARMOR_AMBER_CHESTPLATE,
		ARMOR_AMBER_LEGGINGS,
		ARMOR_AMBER_BOOTS,

		ARMOR_BLACK_DIAMOND_HELMET,
		ARMOR_BLACK_DIAMOND_CHESTPLATE,
		ARMOR_BLACK_DIAMOND_LEGGINGS,
		ARMOR_BLACK_DIAMOND_BOOTS,
	};


	public static void onInitialize() {
		//Item.diamond.
		//GEM_TINY_DIAMOND.set
	}

}

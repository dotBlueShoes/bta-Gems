package dotBlueShoes.GemsMod.blocks;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.handlers.BreakResult;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class GemOreBlock extends Block {

	private final Item[] breakResult;

	public GemOreBlock(String key, int id, Material material, Item[] breakResult) {
		super(key, id, material);
		this.breakResult = breakResult;
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK:
				return new ItemStack[]{new ItemStack(this)};
			case PROPER_TOOL:
				return BreakResult.GetPoolsBreakResult(breakResult);
			default:
				return null;
		}
	}

}

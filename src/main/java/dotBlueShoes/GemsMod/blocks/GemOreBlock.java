package dotBlueShoes.GemsMod.blocks;

import dotBlueShoes.GemsMod.Global;
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

	private final static int MIN_WHOLE = 0;
	private final static int MIN_NORMAL = 1;
	private final static int MIN_TINY = 1;

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
				return new ItemStack[]{
					new ItemStack(breakResult[0], MIN_WHOLE + Global.rand.nextInt(2)),
					new ItemStack(breakResult[1], MIN_NORMAL + Global.rand.nextInt(2)),
					new ItemStack(breakResult[2], MIN_TINY + Global.rand.nextInt(4)),
				};
			default:
				return null;
		}
	}

}

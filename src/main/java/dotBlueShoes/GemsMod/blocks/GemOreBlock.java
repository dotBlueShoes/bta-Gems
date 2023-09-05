package dotBlueShoes.GemsMod.blocks;

import dotBlueShoes.atlas_lib.utility.ISpriteAtlasBlock;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class GemOreBlock extends Block implements ISpriteAtlasBlock {

	private SpriteAtlas spriteAtlas;
	private final Item[] breakResult;
	public GemOreBlock(String key, int id, Material material, SpriteAtlas spriteAtlas, Item[] breakResult) {
		super(key, id, material);
		this.spriteAtlas = spriteAtlas;
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
					new ItemStack(breakResult[0], 1),
					new ItemStack(breakResult[1], 2),
					new ItemStack(breakResult[2], 3),
				};
			default:
				return null;
		}
	}

	public Block setFullBlockCoord(int x, int y) {
		setSpriteCoord(Side.TOP.getId(), x, y);
		setSpriteCoord(Side.BOTTOM.getId(), x, y);
		setSpriteCoord(Side.NORTH.getId(), x, y);
		setSpriteCoord(Side.EAST.getId(), x, y);
		setSpriteCoord(Side.SOUTH.getId(), x, y);
		setSpriteCoord(Side.WEST.getId(), x, y);
		return this;
	}

	@Override
	public int getSpriteIndex(int side) {
		return this.atlasIndices[side];
	}

	@Override
	public GemOreBlock setSpriteCoord(int side, int x, int y) {
		this.atlasIndices[side] = this.spriteAtlas.spriteCoordToIndex(x, y);
		return this;
	}

	@Override
	public SpriteAtlas getSpriteAtlas() {
		return spriteAtlas;
	}

	@Override
	public void setSpriteAtlas(SpriteAtlas spriteAtlas) {
		this.spriteAtlas = spriteAtlas;
	}
}

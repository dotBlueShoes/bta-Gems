package dotBlueShoes.GemsMod.blocks;

import dotBlueShoes.GemsMod.util.Registry;
import dotBlueShoes.GemsMod.util.TextureAtlas;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.helper.Side;

public class AtlasSpriteBlock extends Block {

	public TextureAtlas textureAtlas;

	public AtlasSpriteBlock(String name, Material material, TextureAtlas textureAtlas) {
		super(name, Registry.GetNewBlockId(), material);
		this.textureAtlas = textureAtlas;
	}

	public int spriteCoordToIndex(int x, int y) {
		return x + y * textureAtlas.elements.x;
	}

	public Block setFullBlockCoord(int x, int y) {
		atlasIndices[Side.TOP.getId()] = this.spriteCoordToIndex(x, y);
		atlasIndices[Side.BOTTOM.getId()] = this.spriteCoordToIndex(x, y);
		atlasIndices[Side.NORTH.getId()] = this.spriteCoordToIndex(x, y);
		atlasIndices[Side.EAST.getId()] = this.spriteCoordToIndex(x, y);
		atlasIndices[Side.SOUTH.getId()] = this.spriteCoordToIndex(x, y);
		atlasIndices[Side.WEST.getId()] = this.spriteCoordToIndex(x, y);
		return this;
	}

	public Block setBlockSideCoord(int side, int x, int y) {
		atlasIndices[side] = this.spriteCoordToIndex(x, y);
		return this;
	}

}

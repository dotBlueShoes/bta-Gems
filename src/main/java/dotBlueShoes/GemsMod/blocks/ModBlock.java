package dotBlueShoes.GemsMod.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;

public class ModBlock extends Block {
	public ModBlock(String key, int id, Material material, float hardness) {
		super(key, id, material);
		//withHardness(hardness);
	}
}

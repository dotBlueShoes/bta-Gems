package dotBlueShoes.GemsMod.mixin.mixins;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.blocks.GemOreBlock;
import dotBlueShoes.GemsMod.initialize.Items;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreDiamond;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

@Mixin(
	value = { BlockOreDiamond.class },
	remap = false
)
public abstract class BlockOreDiamondMixin extends Block {

	// It failed prev. because those items (my mod items) are not existing at that time.
	//private final Item[] breakResult = { Item.diamond, Items.GEM_NORMAL_DIAMOND, Items.GEM_TINY_DIAMOND };

	public BlockOreDiamondMixin(String key, int id, Material material) {
		super(key, id, material);
	}

	/**
	 * @author dotBlueShoes
	 * @reason I want a clear replace here simply.
	 */
	@Overwrite @Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK:
				return new ItemStack[]{new ItemStack((BlockOreDiamond)(Object)this)};
			case PROPER_TOOL:
				return new ItemStack[]{
					new ItemStack(Item.diamond, GemOreBlock.MIN_WHOLE + Global.rand.nextInt(2)),
					new ItemStack(Items.GEM_NORMAL_DIAMOND, GemOreBlock.MIN_NORMAL + Global.rand.nextInt(2)),
					new ItemStack(Items.GEM_TINY_DIAMOND, GemOreBlock.MIN_TINY + Global.rand.nextInt(3)),
				};
			default:
				return null;
		}
	}

}

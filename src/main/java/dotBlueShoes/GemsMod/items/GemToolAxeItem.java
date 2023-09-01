package dotBlueShoes.GemsMod.items;

import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolAxe;
import useless.prismaticlibe.IColored;

public class GemToolAxeItem extends ItemToolAxe implements IColored {

	public GemToolAxeItem(String name, int id, ToolMaterial enumtoolmaterial) {
		super(name, id, enumtoolmaterial);
	}

	@Override
	public int baseColor() {
		return 0;
	}

	@Override
	public int overlayColor() {
		return 0;
	}

	@Override
	public int[] baseTexture() {
		return new int[0];
	}

	@Override
	public int[] overlayTexture() {
		return new int[0];
	}

}

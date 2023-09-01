package dotBlueShoes.GemsMod.items;

import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolHoe;
import useless.prismaticlibe.IColored;

public class GemToolHoeItem extends ItemToolHoe implements IColored {

	public GemToolHoeItem(String name, int id, ToolMaterial enumtoolmaterial) {
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

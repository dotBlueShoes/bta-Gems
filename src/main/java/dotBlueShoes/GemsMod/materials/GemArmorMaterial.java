package dotBlueShoes.GemsMod.materials;

import net.minecraft.core.item.material.ArmorMaterial;
import useless.prismaticlibe.IColored;

public class GemArmorMaterial extends ArmorMaterial implements IColored {

	private final int color;

	public GemArmorMaterial(String name, int renderIndex, int durability, int color) {
		super(name, renderIndex, durability);
		this.color = color;
	}

	@Override
	public int baseColor() {
		return color;
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

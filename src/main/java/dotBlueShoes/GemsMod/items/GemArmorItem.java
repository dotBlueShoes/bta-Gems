package dotBlueShoes.GemsMod.items;

import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import useless.prismaticlibe.IColored;

public class GemArmorItem extends ItemArmor implements IColored {

	public GemArmorItem(String name, int id, ArmorMaterial material, int armorPiece) {
		super(name, id, material, armorPiece);
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

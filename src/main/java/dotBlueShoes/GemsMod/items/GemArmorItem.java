package dotBlueShoes.GemsMod.items;

import dotBlueShoes.atlas_lib.utility.ISpriteAtlas;
import dotBlueShoes.atlas_lib.utility.ISpriteAtlasItem;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import useless.prismaticlibe.IColored;

public class GemArmorItem extends ItemArmor implements IColored, ISpriteAtlasItem {

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

	@Override
	public int getSpriteIndex() {
		return 0;
	}

	@Override
	public ISpriteAtlas setSpriteCoord(int i, int i1) {
		return null;
	}

	@Override
	public SpriteAtlas getSpriteAtlas() {
		return null;
	}

	@Override
	public void setSpriteAtlas(SpriteAtlas spriteAtlas) {

	}
}

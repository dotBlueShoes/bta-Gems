package dotBlueShoes.GemsMod.items;

import dotBlueShoes.atlas_lib.utility.ISpriteAtlasItem;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import useless.prismaticlibe.IColored;

public class GemArmorItem extends ItemArmor implements IColored, ISpriteAtlasItem {

	private SpriteAtlas spriteAtlas;
	private final int color;
	private final int[] coordOverlay = new int[2];

	public GemArmorItem(String name, int id, ArmorMaterial material, int armorPiece, SpriteAtlas spriteAtlas, int color) {
		super(name, id, material, armorPiece);
		this.spriteAtlas = spriteAtlas;
		this.color = color;
	}

	@Override
	public int baseColor() {
		return color;
	}

	@Override
	public int overlayColor() {
		return 0xffffff;
	}

	@Override
	public int[] baseTexture() {
		return new int[] {
			this.spriteAtlas.spriteIndexToCoord(this.iconIndex).x,
			this.spriteAtlas.spriteIndexToCoord(this.iconIndex).y
		};
	}

	@Override
	public int[] overlayTexture() {
		return this.coordOverlay;
	}

	@Override
	public int getSpriteIndex() {
		return this.iconIndex;
	}

	@Override
	public GemArmorItem setSpriteCoord(int x, int y) {
		this.iconIndex = this.spriteAtlas.spriteCoordToIndex(x, y);
		return this;
	}

	public GemArmorItem setOverlayCoord(int x, int y) {
		coordOverlay[0] = x;
		coordOverlay[1] = y;
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


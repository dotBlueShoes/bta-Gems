package dotBlueShoes.GemsMod.items;

import dotBlueShoes.atlas_lib.utility.ISpriteAtlasItem;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;
import net.minecraft.core.item.Item;

public class GemItem extends Item implements ISpriteAtlasItem {

	private SpriteAtlas spriteAtlas;

	public GemItem(String key, int id, SpriteAtlas spriteAtlas) {
		super(id);
		this.spriteAtlas = spriteAtlas;
		this.setKey(key);
	}

	public int spriteCoordToIndex(int x, int y) {
		return x + y * this.spriteAtlas.elements.x;
	}

	@Override
	public int getSpriteIndex() {
		return this.iconIndex;
	}

	@Override
	public GemItem setSpriteCoord(int x, int y) {
		this.iconIndex = this.spriteCoordToIndex(x, y);
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

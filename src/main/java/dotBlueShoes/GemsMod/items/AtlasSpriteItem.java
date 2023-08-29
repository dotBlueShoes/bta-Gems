package dotBlueShoes.GemsMod.items;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.util.Registry;
import dotBlueShoes.GemsMod.util.TextureAtlas;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

public class AtlasSpriteItem extends Item {

	public TextureAtlas textureAtlas;

	public AtlasSpriteItem(String name, TextureAtlas textureAtlas) {
		super(Registry.GetNewItemId());
		this.textureAtlas = textureAtlas;
		this.setKey(Global.MOD_ID + "." + name);
	}

	public int spriteCoordToIndex(int x, int y) {
		return x + y * textureAtlas.elements.x;
	}

	public AtlasSpriteItem setItemCoord(int x, int y) {
		this.iconIndex = spriteCoordToIndex(x, y);
		return this;
	}

	public int getItemIndex() {
		return this.iconIndex;
	}

	@Override
	public Item setIconCoord(int x, int y) {
		return this.setItemCoord(x, y);
	}
}

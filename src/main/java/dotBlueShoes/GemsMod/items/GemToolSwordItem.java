package dotBlueShoes.GemsMod.items;

import dotBlueShoes.atlas_lib.utility.ISpriteAtlas;
import dotBlueShoes.atlas_lib.utility.ISpriteAtlasItem;
import dotBlueShoes.atlas_lib.utility.SpriteAtlas;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolSword;
import useless.prismaticlibe.IColored;

public class GemToolSwordItem extends ItemToolSword implements IColored, ISpriteAtlasItem {

	private SpriteAtlas spriteAtlas;
	private final int color;
	private final int[] coordBase = { 0, 7 };
	private final int[] coordOverlay = { 9, 3 };

	public GemToolSwordItem(String name, int id, ToolMaterial enumtoolmaterial, SpriteAtlas spriteAtlas, int color) {
		super(name, id, enumtoolmaterial);
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
		return this.coordBase;
	}

	@Override
	public int[] overlayTexture() {
		return this.coordOverlay;
	}

	public int spriteCoordToIndex(int x, int y) {
		return x + y * this.spriteAtlas.elements.x;
	}

	@Override
	public int getSpriteIndex() {
		return this.iconIndex;
	}

	@Override
	public GemToolSwordItem setSpriteCoord(int x, int y) {
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

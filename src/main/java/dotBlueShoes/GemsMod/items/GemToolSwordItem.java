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
	private final int[] coordOverlay = new int[2];

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
	public GemToolSwordItem setSpriteCoord(int x, int y) {
		this.iconIndex = this.spriteAtlas.spriteCoordToIndex(x, y);
		return this;
	}

	public GemToolSwordItem setOverlayCoord(int x, int y) {
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

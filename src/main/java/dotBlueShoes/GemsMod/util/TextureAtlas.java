package dotBlueShoes.GemsMod.util;

public class TextureAtlas {

	private final String pathname;
	private final String modid;
	public final Pair<Integer> elements;
	public final int resolution;

	public TextureAtlas(String modid, String pathname, Pair<Integer> elements, int resolution) {
		this.modid = modid;
		this.pathname = pathname;
		this.elements = elements;
		this.resolution = resolution;
	}

	public String getName() {
		return "/assets/" + modid + "/" + pathname;
	}
}

package dotBlueShoes.GemsMod;

import net.fabricmc.api.DedicatedServerModInitializer;

public class GemsModServer implements DedicatedServerModInitializer {
	@Override
	public void onInitializeServer() {
		Global.LOGGER.info("Gems SERVER initialized.");
	}

}

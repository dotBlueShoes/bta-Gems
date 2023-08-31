package dotBlueShoes.GemsMod;

import net.fabricmc.api.ClientModInitializer;

public class GemsModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Global.LOGGER.info("Gems INTEGRATED_SERVER initialized.");
	}
}

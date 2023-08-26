package dotBlueShoes.GemsMod;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GemsModServer implements DedicatedServerModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger(Global.MOD_ID);

	@Override
	public void onInitializeServer() {
		LOGGER.info("Gems SERVER initialized.");
	}

}

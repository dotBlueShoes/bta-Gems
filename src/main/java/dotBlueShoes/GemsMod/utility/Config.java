package dotBlueShoes.GemsMod.utility;

import java.util.Properties;

public class Config {

	private static Properties defaultProperties = new Properties();

	private static int sampleInt = 1;
	private static boolean sampleBoolean = false;
	private static float sampleFloat = 1.0f;

	// constructor
	// load - read
	// save - write

	static final public void init() {
		defaultProperties.put("a", "2");
		defaultProperties.put("b", "true");
		defaultProperties.put("c", "2.0f");

		//ConfigHandler configHandler = new ConfigHandler(PrismaticLibe.MOD_ID, defaultProperties);

		//int ret1 = Integer.parseInt(configHandler.getProperty("a"));
		//PrismaticLibe.LOGGER.info(String.valueOf(ret1));

		//boolean ret2 = Boolean.parseBoolean(configHandler.getProperty("b"));
		//PrismaticLibe.LOGGER.info(String.valueOf(ret2));

		//float ret3 = Float.parseFloat(configHandler.getProperty("c"));
		//PrismaticLibe.LOGGER.info(String.valueOf(ret3));
	}

}

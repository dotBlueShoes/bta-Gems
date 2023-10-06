package dotBlueShoes.GemsMod.handlers;

import dotBlueShoes.GemsMod.Global;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

public class Config {

	private static final Properties defaultProperties = new Properties();

	static public void onInitialize() {
		//defaultProperties.put("a", "2");
		//defaultProperties.put("b", "true");
		//defaultProperties.put("c", "2.0f");
		//RegistryHelper

		final String PROPERTY_1 = "isDisabledWorldGen";
		final String PROPERTY_2 = "isOverrideDiamondWorldGen";
		final String PROPERTY_3 = "isDisabledRecipes";
		final String PROPERTY_4 = "isOverrideDiamondOreDrops";

		defaultProperties.put(PROPERTY_1, Boolean.toString(Global.isDisabledWorldGen));
		defaultProperties.put(PROPERTY_2, Boolean.toString(Global.isOverrideDiamondWorldGen));
		defaultProperties.put(PROPERTY_3, Boolean.toString(Global.isDisabledRecipes));
		defaultProperties.put(PROPERTY_4, Boolean.toString(Global.isOverrideDiamondOreDrops));

		ConfigHandler configHandler = new ConfigHandler(Global.MOD_ID, defaultProperties);

		//int ret1 = Integer.parseInt(configHandler.getProperty(PROPERTY_1));
		//float ret3 = Float.parseFloat(configHandler.getProperty(PROPERTY_3));

		Global.isDisabledWorldGen          = Boolean.parseBoolean(configHandler.getProperty(PROPERTY_1));
		Global.isOverrideDiamondWorldGen   = Boolean.parseBoolean(configHandler.getProperty(PROPERTY_2));
		Global.isDisabledRecipes           = Boolean.parseBoolean(configHandler.getProperty(PROPERTY_3));
		Global.isOverrideDiamondOreDrops   = Boolean.parseBoolean(configHandler.getProperty(PROPERTY_4));

	}

}

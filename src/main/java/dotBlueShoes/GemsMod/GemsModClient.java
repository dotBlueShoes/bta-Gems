package dotBlueShoes.GemsMod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import org.lwjgl.opengl.GL11;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.*;


// TODO:
// 1. What is the HalpLibe.java addModId() function.

public class GemsModClient implements ClientModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger(Global.MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Gems INTEGRATED_SERVER initialized.");
	}
}

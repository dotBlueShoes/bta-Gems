package dotBlueShoes.GemsMod.mixin.mixins;

import dotBlueShoes.GemsMod.Global;
import dotBlueShoes.GemsMod.initialize.Blocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Random;

@Mixin(
	value = ChunkDecoratorOverworld.class,
	remap = false
)
public class ChunkDecoratorOverworldMixin {

	@Shadow @Final
	private World world;

	// TODO:
	//  + I need to get somewhere between the while calls.
	//  those might be interpreted by mixin as JUMPs.. ?
	//  and shift from there by a number ???
	//  + Also get AtlasLib to switch png to default at chunk rendering
	// LINKS:
	// https://fabricmc.net/wiki/tutorial:mixin_examples
	// https://docs.spongepowered.org/stable/en/contributing/implementation/mixins.html
	// https://github.com/SpongePowered/Mixin/wiki/Advanced-Mixin-Usage---Callback-Injectors

	//@Inject( method = "decorate", at = @At( value = "JUMP", shift = At.Shift.AFTER, by = 150)) //87 łącznie if/while/for != by !!!!
	//public void decorate(Chunk chunk, CallbackInfo info) {
	//	Global.LOGGER.info("HELLO THERE");
	//	throw new RuntimeException();
	//}

	//WorldFeatureOre

	@Unique
	final int CHUNK_LENGTH = 16;

	@Unique
	public void decorateOreA (
		final Random rand, final float oreHeightModifier,
		final int yRange, final int minX, final int minY, final int minZ,
		final int count, final int blockId
	) {
		float genInChunkCounter = 0;
		while (genInChunkCounter < oreHeightModifier) {
			int xPos = minX + rand.nextInt(CHUNK_LENGTH);
			int yPos = minY + rand.nextInt(yRange);
			int zPos = minZ + rand.nextInt(CHUNK_LENGTH);
			new WorldFeatureOre(blockId, count, false).generate(this.world, rand, xPos, yPos, zPos);
			++genInChunkCounter;
		}
	}

	//@Inject( method = "decorate", at = @At( value = "TAIL"), locals = LocalCapture.PRINT)
	//public void decorate(Chunk chunk, CallbackInfo injectionInfo) {
	//	Global.LOGGER.info("HELLO THERE");
	//}

	@Inject( method = "decorate", at = @At( value = "TAIL"), locals = LocalCapture.CAPTURE_FAILSOFT)
	public void decorate (
		Chunk chunk, CallbackInfo injectInfo,
		int chunkX, int chunkY,
		int minY, int maxY,
		int yRange, float oreHeightModifier,
		int x, int z, int y,
		Biome biome, Random rand
	) {
		final int gems_y_range = yRange / 8;
		final int gems_number = 7;

		int chance = rand.nextInt(7);
		// Because my ids are close I can easily enumerate on them.
		// This will spawn one out of 7 gem ores per chunk.
		//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_TOPAZ.id + chance);

		// This generates all of them with the same chance as diamond ore.
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_TOPAZ.id);
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_TANZANITE.id);
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_SAPPHIRE.id);
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_RUBY.id);
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_PERIDOT.id);
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_MALACHITE.id);
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_EMERALD.id);
		decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_AMBER.id);

	}
}

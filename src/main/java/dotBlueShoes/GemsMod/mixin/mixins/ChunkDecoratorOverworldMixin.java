package dotBlueShoes.GemsMod.mixin.mixins;

import dotBlueShoes.GemsMod.initialize.Blocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Random;

@Mixin(
	value = ChunkDecoratorOverworld.class,
	remap = false
)
public abstract class ChunkDecoratorOverworldMixin {

	@Shadow @Final
	private World world;

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

	@Redirect( method = "decorate", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/world/generate/feature/WorldFeatureOre;generate(Lnet/minecraft/core/world/World;Ljava/util/Random;III)Z", ordinal = 6))
	public boolean diamondOreWorldFeature(WorldFeatureOre instance, World world, Random random, int x, int y, int z) {
		int gem_type = Blocks.ORE_TOPAZ.id + random.nextInt(8);
		if (gem_type == (Blocks.ORE_TOPAZ.id + 7)) gem_type = Block.oreDiamondStone.id;

		((WorldFeatureOreAccessor) instance).setMinableBlockId(gem_type);

		return instance.generate(world, random, x, y, z);
	}

	// To get PRINT of local variables
	//@Inject( method = "decorate", at = @At( value = "TAIL"), locals = LocalCapture.PRINT)
	//public void decorate(Chunk chunk, CallbackInfo injectionInfo) {
	//	Global.LOGGER.info("HELLO THERE");
	//}

	//2 // NOT DIAMOND OVERWRITING METHOD
	//2 @Inject( method = "decorate", at = @At( value = "TAIL"), locals = LocalCapture.CAPTURE_FAILSOFT)
	//2 public void decorate (
	//2 	Chunk chunk, CallbackInfo injectInfo,
	//2 	int chunkX, int chunkY,
	//2 	int minY, int maxY,
	//2 	int yRange, float oreHeightModifier,
	//2 	int x, int z, int y,
	//2 	Biome biome, Random rand
	//2 ) {
	//2 	final int gems_y_range = yRange / 8;
	//2 	final int gems_number = 7;
	//2
	//2 	int chance = rand.nextInt(7);
	//2 	// Because my ids are close I can easily enumerate on them.
	//2 	// This will spawn one out of 7 gem ores per chunk.
	//2 	decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_TOPAZ.id + chance);
	//2
	//2 	// This generates all of them with the same chance as diamond ore.
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_TOPAZ.id);
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_TANZANITE.id);
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_SAPPHIRE.id);
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_RUBY.id);
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_PERIDOT.id);
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_MALACHITE.id);
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_EMERALD.id);
	//2 	//decorateOreA(rand, oreHeightModifier, gems_y_range, x, minY, z, gems_number, Blocks.ORE_AMBER.id);
	//2
	//2 }
}

package dotBlueShoes.GemsMod.mixin.mixins;

import dotBlueShoes.GemsMod.Global;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
	value = ChunkDecoratorOverworld.class,
	remap = false
)
public class ChunkDecoratorOverworldMixin {

	// TODO:
	//  + I need to get somewhere between the while calls.
	//  those might be interpreted by mixin as JUMPs.. ?
	//  and shift from there by a number ???
	//  + Also get AtlasLib to switch png to default at chunk rendering
	// LINKS:
	// https://fabricmc.net/wiki/tutorial:mixin_examples
	// https://docs.spongepowered.org/stable/en/contributing/implementation/mixins.html
	// https://github.com/SpongePowered/Mixin/wiki/Advanced-Mixin-Usage---Callback-Injectors

	@Inject( method = "decorate", at = @At( value = "JUMP", shift = At.Shift.AFTER, by = 150)) //87 łącznie if/while/for != by !!!!
	public void decorate(Chunk chunk, CallbackInfo info) {
		Global.LOGGER.info("HELLO THERE");
	}
}

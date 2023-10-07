package dotBlueShoes.GemsMod.mixin.mixins;

import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
	value = WorldFeatureOre.class,
	remap = false
)
public interface WorldFeatureOreAccessor {

	@Accessor("minableBlockId")
	public void setMinableBlockId(int newMinableBlockId);
}

package dotBlueShoes.GemsMod.mixin.accessors;

import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
	value = WorldFeatureOre.class,
	remap = false
)
public interface WorldFeatureOreAccessor {

	@Accessor("minableBlockId")
	void setMinableBlockId(int newMinableBlockId);

	@Accessor("numberOfBlocks")
	void setNumberOfBlocks(int newNumberOfBlocks);

	@Accessor("numberOfBlocks")
	int getNumberOfBlocks();

	@Accessor("hasStoneStates")
	void setHasStoneStates(boolean newHasStoneStates);
}

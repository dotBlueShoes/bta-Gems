package dotBlueShoes.GemsMod.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiRenderItem;
import net.minecraft.client.render.Lighting;
import net.minecraft.client.render.TextureFX;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.core.Global;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.slot.Slot;

import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// ABOUT
//  - Renders items inside inventory, creative_mode inventory, entity uis.

@Mixin(GuiRenderItem.class)
public abstract class GuiRenderItemMixin extends Gui {

	@Shadow(remap = false)
	static ItemEntityRenderer itemRenderer;
	@Shadow(remap = false)
	Minecraft mc;


	@Inject(
		method = "render(Lnet/minecraft/core/item/ItemStack;IIZLnet/minecraft/core/player/inventory/slot/Slot;)V",
		at = @At(
			value = "HEAD"
		),
		cancellable = true, remap = false
	)
	public void render(ItemStack itemStack, int x, int y, boolean isSelected, Slot slot, CallbackInfo ci) {

		boolean hasDrawnSlotBackground = false;
		boolean discovered = true;
		Lighting.enableInventoryLight();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glEnable(32826);
		if (slot != null) {
			discovered = slot.discovered;
			int iconIndex = slot.getBackgroundIconIndex();
			if (iconIndex >= 0 && itemStack == null) {
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(this.mc.renderEngine.getTexture("/gui/items.png"));
				this.drawTexturedModalRect(x, y, iconIndex % Global.TEXTURE_ATLAS_WIDTH_TILES * TextureFX.tileWidthItems, iconIndex / Global.TEXTURE_ATLAS_WIDTH_TILES * TextureFX.tileWidthItems, 16, 16, TextureFX.tileWidthItems, 1.0F / (float)(Global.TEXTURE_ATLAS_WIDTH_TILES * TextureFX.tileWidthItems));
				GL11.glEnable(2896);
				hasDrawnSlotBackground = true;
			}
		}

		if (!hasDrawnSlotBackground) {
			GL11.glEnable(2929);
			itemRenderer.renderItemIntoGUI(this.mc.fontRenderer, this.mc.renderEngine, itemStack, x, y, discovered ? 1.0F : 0.0F, 1.0F);
			itemRenderer.renderItemOverlayIntoGUI(this.mc.fontRenderer, this.mc.renderEngine, itemStack, x, y, discovered ? null : "?");
			GL11.glDisable(2929);
		}

		if (isSelected) {
			GL11.glDisable(2896);
			GL11.glDisable(2929);
			this.drawRect(x, y, x + 16, y + 16, -2130706433);
			GL11.glEnable(2896);
			GL11.glEnable(2929);
		}

		GL11.glDisable(32826);
		Lighting.disable();
		GL11.glDisable(2896);
		GL11.glDisable(2929);

		ci.cancel();
	}
}

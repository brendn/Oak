package me.brendn.oak.mcbeta.mixin.client.gui

import net.minecraft.src.GuiMainMenu
import net.minecraft.src.GuiScreen
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(GuiMainMenu::class)
class MixinGuiMainMenu : GuiScreen() {

	@Inject(method = "drawScreen(IIF)V", at = arrayOf(At("RETURN")))
	fun drawScreen(mouseX: Int, mouseY: Int, delta: Float, info: CallbackInfo) {
		drawString(fontRenderer, "Oak", 2, height - 10, -1)
	}
}
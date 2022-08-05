package lsmp.gui;

import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

//Minecraft.getMinecraft().getSession().getUsername()
public class MainMenu extends GuiScreen {
@Override
public void initGui() {
	this.buttonList.add(new GuiButton(0,this.width / 2 - 100,this.height / 2 - 60 ,"SinglePlayer") );
	this.buttonList.add(new GuiButton(1,this.width / 2 - 100,this.height / 2 - 30 ,"MultiPlayer"));
	this.buttonList.add(new GuiButton(2,this.width / 2 - 100,this.height / 2 - 0 ,"Setting"));
	this.buttonList.add(new GuiButton(3,this.width / 2 - 100,this.height / 2 + 30 ,"Touch a grass"));
	this.buttonList.add(new GuiButton(4,this.width / 2 - 100,this.height / 2 + 80 ,"Create World"));
	super.initGui();
}

private String player = Minecraft.getMinecraft().getSession().getUsername() ,version = "1.0 ",author = "Avm";
@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		mc.getTextureManager().bindTexture(new ResourceLocation("Lsmp/wp.jpg"));
		this.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, this.width, this.height, this.width, this.height);
		GlStateManager.pushMatrix();
//		GlStateManager.translate(-(width/1.985f), -(height/2f), 0);
//		GlStateManager.scale(2, 2, 2);
		this.drawCenteredString(mc.fontRendererObj,"Hello " + player , this.width/2, this.height /2 -100, -1);
		GlStateManager.popMatrix();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if(button.id == 0 ) {
			mc.displayGuiScreen(new GuiSelectWorld(this));
		}
		else if(button.id == 1 ) {
			mc.displayGuiScreen(new GuiMultiplayer(this));
		}
		else if(button.id == 2 ) {
			mc.displayGuiScreen(new GuiOptions(this,mc.gameSettings));
		}
		else if(button.id == 3 ) {
			mc.shutdown();
		}
		else if(button.id == 4 ) {
			mc.displayGuiScreen(new GuiCreateWorld(this));
		}
		super.actionPerformed(button);
	}
}

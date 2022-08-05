package lsmp.gui.mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;

public class _Hud {
	public Minecraft mc = Minecraft.getMinecraft();
	public FontRenderer fr = mc.fontRendererObj;
	public String name;
	public int x,y;
	public boolean enable;
	public _Hud(String name, int x,int y ) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.enable = true;
	}
	public int getWidth() {
		return 50;
	}
	public int getHeight() {
		return 50;
	} 
	public void draw() {
	
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	private void toggle() {
		this.setEnable(!enable);
	}
	public boolean isEnable() {
		return enable;
	}
}

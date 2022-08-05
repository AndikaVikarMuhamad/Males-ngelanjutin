package lsmp.gui.mods.plugins;

import lsmp.Client;
import lsmp.gui.mods._Hud;
import net.minecraft.client.Minecraft;

public class Tes extends _Hud{
	
	public Tes() {
		super(Client.INSTANCE.name + " Hello " + Client.INSTANCE.player + " " + Client.INSTANCE.version ,5 ,5);
	}
    @Override
    public void draw() {
    	fr.drawStringWithShadow(name, getX(), getY(), -1);
    	super.draw();
    }
    @Override
    public int getWidth() {
    	return fr.getStringWidth(name);
    }
    @Override
    public int getHeight() {
    	return fr.FONT_HEIGHT;
    }
}

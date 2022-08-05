package lsmp.gui.mods.plugins;

import lsmp.gui.mods._Hud;

public class Ping extends _Hud {
	public Ping() {
		super("Ping",5,40);
		
	}
    @Override
    public void draw() {
    	if(mc.getNetHandler().getPlayerInfo(mc.thePlayer.getUniqueID()) != null) {
    	fr.drawStringWithShadow("§o§d"+name +"§o§d : " + mc.getNetHandler().getPlayerInfo(mc.thePlayer.getUniqueID()).getResponseTime()  , getX(), getY(), -1);
    	} else {
    		fr.drawStringWithShadow("§o§d"+name +"§o§d : " + "Ping is null", getX(), getY(), -1);
    	}
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

package lsmp.gui.mods.plugins;

import lsmp.gui.mods._Hud;

public class Coordinate extends _Hud{

	public Coordinate() {
		super("Coordinate",5,20);
	}
	
    @Override
    public void draw() {
    	fr.drawStringWithShadow("§o§d"+name +"§o§d : " +Math.round(mc.thePlayer.posX * 1000) / 1000L + " " + Math.round(mc.thePlayer.posZ * 1000) / 1000L +" " + Math.round(mc.thePlayer.posY * 1000) / 1000L, getX(), getY(), -1);
    	super.draw();
    }
    @Override
    public int getWidth() {
    	return fr.getStringWidth("§o§d"+name +"§o§d : " +Math.round(mc.thePlayer.posX * 1000) / 1000L + " " + Math.round(mc.thePlayer.posZ * 1000) / 1000L +" " + Math.round(mc.thePlayer.posY * 1000) / 1000L);
    }
    @Override
    public int getHeight() {
    	return fr.FONT_HEIGHT;
    }

}

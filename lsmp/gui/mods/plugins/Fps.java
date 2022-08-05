package lsmp.gui.mods.plugins;

import lsmp.gui.mods._Hud;

public class Fps extends _Hud {

	public Fps() {
		super("Fps",5,30);
		
	}
    @Override
    public void draw() {
    	fr.drawStringWithShadow("§o§d"+name +"§o§d : " + mc.getDebugFPS() , getX(), getY(), -1);
    	super.draw();
    }
    @Override
    public int getWidth() {
    	return fr.getStringWidth("§o§d"+name +"§o§d : " + mc.getDebugFPS());
    }
    @Override
    public int getHeight() {
    	return fr.FONT_HEIGHT;
    }
}

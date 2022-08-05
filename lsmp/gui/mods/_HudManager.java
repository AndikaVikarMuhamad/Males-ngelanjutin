package lsmp.gui.mods;

import java.util.ArrayList;

import lsmp.gui.mods.plugins.Coordinate;
import lsmp.gui.mods.plugins.Fps;
import lsmp.gui.mods.plugins.Ping;
import lsmp.gui.mods.plugins.Tes;

public class _HudManager {
	ArrayList<_Hud> Hud = new ArrayList<>();
	public Tes tes;
	public Coordinate coordinate;
	public Fps fps;
	public Ping ping;
	public _HudManager() {
		Hud.add(tes = new Tes());
		Hud.add(coordinate = new Coordinate());
		Hud.add(fps = new Fps());
		Hud.add(ping = new Ping());
	}
	public void renderMods() {
		for(_Hud m : Hud) {
			if(m.isEnable()) {
				m.draw();
			}
		}
	}
}

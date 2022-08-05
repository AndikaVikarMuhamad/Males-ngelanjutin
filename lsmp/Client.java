package lsmp;

import org.lwjgl.opengl.Display;

import lsmp.gui.Splash;
import lsmp.gui.mods._HudManager;
import net.minecraft.client.Minecraft;

public class Client {
	public String name = "elesempe" ,version = "1.0 ",author = "Avm" ,player = Minecraft.getMinecraft().getSession().getUsername() , Mcversion = Minecraft.getMinecraft().getVersion();
	public static Client INSTANCE = new Client();
	public _HudManager HudManager;
	private DisocrdRp discordrp = new DisocrdRp();
	
	public void startup() {
		Splash.setProgress(1, "Client - Innitialissing Discord Rp");
		Display.setTitle(name +" | "+ version + "by " + author );
		HudManager = new _HudManager();
		discordrp.start();
	};
	
	public void shutdown() {
		
	}
	
	public DisocrdRp getDiscordRP(){
		return discordrp;
	}
}

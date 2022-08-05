package lsmp;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.arikia.dev.drpc.DiscordUser;
import net.arikia.dev.drpc.callbacks.ReadyCallback;

public class DisocrdRp {
	private boolean running = true;
	private long created = 1659423929;
	
	public void start() {
		this.created = System.currentTimeMillis();
		
		DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler(new ReadyCallback() {
			
			@Override
			public void apply(DiscordUser user) {
				System.out.println("Welcome " + user.username + "#" + user.discriminator + ".");
				update("Booting up....", "");
			}
		}).build();
		DiscordRPC.discordInitialize("1004751879001096243", handlers, true);
		
		new Thread("Discord RPC Callback") {
			public void run() {
				
				while(running) {
					DiscordRPC.discordRunCallbacks();
				}
				
			};
		}.start();
	}
	public void shutdown() {
		running = false;
		DiscordRPC.discordShutdown();
		
	}

	public void update(String firstline,String secondline) {
		DiscordRichPresence.Builder l = new DiscordRichPresence.Builder(secondline);
		l.setBigImage("large", "");
		l.setDetails(firstline);
		l.setStartTimestamps(created);
		
		DiscordRPC.discordUpdatePresence(l.build());
	}
}

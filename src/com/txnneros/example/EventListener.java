package com.txnneros.example;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener {
  
    Main plugin;

    public EventListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = false)
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
    }
    
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = false)
    public void onQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }
}

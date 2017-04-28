package com.txnneros.example;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerLoginEvent;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable() {
    this.getServer().getPluginManager().registerEvents(this, this);
    getLogger().info(TextFormat.GREEN + "Example up!");
    }
    
    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.RED + "Example down!");
    }
    
    @EventHandler
    public void PlayerLoginEvent(PlayerLoginEvent ev) {
        Player p = ev.getPlayer();
        p.sendPopup(TextFormat.GOLD + "hello");
        p.sendMessage(TextFormat.YELLOW + "Welcome " + p.getName());
    }
     
}

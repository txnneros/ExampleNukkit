package com.txnneros.example;

import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

    public void onEnable() {
        getLogger().info("ExampleNukkit plugin enabled!!");
        
        this.registerEvents();
    }
    
    public void registerEvents() {
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
    }
}

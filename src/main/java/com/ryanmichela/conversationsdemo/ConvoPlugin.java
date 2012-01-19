package com.ryanmichela.conversationsdemo;

import org.bukkit.plugin.java.JavaPlugin;

/**
 */
public class ConvoPlugin extends JavaPlugin {

    public void onEnable() {
        getCommand("summon").setExecutor(new SummonExecutor(this));
    }

    public void onDisable() {

    }
}

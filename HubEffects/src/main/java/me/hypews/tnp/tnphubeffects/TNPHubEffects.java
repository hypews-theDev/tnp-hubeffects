package me.hypews.tnp.tnphubeffects;

import me.hypews.tnp.tnphubeffects.commands.GUICommand;
import me.hypews.tnp.tnphubeffects.events.ClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TNPHubEffects extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("TNPHubEffects has loaded successfully and is running on version 1.1");





        getCommand("effects").setExecutor(new GUICommand());
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

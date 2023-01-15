package net.astrogames.maincore;

import net.astrogames.maincore.Chat.TagEvent;
import net.astrogames.maincore.Events.JoinListener;
import net.astrogames.maincore.Events.KeepInventory;
import net.astrogames.maincore.Events.LevelListener;
import net.astrogames.maincore.Events.QuitListener;
import net.astrogames.maincore.Points.Spawn.SetSpawnCommand;
import net.astrogames.maincore.Points.Spawn.SpawnCommand;
import net.astrogames.maincore.Points.Utils;
import net.astrogames.maincore.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Maincore extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getLogger().info("System wurde geladen...");

        getCommand("discord").setExecutor(new discordCommand());
        getCommand("teamspeak").setExecutor(new teamspeakCommand());
        getCommand("setspawn").setExecutor(new SetSpawnCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("sun").setExecutor(new sunCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("ChatClear").setExecutor(new ChatClearCommand());
        getCommand("forum").setExecutor(new forumCommand());
        getCommand("account").setExecutor(new AccountCommand());
        getCommand("gma").setExecutor(new gma());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new Utils(), this);
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
        pluginManager.registerEvents(new KeepInventory(), this);
        pluginManager.registerEvents(new TagEvent(), this);
        pluginManager.registerEvents(new LevelListener(), this);


    }

    @Override
    public void onDisable() {
        getLogger().info("System wurde entladen...");
        // Plugin shutdown logic
    }
}

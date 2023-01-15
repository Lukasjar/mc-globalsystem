package net.astrogames.maincore.Events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.setJoinMessage("");
        Player player = event.getPlayer();
        if (player.hasPermission("maincore.join.team"));
        Bukkit.broadcastMessage("§bAstro§3Games §8— §7Das Teammitglied§b " + player.getName() + "§7ist nun §aOnline§7!");




    }

    }

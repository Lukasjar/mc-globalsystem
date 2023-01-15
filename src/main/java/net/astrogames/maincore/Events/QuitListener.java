package net.astrogames.maincore.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        event.setQuitMessage("");
        Player player = event.getPlayer();
        if (player.hasPermission("maincore.quit.team"));
        Bukkit.broadcastMessage("§bAstro§3Games §8—§7 Das Teammitglied§b  + player.getName() + §7ist nun §cOffline§7!");

    }
}

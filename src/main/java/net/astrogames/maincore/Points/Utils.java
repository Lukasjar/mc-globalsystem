package net.astrogames.maincore.Points;

import net.astrogames.maincore.Maincore;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class Utils implements Listener {
    private Maincore plugin = null;



    public Utils() {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if (!player.hasPlayedBefore()) {
            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null) {
                player.teleport(location);
            }
        }

    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e){

        Location location = plugin.getConfig().getLocation("spawn");

        if (location != null) {
            e.setRespawnLocation(location);
        }
    }

}
package net.astrogames.maincore.Events;

import org.bukkit.Bukkit;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementDisplay;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public class LevelListener implements Listener {
    @EventHandler
    public void AdvancementEvent(PlayerAdvancementDoneEvent event){
        Advancement advancement = event.getAdvancement();
        Player player = event.getPlayer();
        Bukkit.broadcastMessage(null);



    }
}

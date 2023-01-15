package net.astrogames.maincore.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KeepInventory implements Listener {
    @EventHandler
    public void KeepInventory(PlayerDeathEvent event){
        event.setKeepInventory(true);

    }

}


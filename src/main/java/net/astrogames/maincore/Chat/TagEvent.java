package net.astrogames.maincore.Chat;

import org.bukkit.event.EventHandler;
import org.bukkit.ChatColor;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.Listener;

public class TagEvent implements Listener
{
    @EventHandler
    public boolean playerChatEvent(final AsyncPlayerChatEvent event) {
        final StringBuilder builder = new StringBuilder();
        String message = event.getMessage();
        while (!message.isEmpty()) {
            if (message.contains("@")) {
                builder.append(message.substring(0, message.indexOf("@"))).append(ChatColor.AQUA);
                message = message.substring(message.indexOf("@"));
                if (message.contains(" ")) {
                    builder.append(message.substring(0, message.indexOf(" "))).append(ChatColor.RESET);
                    message = message.substring(message.indexOf(" "));
                }
                else {
                    builder.append(message);
                    message = "";
                }
            }
            else {
                builder.append(message);
                message = "";
            }
        }
        event.setMessage(builder.toString());
        return true;
    }
}
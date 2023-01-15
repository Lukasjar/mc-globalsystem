package net.astrogames.maincore.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class ChatClearCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String s, final String[] strings) {
        if (sender.hasPermission("maincore.command.chatclear")) {
            for (int i = 0; i < 100; ++i) {
                Bukkit.broadcastMessage("");
            }
            Bukkit.broadcastMessage("§bAstro§3Games §8— §7Der Chat wurde von §b" + sender.getName() + " §7geleert!");
        }
        else {
            sender.sendMessage("§bAstro§3Games §8—§c Dazu hast du keine Rechte! §7(§cmaincore.command.chatclear§7)");
        }
        return false;
    }
}
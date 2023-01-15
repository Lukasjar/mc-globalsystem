package net.astrogames.maincore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("maincore.command.feed"));
            if (args.length == 0){
                player.setFoodLevel(20);
                player.sendMessage("§bAstro§3Games §8—§7 Du bist nun satt!");
            }
            else
                player.sendMessage("§bAstro§3Games §8—§c Dazu hast du keine Rechte! §7(§cmaincore.command.feed§7)");
        }
        return false;
    }
}

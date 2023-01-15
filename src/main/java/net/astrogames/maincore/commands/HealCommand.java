package net.astrogames.maincore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("maincore.command.heal"));
            if (args.length == 0) {
                player.setHealth(20);
                player.setFireTicks(0);
                player.sendMessage("§bAstro§3Games §8—§7 Du hast dich erfolgreich geheilt!");

            } else
                player.sendMessage("§bAstro§3Games §8—§7 §cDazu hast du keine Rechte! §7(§cmaincore.command.heal§7)");
        } else
            if (args.length == 1){
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    if (player.hasPermission("maincore.command.heal.other"));

                }
            }
        return false;
    }
}

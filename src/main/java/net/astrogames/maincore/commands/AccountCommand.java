package net.astrogames.maincore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AccountCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("maincore.command.forum")) {
                player.sendMessage("§bAstro§3Games §8—§b ACCOUNT");
                player.sendMessage("§bAstro§3Games §8—§7 ");
                player.sendMessage("§bAstro§3Games §8—§7 Name: §b" + player.getName());
                player.sendMessage("§bAstro§3Games §8—§7 Verify: §cNein" );
                player.sendMessage("§bAstro§3Games §8—§7 UUID: " + player.getUniqueId());
                player.sendMessage("§bAstro§3Games §8—§7 IP-Adresse: §c" + player.getAddress());
                player.sendMessage("§bAstro§3Games §8—§b ");
                player.sendMessage("§bAstro§3Games §8—§b ACCOUNT");
            } else
                player.sendMessage("§bAstro§3Games §8—§7 §cDazu hast du keine Rechte! §7(§cmaincore.command.account§7)");

        }
        return false;
    }
}







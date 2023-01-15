package net.astrogames.maincore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class teamspeakCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (sender.hasPermission("minecore.command.teamspeak")){
                sender.sendMessage("§bAstro§3Games §8—§7");
                sender.sendMessage("§bAstro§3Games §8—§7 Unser Teamspeak: §bTEAMASTRO");
                sender.sendMessage("§bAstro§3Games §8—§7");
            }
            else
                sender.sendMessage("§bAstro§3Games §8—§c Dazu hast du keine Rechte! §7(§cminecore.command.teamspeak§7)");
        }
        return false;
    }
}

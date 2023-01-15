package net.astrogames.maincore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class forumCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("maincore.command.forum")){
                player.sendMessage("§bAstro§3Games §8—§b FORUM SYSTEM");
                player.sendMessage("§bAstro§3Games §8—§7 ");
                player.sendMessage("§bAstro§3Games §8—§7 Link: https://forum.astrogames.net");
                player.sendMessage("§bAstro§3Games §8—§7 Verify:");
                player.sendMessage("§bAstro§3Games §8—§b /forum verify");
                player.sendMessage("§bAstro§3Games §8—§b");
                player.sendMessage("§bAstro§3Games §8—§b FORUM SYSTEM");
            } else
                player.sendMessage("§bAstro§3Games §8—§7 §cDazu hast du keine Rechte! §7(§cmaincore.command.forum§7)");
        }
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("maincore.command.forum.verify"));
        if (args.length == 1){
            if (args[0].equalsIgnoreCase("verify"));
            player.sendMessage("§bAstro§3Games §8—§b FORUM SYSTEM");
            player.sendMessage("§bAstro§3Games §8—§7");
            player.sendMessage("§bAstro§3Games §8—§7 Status:");
            player.sendMessage("§bAstro§3Games §8—§7 Verifiziert: §cNein");
            player.sendMessage("§bAstro§3Games §8—§7 Name: §b" + player.getName());
            player.sendMessage("§bAstro§3Games §8—§7 Forum-Name: §8/");
            player.sendMessage("§bAstro§3Games §8—§7 Forum Status: §cOffline");
            player.sendMessage("§bAstro§3Games §8—§b");
            player.sendMessage("§bAstro§3Games §8—§b FORUM SYSTEM");




            } else
                player.sendMessage("§bAstro§3Games §8—§7 §cDazu hast du keine Rechte! §7(§cmaincore.command.forum.verify§7)");
        }
        return false;
    }
}

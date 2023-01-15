package net.astrogames.maincore.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sunCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("maincore.command.sun"));
            if (args.length == 0){
                World w = player.getWorld();
                w.setStorm(false);
                w.setThundering(false);
                player.sendMessage("§bAstro§3Games §8—§7 In der Welt§b " + w.getName() + "§7 scheint nun die Sonne.");
            }
            else
                player.sendMessage("§bAstro§3Games §8—§7 §cDazu hast du keine Rechte! §7(§cmaincore.command.sun§7)");
        }
        return false;
    }
}

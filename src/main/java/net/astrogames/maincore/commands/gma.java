package net.astrogames.maincore.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gma implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("maincore.command.gamemode.adventure"));
            player.setGameMode(GameMode.ADVENTURE);
            player.sendMessage("§bAstro§3Games §8—§7 Dein Spielmodus wurde zu §bAdventure §7geändert!");

        } else
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage("§bAstro§3Games §8—§7 §cDazu hast du keine Rechte! §7(§cmaincore.command.gamemode.adventure§7)");
        }
        return false;
    }
}

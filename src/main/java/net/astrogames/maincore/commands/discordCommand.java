package net.astrogames.maincore.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class discordCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (sender.hasPermission("maincore.command.discord")){
                sender.sendMessage("§bAstro§3Games §8—§7");
                sender.sendMessage("§bAstro§3Games §8—§b https://dsc.gg/AstroGames");
                sender.sendMessage("§bAstro§3Games §8—§7");
            }
            else
                player.sendMessage("§bAstro§3Games §8—§c Dazu hast du keine Rechte! §7(§cmaincore.command.discord§7)");

            }
        return false;
    }
}

package net.astrogames.maincore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{

    private boolean flymode = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("maincore.command.fly")) {


                if(command.getName().equalsIgnoreCase("Fly")) {
                    if(flymode == false) {
                        player.setAllowFlight(true);
                        flymode = true;
                        player.sendMessage("§bAstro§3Games §8—§7 §7Du hast den Flugmodus §aaktiviert§7!");
                    } else {
                        player.setAllowFlight(false);
                        flymode = false;
                        player.sendMessage("§bAstro§3Games §8—§7 §7Du hast den Flugmodus §caktiviert§7!");
                    }
                }
            } else
                player.sendMessage("§bAstro§3Games §8—§7 §cDazu hast du keine Rechte! §7(§cmaincore.command.fly§7)");
        } else
            sender.sendMessage("§bAstro§3Games §8—§7 Das ist kein feature für die Konsole.");

        return false;
    }

}

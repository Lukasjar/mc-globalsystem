package net.astrogames.maincore.Points.Spawn;

import net.astrogames.maincore.Maincore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    private Maincore plugin = null;

    public SpawnCommand() {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null){
                player.teleport(location);
                player.sendMessage("§bCity§3Build §8- §7Teleportiere §8 ...");
                player.sendMessage("§bCity§3Build §8- §7Du befindest dich nun am §bSpawn§7!");
            }else player.sendMessage("§bCity§3Build §8- §cEs ist kein Spawn Punkt definiert.");

        }

        return true;
    }
}
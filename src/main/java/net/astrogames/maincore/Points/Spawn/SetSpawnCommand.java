package net.astrogames.maincore.Points.Spawn;

import net.astrogames.maincore.Maincore;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {
    private Maincore plugin = null;

    public SetSpawnCommand() {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("citybuild.commands.setspawn")){

            }


            Location location = player.getLocation();
            plugin.getConfig().set("spawn", location);

            plugin.saveConfig();

            player.sendMessage("§bCity§3Build §8- §aSpawn wurde gesetzt.");
        }

        return true;
    }
}
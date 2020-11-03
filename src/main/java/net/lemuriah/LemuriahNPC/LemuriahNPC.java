package net.lemuriah.LemuriahNPC;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import sun.jvm.hotspot.ui.ObjectHistogramPanel;

import java.util.List;

public class LemuriahNPC extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Join() , this);
    }
    @Override
    public void onDisable() {

        getLogger().info("onDisable is called!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (label.equalsIgnoreCase("createnpc")){
            if(!(sender instanceof Player)){
                return true;
            }
            Player player = (Player) sender;
            System.out.println(player);
            System.out.println(sender);
            NPC.CreateNPC(player);
            player.sendMessage("NPC Created");
        }
        return false;

    }


}

package net.lemuriah.LemuriahNPC;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
    if(NPC.getNPCs() == null){
        return;
    }
    if(NPC.getNPCs().isEmpty()){
        return;
    }
        NPC.addJoinPacket(event.getPlayer());

    }

}

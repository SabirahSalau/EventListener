package me.glass_waves.eventlisteners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("EventListener plugin started!");

        getServer().getPluginManager().registerEvents(this, this);

    }

   @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

       event.setJoinMessage("A noble has joined the server :c");

   }

   @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.sendMessage("No sleeping.");
        //player.setHealth(0);
        player.sendMessage("Into the void!");
   }
}

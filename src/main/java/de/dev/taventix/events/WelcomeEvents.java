package de.dev.taventix.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WelcomeEvents implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("");
        event.getPlayer().sendMessage(ChatColor.GOLD + "Willkommen" + event.getPlayer().getName() + " auf dem Server ");
    }
    private static final ArrayList<Player> isJumping =new ArrayList<>();
    @EventHandler
    private void onPlayerJump(PlayerMoveEvent event){
        if(event.getPlayer().getVelocity().getY() > 0 && !event.getPlayer().isOnGround() && !isJumping.contains(event.getPlayer())) {
            isJumping.add(event.getPlayer());
            event.getPlayer().sendMessage("Du bist gesprungen");

        }else if (event.getPlayer().isOnGround() && isJumping.contains(event.getPlayer())){
            isJumping.remove(event.getPlayer());
        }
    }
}

package me.hypews.tnp.tnphubeffects.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickEvent implements Listener {


    @EventHandler
    public void clickEvent(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Effects")) {

            switch(e.getCurrentItem().getType()){
                case GLOWSTONE_DUST:
                    if(player.hasPermission("tnp.effect.glow")) {
                        player.closeInventory();
                        player.sendMessage(ChatColor.GREEN + "Glow has been activated!");
                    }else{
                        player.closeInventory();
                        player.sendMessage(ChatColor.RED + "You do not have permission to use this effect. Please purchase this effect from the store");
                    }
            }


            e.setCancelled(true);
        }
    }
}

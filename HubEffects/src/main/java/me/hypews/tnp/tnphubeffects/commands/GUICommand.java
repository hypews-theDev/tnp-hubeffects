package me.hypews.tnp.tnphubeffects.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUICommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {


        if(sender instanceof Player){
            Player player = (Player) sender ;

            Inventory gui = Bukkit.createInventory(player,9, ChatColor.AQUA + "Effects");

            ItemStack glow = new ItemStack(Material.GLOWSTONE_DUST);
            ItemStack fly = new ItemStack(Material.FEATHER);
            ItemStack speed = new ItemStack(Material.CHAINMAIL_BOOTS);

            ItemMeta glow_meta = glow.getItemMeta();
            glow_meta.setDisplayName(ChatColor.GOLD + "Glow");
            ArrayList<String> glow_lore = new ArrayList<>();
            glow_lore.add(ChatColor.GRAY + "Enables a white glow");
            glow_meta.setLore(glow_lore);
            glow.setItemMeta(glow_meta);


            ItemMeta fly_meta = fly.getItemMeta();
            fly_meta.setDisplayName(ChatColor.GOLD + "Fly");
            ArrayList<String> fly_lore = new ArrayList<>();
            fly_lore.add(ChatColor.GRAY + "Enables flight");
            fly_meta.setLore(fly_lore);
            fly.setItemMeta(fly_meta);

            ItemMeta speed_meta = speed.getItemMeta();
            speed_meta.setDisplayName(ChatColor.GOLD + "Speed");
            ArrayList<String> speed_lore = new ArrayList<>();
            speed_lore.add(ChatColor.GRAY + "Enables speed");
            speed_meta.setLore(speed_lore);
            speed.setItemMeta(speed_meta);

            ItemStack[] menu_items = {glow, fly, speed};
            gui.setContents(menu_items);





            player.openInventory(gui) ;


        }





        return true;
    }


}

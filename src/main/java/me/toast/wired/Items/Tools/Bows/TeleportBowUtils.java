package me.toast.wired.Items.Tools.Bows;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class TeleportBowUtils {

    public static ItemStack createTeleportBow(){
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta meta = bow.getItemMeta();

        meta.setDisplayName(ChatColor.DARK_PURPLE + "Teleport Bow");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.DARK_GREEN + "Teleport to your arrow's location");
        lore.add("Rarity: Epic");
        meta.setCustomModelData(703);
        meta.setLore(lore);
        bow.setItemMeta(meta);
        return bow;



    }

}


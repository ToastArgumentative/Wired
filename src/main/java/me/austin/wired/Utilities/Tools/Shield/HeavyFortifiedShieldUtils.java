package me.austin.wired.Utilities.Tools.Shield;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HeavyFortifiedShieldUtils {

    public static ItemStack createHeavyFortifiedShield(){
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Heavy Fortified Shield");
        List<String> itemLore = new ArrayList<>();
        itemLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");
        meta.setLore(itemLore);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        return item;
    }
}

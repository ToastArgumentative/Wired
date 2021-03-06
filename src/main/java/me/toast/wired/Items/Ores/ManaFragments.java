package me.toast.wired.Items.Ores;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ManaFragments {

    public static ItemStack createManaFragments(){
        ItemStack item = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Mana Fragment");
        List<String> feederLore = new ArrayList<>();
        feederLore.add(ChatColor.DARK_GREEN + "This Item can be used to infuse Holy Grail Armor.");
        feederLore.add(ChatColor.RED + "Beware upon doing so, you will lose all enchants on your armor.");
        feederLore.add(ChatColor.GOLD + "Rarity: GOLD");
       meta.setCustomModelData(1002);
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }

}

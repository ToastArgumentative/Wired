package me.toast.wired.Items.Armor.Starter;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StarterHelm {

    public static ItemStack createIronHelmet(){
        ItemStack tankHelmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = tankHelmet.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Starter Helm");
        List<String> tankHelmetLore = new ArrayList<>();

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_ARMOR", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        meta.setLore(tankHelmetLore);
        tankHelmet.setItemMeta(meta);
        return tankHelmet;
    }
}

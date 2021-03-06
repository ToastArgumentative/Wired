package me.toast.wired.Items.Armor.TankArmorEpic;

import me.toast.wired.Items.Enchantments.Enchantments;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IronChestUtilsEpic {

    public static ItemStack createTankChestplate(){
        ItemStack tankChestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = tankChestplate.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Chestplate Epic");
        List<String> tankChestplateLore = new ArrayList<String>();
        tankChestplateLore.add(ChatColor.DARK_GREEN + "Chestplate granting you a 35% increased max health");
        tankChestplateLore.add(ChatColor.DARK_PURPLE + "Armor: 7");
        tankChestplateLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);

        meta.setCustomModelData(910);
        meta.addEnchant(Enchantments.ARMOR, 7, true);
        meta.setUnbreakable(true);
        meta.setLore(tankChestplateLore);
        tankChestplate.setItemMeta(meta);
        return tankChestplate;
    }
}

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

public class IronBootsUtilsEpic {

    public static ItemStack createTankBoots(){
        ItemStack tankBoots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta meta = tankBoots.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Boots Epic");
        List<String> tankBootsLore = new ArrayList<>();
        tankBootsLore.add(ChatColor.DARK_GREEN + "Boots granting you a 35% increased max health");
        tankBootsLore.add(ChatColor.DARK_PURPLE + "Armor: 7");
        tankBootsLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);


        meta.setCustomModelData(912);
        meta.addEnchant(Enchantments.ARMOR, 7, true);
        meta.setUnbreakable(true);
        meta.setLore(tankBootsLore);
        tankBoots.setItemMeta(meta);
        return tankBoots;
    }
}

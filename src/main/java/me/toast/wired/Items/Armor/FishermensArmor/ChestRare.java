package me.toast.wired.Items.Armor.FishermensArmor;

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

public class ChestRare {

    public static ItemStack createFishermensChest(){
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = chest.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "Fishermens Jacket");
        List<String> tankChestplateLore = new ArrayList<>();
        tankChestplateLore.add(ChatColor.DARK_GREEN + "Get Insane Luck With the Fishermans Jacket");
        tankChestplateLore.add(ChatColor.AQUA + "Rarity: RARE");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 1.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_LUCK", 7.75, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_LUCK, armor);
        meta.setCustomModelData(902);
        meta.setLore(tankChestplateLore);
        chest.setItemMeta(meta);
        return chest;
    }
}

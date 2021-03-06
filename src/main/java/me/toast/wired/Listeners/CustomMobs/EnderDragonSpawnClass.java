package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Items.Ores.HolyGrailFragments;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class EnderDragonSpawnClass implements Listener {
    @EventHandler
    public static void onEnderDragonSpawn(CreatureSpawnEvent event){
        if(event.getEntity() instanceof EnderDragon enderdragon){


            Objects.requireNonNull(enderdragon.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(4000);
            enderdragon.setHealth(2048);
            enderdragon.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 255, false, false));

            if(enderdragon.getLocation().getBlock().getBiome().equals(Biome.THE_END)){
                enderdragon.setCustomName(ChatColor.DARK_RED + "[140] EnderDragon");
                enderdragon.setCustomNameVisible(true);

            }


            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());
            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());
            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());
            Objects.requireNonNull(enderdragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());
        }
    }
    @EventHandler
    public static void onEnderDragonDamage(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof EnderDragon ){
            if(event.getDamager() instanceof EnderDragon){
                event.setDamage(220);
            }


        }
    }

}

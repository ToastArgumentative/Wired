package me.toast.wired.Listeners.ServerListeners;

import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailBootsMana;
import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailChestplateMana;
import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailHelmetMana;
import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailLeggingsMana;
import me.toast.wired.Utilities.PlayerUtils.Mana;
import me.toast.wired.Wired;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;

public class ManaHealthChange implements Listener {

    @EventHandler
    public static void onHealthChange(EntityRegainHealthEvent event){
        if(event.getEntity() instanceof Player player) {

            new BukkitRunnable() {
                @Override
                public void run() {
                    Player.Spigot spigot = player.spigot();
                    spigot.sendMessage(ChatMessageType.ACTION_BAR,
                            new TextComponent("❤" + ChatColor.RED + "" + ChatColor.BOLD + Math.round(player.getHealth()) + " " +
                                    ChatColor.AQUA + "\uD83E\uDDEA" + ChatColor.BOLD + Mana.getPlayerMana(player)));
                    ItemStack[] armor = new ItemStack[4];
                    armor[0] = new ItemStack(HolyGrailHelmetMana.createHolyGrailHelm());
                    armor[1] = new ItemStack(HolyGrailChestplateMana.createHolyGrailManaChestPlate());
                    armor[2] = new ItemStack(HolyGrailLeggingsMana.createHolyGrailPants());
                    armor[3] = new ItemStack(HolyGrailBootsMana.createHolyGrailManaBoots());
                    if(Arrays.equals(player.getInventory().getArmorContents(), armor)){

                    }


                }


            }.runTaskTimer(Wired.getPlugin(), 0, 20);
        }
    }
}

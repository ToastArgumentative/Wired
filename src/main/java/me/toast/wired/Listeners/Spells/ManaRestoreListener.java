package me.toast.wired.Listeners.Spells;

import me.toast.wired.Items.Spells.ManaRestore;
import me.toast.wired.PlayerUtils.Mana.Mana;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ManaRestoreListener implements Listener {
    @SuppressWarnings("unused")
    @EventHandler
    public void onManaRestore(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR) {

            if (player.getInventory().getItemInMainHand().getItemMeta().equals(ManaRestore.ManaRestoreSpell())) {
                if (Mana.getPlayerMana(player) < 50) {
                    if (player.getHealth() <= 45) {
                        player.damage(45);
                        player.sendMessage(ChatColor.RED + "You have been damaged by the spell! Because you are an idiot.");
                    } else {
                        player.setHealth(player.getHealth() - 45);
                        Mana.addMana(player, Mana.getPlayerMana(player) + 30);
                    }

                } else {
                    player.sendMessage(ChatColor.RED + "You do not need to restore mana!");
                }
                if (player.isDead()) {
                    Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has died! due to mana restore!");
                }

            }
        }
    }
}
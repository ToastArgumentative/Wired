package me.austin.wired.Listeners.CustomItemListeners;

import me.austin.wired.Utilities.PlayerUtils.Mana;
import me.austin.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import static me.austin.wired.Listeners.ServerListeners.CombatLog.incombat;

public class FlyingFeatherListener implements Listener {

    @EventHandler
    public void onFeatherClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
        if (itemInMainHand.getItemMeta() != null) {
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying Feather")) {
                if (Mana.getPlayerMana(p) >= 1) {
                    if (e.getAction() == Action.RIGHT_CLICK_AIR) {
                        if (!incombat.contains(p.getName())) {
                            e.getPlayer().setAllowFlight(true);
                            e.getPlayer().setFlying(true);
                            e.getPlayer().sendMessage(ChatColor.GREEN + "You are now flying!");
                            new BukkitRunnable(){
                                @Override
                                public void run(){
                                    if(e.getPlayer().isFlying()){
                                        Mana.removeMana(p, 1.5);
                                        if(Mana.getPlayerMana(p) <= 1){
                                            p.setFlying(false);
                                            p.setAllowFlight(false);
                                            p.sendMessage(ChatColor.RED + "You are out of mana!");
                                        }
                                    }
                                }
                            }.runTaskTimer(Wired.getPlugin(), 0, 20);
                        }
                        if (incombat.contains(p.getName())) {
                            e.getPlayer().sendMessage(ChatColor.RED + "You can't fly because you are in combat!");
                        }
                    }
                }
                if (e.getAction() == Action.LEFT_CLICK_AIR) {
                    e.getPlayer().setAllowFlight(false);
                    e.getPlayer().setFlying(false);
                    e.getPlayer().sendMessage(ChatColor.RED + "You are no longer flying!");
                }
            }
        }

    }

}
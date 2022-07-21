package me.toast.wired.Listeners.Spells;

import me.toast.wired.PlayerUtils.Mana.Mana;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class FamiliarListener implements Listener {

    @SuppressWarnings("unused")
    @EventHandler
    public void onFamiliar(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if(event.getAction() == Action.RIGHT_CLICK_AIR){
            if (Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Familiar")) {
                if(Mana.getPlayerMana(player) >= 75) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 300*20, 1, false, false));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300*20, 1, false, false));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300*20, 1, false, false));
                    Mana.removeMana(player, 75);
                }else{
                    player.sendMessage(ChatColor.RED + "You do not have enough mana to use this spell!");
            }

        }
    }
}
}
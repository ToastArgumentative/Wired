package me.toast.wired.Commands;

import me.toast.wired.PlayerUtils.PlayerVaults.VaultUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class OpenCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){


            ArrayList<ItemStack> vaultItems = VaultUtils.getItems(p);

            Inventory vault = Bukkit.createInventory(p, 54, "Your Personal Vault");

            for (ItemStack vaultItem : vaultItems) {
                        vault.addItem(vaultItem);
            }

            p.openInventory(vault);



        }



        return false;
    }

}

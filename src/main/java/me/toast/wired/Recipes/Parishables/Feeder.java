package me.toast.wired.Recipes.Parishables;

import me.toast.wired.Items.Parishables.FeederUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;


public class Feeder {

    public static void FeederRecipe() {

        ShapedRecipe feeder = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "Feeder"), FeederUtils.createFeeder());
        feeder.shape("WWW", "WGW", "WWW");
        feeder.setIngredient('W', Material.WHEAT);
        feeder.setIngredient('G', Material.GOLDEN_APPLE);
        Bukkit.addRecipe(feeder);

    }
}

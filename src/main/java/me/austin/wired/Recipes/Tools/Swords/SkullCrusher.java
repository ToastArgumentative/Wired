package me.austin.wired.Recipes.Tools.Swords;

import me.austin.wired.Utilities.Tools.Swords.SkullCrusherUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class SkullCrusher {
    public static void SkullCrusherRecipe() {
        //Diamond Sword ( Skull Crusher ) ( Legendary )
        ShapedRecipe SkullCrusher = new ShapedRecipe(new NamespacedKey(getPlugin(), "SkullCrusher"), new ItemStack(SkullCrusherUtils.createSkullCrusher()));
        SkullCrusher.shape(" D ", " D ", "NNN");
        SkullCrusher.setIngredient('D', Material.DIAMOND_BLOCK);
        SkullCrusher.setIngredient('N', Material.NETHERITE_INGOT);
        Bukkit.addRecipe(SkullCrusher);
    }
}

package com.lachlanm05.craftingcreator;

// Imports
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftingCreator extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("type poop (CraftingCreator Enabled!)");
        registerRecipies();
    }

    @Override
    public void onDisable() {
        getLogger().info("CraftingCreator disabled.");
    }

    private void registerRecipies() {
        // create item result, light.
        ItemStack customItem = new ItemStack(Material.LIGHT);
        ItemMeta meta = customItem.getItemMeta();

        // Create NamespacedKey for the cool light
        NamespacedKey key = new NamespacedKey(this, "gods_light");

        // Create the recipe
        ShapedRecipe recipe = new ShapedRecipe(key, customItem);
        recipe.shape("GDG", "DCD", "GDG");
        recipe.setIngredient('G', Material.GLOWSTONE);
        recipe.setIngredient('C', Material.COAL_BLOCK);
        recipe.setIngredient('D', Material.DIAMOND);

        // register it pls
        Bukkit.addRecipe(recipe);
    
    }
    



    
}

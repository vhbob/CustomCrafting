package com.vhbob.CustomCrafting;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("CustomCrafting has been " + ChatColor.GREEN + " enabled!" );
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("CustomCrafting has been " + ChatColor.RED + " disabled!" );
    }
}

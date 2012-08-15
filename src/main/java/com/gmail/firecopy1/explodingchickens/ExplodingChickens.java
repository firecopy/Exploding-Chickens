/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.firecopy1.explodingchickens;

import org.bukkit.plugin.java.JavaPlugin;

public class ExplodingChickens extends JavaPlugin {
    public int ExplosionDamage;
    boolean FireToggle;
    private final DamageListener dListener = new DamageListener(this);

    @Override
    public void onEnable() {
        loadConfig();
        registerEvents();
    }

    private void registerEvents() {
        this.getServer().getPluginManager().registerEvents(dListener, this);
    }

    private void loadConfig() {
        this.getConfig().options().copyDefaults(true);
        ExplosionDamage = this.getConfig().getInt("ExplosionDamage", 8);
        FireToggle = this.getConfig().getBoolean("FireToggle", false);
        
        saveConfig();
    }
}

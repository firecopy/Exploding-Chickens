/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.firecopy1.explodingchickens;

import org.bukkit.plugin.java.JavaPlugin;

public class ExplodingChickens extends JavaPlugin {
    
    private int explosionDamage;
    private boolean fireToggle;

    @Override
    public void onEnable() {
        loadConfig();
        getServer().getPluginManager().registerEvents(new DamageListener(this), this);
    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        explosionDamage = this.getConfig().getInt("ExplosionDamage", 8);
        fireToggle = this.getConfig().getBoolean("FireToggle", false);
        saveConfig();
    }
    
    public int getDamage() {
        return explosionDamage;
    }
    
    public boolean isFireToggle() {
        return fireToggle;
    }
}

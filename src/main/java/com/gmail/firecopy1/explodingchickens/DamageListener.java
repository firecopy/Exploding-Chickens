/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.firecopy1.explodingchickens;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

class DamageListener implements Listener{
    private ExplodingChickens plugin;
    private boolean FlameToggle;
    private float DamageOfExplosion;
    
    @EventHandler
    public void whenDamaged(EntityDeathEvent event) {
        DamageOfExplosion = plugin.ExplosionDamage;
        FlameToggle = plugin.FireToggle;
        Entity entity = event.getEntity();
        if (entity instanceof Chicken){
            Location ExplosionLoc = entity.getLocation();
            World world = entity.getWorld();
            world.createExplosion(ExplosionLoc, DamageOfExplosion, FlameToggle);
        }
    }
    
    public DamageListener(ExplodingChickens instance) {
        this.plugin = instance;
    }
   
}

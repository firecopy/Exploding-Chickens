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
    private final ExplodingChickens plugin;

    public DamageListener(ExplodingChickens instance) {
        this.plugin = instance;
    }
    
    @EventHandler
    public void whenDamaged(EntityDeathEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Chicken){
            Location Explosion = entity.getLocation();
            World world = entity.getWorld();
            world.createExplosion(Explosion, 8);         
        }
        
    }

}

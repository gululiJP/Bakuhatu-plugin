package site.gululi.bakuhatu;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Eventlistener implements Listener {
    @EventHandler
    public void onclick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        Location l = p.getLocation();
        World w = p.getWorld();
        if(p.getInventory().getItemInMainHand().getType() == Material.STICK){
            w.createExplosion(l,10,true,true);
        }

        }
}

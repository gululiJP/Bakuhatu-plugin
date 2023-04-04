package site.gululi.bakuhatu;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Bakuhatu extends JavaPlugin implements @NotNull Listener {
    private Eventlistener listeners;
    @Override
    public void onEnable(){
        //plugin setup
        Bukkit.getPluginManager().registerEvents(new Eventlistener(),this);
    }

    @Override
    public void onDisable(){

    }

}



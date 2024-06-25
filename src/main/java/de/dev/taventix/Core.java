package de.dev.taventix;

import de.dev.taventix.Commands.Info;
import de.dev.taventix.events.WelcomeEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {
d
    @Override
    public void onEnable() {
        getCommand("Info").setExecutor(new Info());
        getLogger().info("Startet");
        getServer().getPluginManager().registerEvents(new WelcomeEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

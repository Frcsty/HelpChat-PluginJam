package com.github.frcsty.gamejam;

import com.github.frcsty.gamejam.command.GameJamCommand;
import me.mattstudios.mf.base.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class GameJamPlugin extends JavaPlugin {
    
    private final Logger logger = this.getLogger();

    @Override
    public void onEnable() {
        final CommandManager manager = new CommandManager(this);
        
        manager.register(
                new GameJamCommand()
        );

        logger.log(Level.INFO, "Hello, Frosty's Plugin Jam Project has been awakened.");
    }

    @Override
    public void onDisable() {
        logger.log(Level.INFO, "Goodbye, Frosty's Plugin Jam Project is now shutting down :(");
    }

}

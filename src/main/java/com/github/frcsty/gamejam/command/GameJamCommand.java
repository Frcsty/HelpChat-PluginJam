package com.github.frcsty.gamejam.command;

import me.mattstudios.mf.annotations.Command;
import me.mattstudios.mf.annotations.Default;
import me.mattstudios.mf.annotations.Permission;
import me.mattstudios.mf.base.CommandBase;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

@Command("gamejam")
public final class GameJamCommand extends CommandBase {

    @Default
    public void onGameJamCommand(final Player player) {
        player.sendMessage(Component.text("We will see you all in the next GameJam when Frosty has some more motivation!"));
    }

}

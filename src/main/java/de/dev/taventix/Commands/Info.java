package de.dev.taventix.Commands;

import de.dev.taventix.Core;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Info implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        commandSender.sendMessage("Dieses Plugin ist von Taventix programmiert, und von " + Core.config.getString("Programmierer"));
        return false;
    }
}

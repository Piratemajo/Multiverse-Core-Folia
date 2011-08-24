package com.onarandombox.MultiverseCore.commands;

import java.util.List;

import org.bukkit.command.CommandSender;

import com.onarandombox.MultiverseCore.MultiverseCore;
import com.pneumaticraft.commandhandler.Command;

public abstract class MultiverseCommand extends Command {

    protected MultiverseCore plugin;

    public MultiverseCommand(MultiverseCore plugin) {
        super(plugin);
        this.plugin = plugin;
    }

    @Override
    public abstract void runCommand(CommandSender sender, List<String> args);

}

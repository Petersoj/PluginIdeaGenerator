package me.petersoj;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginIdeaGenerator extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String aliasUsed, String[] args) {
		if(command.getLabel().equals("generateidea")){
			
		}
		return true;
	}
}

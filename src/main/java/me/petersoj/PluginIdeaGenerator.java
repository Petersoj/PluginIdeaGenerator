package me.petersoj;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import me.petersoj.idea.PluginIdeas;

public class PluginIdeaGenerator extends JavaPlugin {
	
	private PluginIdeas pluginIdeas;

	@Override
	public void onEnable() {
		this.pluginIdeas = new PluginIdeas();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String aliasUsed, String[] args) {
		if(command.getLabel().equals("generateidea")){
			sender.sendMessage(pluginIdeas.getNewPluginIdea());
		}
		return true;
	}
}

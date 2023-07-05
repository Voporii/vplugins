package net.unethicalite.plugins.chopper;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("vforestry")
public interface ChopperConfig extends Config
{
	@ConfigItem(
			keyName = "tree",
			name = "Tree Type",
			description = "The type of tree to chop",
			position = 0
	)
	default Tree tree()
	{
		return Tree.REGULAR;
	}



	@ConfigItem(
		keyName = "Start",
		name = "Start/Stop",
		description = "Start/Stop Button",
		position = 2)
	default Button startStopButton()
	{
		return new Button();
	}
}

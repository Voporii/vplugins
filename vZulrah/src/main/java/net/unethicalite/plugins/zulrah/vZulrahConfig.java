package net.unethicalite.plugins.zulrah;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("vZulrah")
public interface vZulrahConfig extends Config
{
    @ConfigItem(
            keyName = "rangeGear",
            name = "Range Equipment",
            description = "Range equipment seperated by commas"
    )
    default String rangeGearNames()
    {
        return "";
    }

    @ConfigItem(
            keyName = "mageGear",
            name = "Mage Equipment",
            description = "Magic equipment seperated by commas."
    )
    default String mageGearNames()
    {
        return "";
    }

    @ConfigItem(
            keyName = "useRigour",
            name = "Use Rigour",
            description = "Use Rigour (75 Prayer)"
    )
    default boolean useRigour()
    {
        return false;
    }



}

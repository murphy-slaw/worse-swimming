package net.funkpla.WorseSwimming;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;


@Config(name="worse-swimming")
public class WorseConfig implements ConfigData {

    @Comment("Water friction when completely submerged")
    @ConfigEntry.BoundedDiscrete(max = 100)
    public int UnderwaterFriction = 35;

    @Comment("Water friction when wading")
    @ConfigEntry.BoundedDiscrete(max = 100)
    public int WadingFriction = 50;
}



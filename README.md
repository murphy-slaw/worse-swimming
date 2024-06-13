# Worse Swimming

Minecraft's movement code is complicated and has some problems.

One of these problems is that because of the way swimming is implemented, effects like Slowness and Speed barely affect swim speed at all.

I think this makes swimming too good. So I made this mod to make it worse.

## How it works

Movement on land applies a slowdown to entities based on the friction of the block the entity is moving on. Swimming has no friction component, which makes it easy to build up so much velocity in a tick that Slowness can't actually slow you down.

Worse Swimming adds two new friction components to the swimming movement calculation, once for movement when not immersed in water ("wading") and one for movement when completely immersed ("swimming"). The default values make wading considerably slower than swimming, but both can be adjusted in the configuration.

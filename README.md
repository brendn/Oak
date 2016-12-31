# Oak
A modding/plugin API for old versions of Minecraft.  More of a side project than anything so don't expect too much!

### What makes it different?

Oak isn't like Forge or ModLoader where the mod developers rely on vanilla code.  Instead, it is more like Bukkit - mod developers use the Oak API classes for their mods and don't have to use any Minecraft code.
The advantage a system like this has over Forge and ModLoader is that any mod/plugin using this API can work on any implementation of it, meaning mods can work on multiple versions.  

### Why old versions of the game?

If you wanted to, you *could* implement the Oak API to work with recent versions of the game, but I'm mainly focusing on Beta since there's still some people out there who play it and the modding scene is a bit of a mess there.  
Forge solved a lot of the problems ModLoader caused when it came to class modifications, by implementing many events and hooks so the mod developers wouldn't have to modify any classes.  Sadly, Forge didn't exist for the Beta versions of the game.

### What's the goal?
A Bukkit/Forge-like hybrid for old versions of the game.  Right now my main priority is client-side mods, then I'll try and figure out server mods.

### Project Structure

I plan to split these into different repos as the project progresses, but currently this is how it's laid out:

**me.brendn.oak.api** - The actual API, which is all a developer would need to work on their mod.

**me.brendn.oak.mcbeta** - A Minecraft Beta 1.7.3 implementation of the Oak API.

**me.brendn.plugintest** - A basic test plugin.

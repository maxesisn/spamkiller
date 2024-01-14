package cc.maxng.spamkiller;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("spamkiller")
public class SpamKiller {

    public SpamKiller() {
        // Constructor: Mod initialization logic can go here
        // Currently empty as your mod is primarily focused on Mixin functionality
        Logger LOGGER = LogUtils.getLogger();
        LOGGER.info("SpamKiller Initialized");
    }
}

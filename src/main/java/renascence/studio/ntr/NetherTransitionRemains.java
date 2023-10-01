package renascence.studio.ntr;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import renascence.studio.ntr.init.NTRBlockEntityTypes;
import renascence.studio.ntr.init.NTRBlocks;
import renascence.studio.ntr.init.NTRItemGroups;
import renascence.studio.ntr.init.NTRItems;

public class NetherTransitionRemains implements ModInitializer {
    public static final String MOD_ID = "ntr";
    public static final String MOD_NAME = "Nether Transition Remains";

    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        NTRBlocks.register();
        NTRBlockEntityTypes.register();

        NTRItems.register();
        NTRItemGroups.register();

        LOGGER.info(MOD_NAME + " has set up!");
    }
}

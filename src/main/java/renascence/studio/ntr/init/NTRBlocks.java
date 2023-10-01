package renascence.studio.ntr.init;

import ho.artisan.holib.registry.RegistryCasket;
import ho.artisan.holib.registry.registrar.BlockRegistrar;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import static renascence.studio.ntr.NetherTransitionRemains.MOD_ID;

public class NTRBlocks {
    public static final BlockRegistrar REGISTRAR = new BlockRegistrar(MOD_ID);

    public static final RegistryCasket<Block> SANGUINITE_BRICKS;

    public static void register() {

    }

    static {
        SANGUINITE_BRICKS = REGISTRAR.function("sanguinite_bricks", Block::new, Blocks.NETHER_BRICKS);
    }
}

package renascence.studio.ntr.data.generator.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider<Block> {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        var pickaxe = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
        var axe = getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);
        var ironLevel = getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

    }
}

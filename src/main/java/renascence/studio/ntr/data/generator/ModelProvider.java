package renascence.studio.ntr.data.generator;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import renascence.studio.ntr.init.NTRBlocks;
import renascence.studio.ntr.init.NTRItems;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        NTRBlocks.SANGUINITE_BRICKS.act(generator::registerCubeAllModelTexturePool);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        generator.register(NTRItems.ACTIVATION_SCEPTER.get(), Models.HANDHELD);
        generator.register(NTRItems.TRANSMISSITE_PICKAXE.get(), Models.HANDHELD);
        generator.register(NTRItems.TRANSMISSITE_AXE.get(), Models.HANDHELD);
        generator.register(NTRItems.TRANSMISSITE_HOE.get(), Models.HANDHELD);
        generator.register(NTRItems.TRANSMISSITE_SWORD.get(), Models.HANDHELD);
        generator.register(NTRItems.TRANSMISSITE_SHOVEL.get(), Models.HANDHELD);

        generator.register(NTRItems.TRANSMISSITE_SHEARS.get(), Models.GENERATED);
        generator.register(NTRItems.TRANSMISSITE_DUST.get(), Models.GENERATED);
        generator.register(NTRItems.TRANSMISSITE_GEM.get(), Models.GENERATED);
        generator.register(NTRItems.TRANSMISSITE_STICK.get(), Models.GENERATED);
        generator.register(NTRItems.TRANSMISSITE_INGOT.get(), Models.GENERATED);
    }

}

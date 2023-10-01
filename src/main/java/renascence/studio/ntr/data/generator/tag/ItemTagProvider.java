package renascence.studio.ntr.data.generator.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import renascence.studio.ntr.init.NTRItems;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider<Item> {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        var pickaxe = getOrCreateTagBuilder(ItemTags.PICKAXES);
        var axe = getOrCreateTagBuilder(ItemTags.AXES);
        var hoe = getOrCreateTagBuilder(ItemTags.HOES);
        var shovel = getOrCreateTagBuilder(ItemTags.SHOVELS);
        var sword = getOrCreateTagBuilder(ItemTags.SWORDS);

        var ingot = getOrCreateTagBuilder(ConventionalItemTags.INGOTS);
        var dust = getOrCreateTagBuilder(ConventionalItemTags.DUSTS);
        var ore = getOrCreateTagBuilder(ConventionalItemTags.ORES);
        var gem = getOrCreateTagBuilder(ConventionalItemTags.GEMS);

        NTRItems.TRANSMISSITE_SHOVEL.act(shovel::add);
        NTRItems.TRANSMISSITE_PICKAXE.act(pickaxe::add);
        NTRItems.TRANSMISSITE_AXE.act(axe::add);
        NTRItems.TRANSMISSITE_SWORD.act(sword::add);
        NTRItems.TRANSMISSITE_HOE.act(hoe::add);

        NTRItems.TRANSMISSITE_INGOT.act(ingot::add);
        NTRItems.TRANSMISSITE_DUST.act(dust::add);
        NTRItems.TRANSMISSITE_GEM.act(gem::add);
    }
}

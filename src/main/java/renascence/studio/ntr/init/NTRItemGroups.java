package renascence.studio.ntr.init;

import ho.artisan.holib.registry.RegistryCasket;
import ho.artisan.holib.registry.registrar.ItemGroupRegistrar;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static renascence.studio.ntr.NetherTransitionRemains.MOD_ID;

public class NTRItemGroups {
    public static final ItemGroupRegistrar REGISTRAR = new ItemGroupRegistrar(MOD_ID);

    public static final RegistryCasket<ItemGroup> MAIN;

    public static void register() {

    }

    static {
        MAIN = REGISTRAR.register("main", NTRItems.REGISTRAR.list(),
                (builder -> {
                    builder.icon(NTRItems.SANGUINITE_BRICKS.supplier(ItemStack::new));
                    builder.texture("ntr.png");
                    builder.noRenderedName();
                }));
    }
}

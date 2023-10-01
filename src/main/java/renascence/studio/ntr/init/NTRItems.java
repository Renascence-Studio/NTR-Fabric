package renascence.studio.ntr.init;

import ho.artisan.holib.registry.RegistryCasket;
import ho.artisan.holib.registry.registrar.ItemRegistrar;
import net.minecraft.item.*;

import static renascence.studio.ntr.NetherTransitionRemains.MOD_ID;

public class NTRItems {
    public static final ItemRegistrar REGISTRAR = new ItemRegistrar(MOD_ID);

    public static final RegistryCasket<BlockItem> SANGUINITE_BRICKS;

    public static final RegistryCasket<Item> TRANSMISSITE_DUST;
    public static final RegistryCasket<Item> TRANSMISSITE_INGOT;
    public static final RegistryCasket<Item> TRANSMISSITE_GEM;

    public static final RegistryCasket<Item> TRANSMISSITE_STICK;

    public static final RegistryCasket<Item> TRANSMISSITE_SWORD;
    public static final RegistryCasket<Item> TRANSMISSITE_SHOVEL;
    public static final RegistryCasket<Item> TRANSMISSITE_PICKAXE;
    public static final RegistryCasket<Item> TRANSMISSITE_AXE;
    public static final RegistryCasket<Item> TRANSMISSITE_HOE;
    public static final RegistryCasket<Item> TRANSMISSITE_SHEARS;
    public static final RegistryCasket<Item> ACTIVATION_SCEPTER;

    public static void register() {

    }

    static {
        SANGUINITE_BRICKS = REGISTRAR.blockItem("sanguinite_bricks", NTRBlocks.SANGUINITE_BRICKS);

        TRANSMISSITE_DUST = REGISTRAR.simple("transmissite_dust");
        TRANSMISSITE_INGOT = REGISTRAR.simple("transmissite_ingot");
        TRANSMISSITE_GEM = REGISTRAR.simple("transmissite_gem");
        TRANSMISSITE_STICK = REGISTRAR.simple("transmissite_stick");

        TRANSMISSITE_SWORD = REGISTRAR.function("transmissite_sword",
                (settings) -> new SwordItem(NTRMaterials.TRANSMISSITE, 3, -2.4F, settings));
        TRANSMISSITE_SHOVEL = REGISTRAR.function("transmissite_shovel",
                (settings) -> new ShovelItem(NTRMaterials.TRANSMISSITE, 1.5F, -3.0F, settings));
        TRANSMISSITE_PICKAXE = REGISTRAR.function("transmissite_pickaxe",
                (settings) -> new PickaxeItem(NTRMaterials.TRANSMISSITE, 1, -2.8F, settings));
        TRANSMISSITE_AXE = REGISTRAR.function("transmissite_axe",
                (settings) -> new AxeItem(NTRMaterials.TRANSMISSITE, 6.0F, -3.1F, settings));
        TRANSMISSITE_HOE = REGISTRAR.function("transmissite_hoe",
                (settings) -> new HoeItem(NTRMaterials.TRANSMISSITE, -2, -1.0F, settings));
        TRANSMISSITE_SHEARS = REGISTRAR.function("transmissite_shears",
                (settings) -> new ShearsItem(settings.maxDamage(514)));

        ACTIVATION_SCEPTER = REGISTRAR.simple("activation_scepter");
    }
}

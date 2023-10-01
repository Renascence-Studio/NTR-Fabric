package renascence.studio.ntr.data.generator.lang;

import ho.artisan.holib.tool.i18n.Translator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import renascence.studio.ntr.init.NTRItemGroups;
import renascence.studio.ntr.init.NTRItems;

public class ChineseProvider extends FabricLanguageProvider {
    public ChineseProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        Translator translator = new Translator(builder);

        translator.gen(NTRItemGroups.MAIN.get(), "地狱迁跃堡");

        builder.add(NTRItems.ACTIVATION_SCEPTER.get(), "激活权杖");
        builder.add(NTRItems.TRANSMISSITE_SHEARS.get(), "迁跃合金剪刀");

        builder.add(NTRItems.TRANSMISSITE_INGOT.get(), "迁跃合金锭");
        builder.add(NTRItems.TRANSMISSITE_STICK.get(), "迁跃合金杆");
        builder.add(NTRItems.TRANSMISSITE_GEM.get(), "迁跃宝石");
        builder.add(NTRItems.TRANSMISSITE_DUST.get(), "迁跃粉尘");

        builder.add(NTRItems.TRANSMISSITE_PICKAXE.get(), "迁跃合金镐");
        builder.add(NTRItems.TRANSMISSITE_SHOVEL.get(), "迁跃合金铲");
        builder.add(NTRItems.TRANSMISSITE_SWORD.get(), "迁跃合金剑");
        builder.add(NTRItems.TRANSMISSITE_HOE.get(), "迁跃合金锄");
        builder.add(NTRItems.TRANSMISSITE_AXE.get(), "迁跃合金斧");
    }
}

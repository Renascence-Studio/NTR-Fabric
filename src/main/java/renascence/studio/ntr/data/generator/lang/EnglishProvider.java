package renascence.studio.ntr.data.generator.lang;


import ho.artisan.holib.tool.i18n.Translator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import renascence.studio.ntr.init.NTRItems;

public class EnglishProvider extends FabricLanguageProvider {
    public EnglishProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        Translator translator = new Translator(builder);

        NTRItems.REGISTRAR.list().forEach((casket -> translator.gen(casket.get())));
    }
}

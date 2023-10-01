package renascence.studio.ntr.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import renascence.studio.ntr.data.generator.*;
import renascence.studio.ntr.data.generator.tag.*;
import renascence.studio.ntr.data.generator.recipe.*;
import renascence.studio.ntr.data.generator.lang.*;

public class NTRDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        var pack = generator.createPack();
        pack.addProvider(ModelProvider::new);
        pack.addProvider(LootTableProvider::new);

        pack.addProvider(ChineseProvider::new);
        pack.addProvider(EnglishProvider::new);

        pack.addProvider(ItemTagProvider::new);
        pack.addProvider(BlockTagProvider::new);

        pack.addProvider(RecipeProvider::new);
    }
}

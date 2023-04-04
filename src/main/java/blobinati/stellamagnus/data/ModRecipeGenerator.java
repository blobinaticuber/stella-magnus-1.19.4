package blobinati.stellamagnus.data;

import blobinati.stellamagnus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // my automatic JSON generating thing doesn't work for some reason
        //offerSmelting(exporter, List.of(ModItems.ZIRCONIUM_SHARD), RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT, 0.7f, 200, "stella-magnus");
    }
}

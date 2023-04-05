package blobinati.stellamagnus.data;

import blobinati.stellamagnus.block.ModBlocks;
import blobinati.stellamagnus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.ZIRCONIUM_SHARD), RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT, 0.7f, 200, "stella-magnus");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ZIRCONIUM_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIRCONIUM_SHARD_BLOCK);

        // JUST A BAD EXAMPLE
//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LUNAR_REGOLITH)
//                .pattern("AAA")
//                .pattern("AAA")
//                .pattern("AAA")
//                .input('A', Items.STICK)
//                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.LUNAR_REGOLITH)));
    }
}

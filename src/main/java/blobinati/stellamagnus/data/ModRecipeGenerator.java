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
        offerBlasting(exporter, List.of(ModItems.ZIRCONIUM_SHARD), RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT, 0.7f, 100, "stella-magnus");
        offerSmelting(exporter, List.of(ModItems.ZIRCONIUM_SHARD), RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT, 0.7f, 200, "stella-magnus");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ZIRCONIUM_SHARD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIRCONIUM_SHARD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ZIRCONIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIRCONIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ZIRCONIUM_SWORD)
                .pattern("Z")
                .pattern("Z")
                .pattern("S")
                .input('Z', ModItems.ZIRCONIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(ModItems.ZIRCONIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ZIRCONIUM_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ZIRCONIUM_PICKAXE)
                .pattern("ZZZ")
                .pattern(" S ")
                .pattern(" S ")
                .input('Z', ModItems.ZIRCONIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(ModItems.ZIRCONIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ZIRCONIUM_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ZIRCONIUM_AXE)
                .pattern(" ZZ")
                .pattern(" SZ")
                .pattern(" S ")
                .input('Z', ModItems.ZIRCONIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(ModItems.ZIRCONIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ZIRCONIUM_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ZIRCONIUM_SHOVEL)
                .pattern(" Z ")
                .pattern(" S ")
                .pattern(" S ")
                .input('Z', ModItems.ZIRCONIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(ModItems.ZIRCONIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ZIRCONIUM_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ZIRCONIUM_HOE)
                .pattern("ZZ ")
                .pattern(" S ")
                .pattern(" S ")
                .input('Z', ModItems.ZIRCONIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(ModItems.ZIRCONIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ZIRCONIUM_HOE)));

    }
}

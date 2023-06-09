package blobinati.stellamagnus.data;

import blobinati.stellamagnus.block.ModBlocks;
import blobinati.stellamagnus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ZIRCONIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORUNDUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ZIRCONIUM_SHARD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUNAR_BASALT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUNAR_BASALT_ZIRCONIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUNAR_BASALT_CORUNDUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUNAR_REGOLITH);
        //blockStateModelGenerator.registerAxisRotated(ModBlocks.ELECTROLYSIS_STATION, );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ZIRCONIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZIRCONIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORUNDUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ZIRCONIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCONIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCONIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ZIRCONIUM_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CORUNDUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORUNDUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORUNDUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORUNDUM_SHOVEL, Models.HANDHELD);
    }
}

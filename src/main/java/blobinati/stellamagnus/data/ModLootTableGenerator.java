package blobinati.stellamagnus.data;

import blobinati.stellamagnus.block.ModBlocks;
import blobinati.stellamagnus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // generates JSON loot table files for the following blocks:
        addDrop(ModBlocks.LUNAR_BASALT_ZIRCONIUM_ORE, oreDrops(ModBlocks.LUNAR_BASALT_ZIRCONIUM_ORE, ModItems.ZIRCONIUM_SHARD));
        addDrop(ModBlocks.LUNAR_BASALT_CORUNDUM_ORE, oreDrops(ModBlocks.LUNAR_BASALT_CORUNDUM_ORE, ModItems.CORUNDUM));
        addDrop(ModBlocks.ZIRCONIUM_BLOCK);
        addDrop(ModBlocks.CORUNDUM_BLOCK);
        addDrop(ModBlocks.ZIRCONIUM_SHARD_BLOCK);
        addDrop(ModBlocks.LUNAR_REGOLITH);
        addDrop(ModBlocks.LUNAR_BASALT);
        addDrop(ModBlocks.LAUNCH_PAD);
    }
}

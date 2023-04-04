package blobinati.stellamagnus.block;

import blobinati.stellamagnus.StellaMagnus;
import blobinati.stellamagnus.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks{

    public static final Block ZIRCONIUM_BLOCK = registerBlock("zirconium_block",
        new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.STELLAMAGNUS);
    public static final Block LUNAR_BASALT = registerBlock("lunar_basalt",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.STELLAMAGNUS);
    public static final Block LUNAR_BASALT_ZIRCONIUM_ORE = registerBlock("lunar_basalt_zirconium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                UniformIntProvider.create(3,7)), ModItemGroup.STELLAMAGNUS);
    public static final Block ZIRCONIUM_SHARD_BLOCK = registerBlock("zirconium_shard_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4.0f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroup.STELLAMAGNUS);
    public static final FallingBlock LUNAR_REGOLITH = (FallingBlock) registerBlock("lunar_regolith",
            new FallingBlock(AbstractBlock.Settings.of(Material.AGGREGATE).strength(4.0f).requiresTool().sounds(BlockSoundGroup.SAND)), ModItemGroup.STELLAMAGNUS);
            //new SandBlock(FabricBlockSettings.of(Material.SOIL).strength(4.0f).requiresTool()).sounds(BlockSoundGroup.SAND), ModItemGroup.STELLAMAGNUS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(StellaMagnus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(StellaMagnus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        StellaMagnus.LOGGER.info("Registering ModBlocks for " + StellaMagnus.MOD_ID);
    }

}

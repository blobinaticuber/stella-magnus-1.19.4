package blobinati.stellamagnus.item;

import blobinati.stellamagnus.StellaMagnus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ZIRCONIUM_SHARD = registerItem("zirconium_shard",
            new Item(new FabricItemSettings()));
    public static final Item ZIRCONIUM_INGOT = registerItem("zirconium_ingot",
            new Item(new FabricItemSettings()));

    public static final Item ZIRCONIUM_SWORD = registerItem("zirconium_sword",
            new SwordItem(ModToolMaterials.ZIRCONIUM, 3, -2.2f,
                    new FabricItemSettings()));

    public static final Item ZIRCONIUM_PICKAXE = registerItem("zirconium_pickaxe",
            new PickaxeItem(ModToolMaterials.ZIRCONIUM, 1, -2.8f,
                    new FabricItemSettings()));



    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, ZIRCONIUM_SHARD);
        addToItemGroup(ItemGroups.INGREDIENTS, ZIRCONIUM_INGOT);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_SHARD);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_INGOT);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_SWORD);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_PICKAXE);
    }
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        StellaMagnus.LOGGER.info("Registering mod items for " + StellaMagnus.MOD_ID);
        addItemsToItemGroup();
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(StellaMagnus.MOD_ID, name), item);
    }
}

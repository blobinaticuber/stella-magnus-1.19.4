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
    public static final Item CORUNDUM = registerItem("corundum",
            new Item(new FabricItemSettings()));

    public static final Item ZIRCONIUM_SWORD = registerItem("zirconium_sword",
            new SwordItem(ModToolMaterials.ZIRCONIUM, 6, -2.2f,
                    new FabricItemSettings()));
    public static final Item ZIRCONIUM_PICKAXE = registerItem("zirconium_pickaxe",
            new PickaxeItem(ModToolMaterials.ZIRCONIUM, 3, -2.6f,
                    new FabricItemSettings()));
    public static final Item ZIRCONIUM_AXE = registerItem("zirconium_axe",
            new AxeItem(ModToolMaterials.ZIRCONIUM, 8, -2.8f,
                    new FabricItemSettings()));
    public static final Item ZIRCONIUM_SHOVEL = registerItem("zirconium_shovel",
            new ShovelItem(ModToolMaterials.ZIRCONIUM, 3.5f, -2.8f,
                    new FabricItemSettings()));


    public static final Item CORUNDUM_SWORD = registerItem("corundum_sword",
            new SwordItem(ModToolMaterials.CORUNDUM, 7, -2.2f,
                    new FabricItemSettings()));
    public static final Item CORUNDUM_PICKAXE = registerItem("corundum_pickaxe",
            new PickaxeItem(ModToolMaterials.CORUNDUM, 4, -2.6f,
                    new FabricItemSettings()));
    public static final Item CORUNDUM_AXE = registerItem("corundum_axe",
            new AxeItem(ModToolMaterials.CORUNDUM, 9, -2.8f,
                    new FabricItemSettings()));
    public static final Item CORUNDUM_SHOVEL = registerItem("corundum_shovel",
            new ShovelItem(ModToolMaterials.CORUNDUM, 4.5f, -2.8f,
                    new FabricItemSettings()));



    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_SHARD);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_INGOT);

        addToItemGroup(ModItemGroup.STELLAMAGNUS, CORUNDUM);

        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_SWORD);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_PICKAXE);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_AXE);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, ZIRCONIUM_SHOVEL);

        addToItemGroup(ModItemGroup.STELLAMAGNUS, CORUNDUM_SWORD);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, CORUNDUM_PICKAXE);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, CORUNDUM_AXE);
        addToItemGroup(ModItemGroup.STELLAMAGNUS, CORUNDUM_SHOVEL);
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

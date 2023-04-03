package blobinati.stellamagnus.item;

import blobinati.stellamagnus.StellaMagnus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup STELLAMAGNUS;

    public static void registerItemGroups() {
        // This has the zirconium texture on the item tab, and I'm not sure why
        STELLAMAGNUS = FabricItemGroup.builder(new Identifier(StellaMagnus.MOD_ID, "tab_icon"))
                .displayName(Text.literal("Stella Magnus"))
                .icon(() -> new ItemStack(ModItems.ZIRCONIUM_SHARD)).build();
    }
}

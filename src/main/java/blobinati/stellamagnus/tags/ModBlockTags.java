package blobinati.stellamagnus.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    // just a test that doesn't work for getting a custom tag to implement my custom ore replacement generation of lunar basalt in custom biome of custom dimension
    //public static final TagKey<Block> WOOL = BlockTags.of("wool");


    public static final TagKey<Block> MOON_ORE_REPLACEABLES = of("moon_ore_replaceables");
    //public static final TagKey<Block> DEEPSLATE_ORE_REPLACEABLES = BlockTags.of("deepslate_ore_replaceables");

    private ModBlockTags() {
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}

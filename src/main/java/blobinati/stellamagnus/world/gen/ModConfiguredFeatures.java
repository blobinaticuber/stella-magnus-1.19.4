package blobinati.stellamagnus.world.gen;

import blobinati.stellamagnus.StellaMagnus;
import blobinati.stellamagnus.block.ModBlocks;
import blobinati.stellamagnus.tags.ModBlockTags;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> ZIRCONIUM_ORE_KEY = registerKey("zirconium_ore_key");

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(StellaMagnus.MOD_ID, name));
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //RuleTest deepslate_replacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest moon_replacables = new TagMatchRuleTest(ModBlockTags.MOON_ORE_REPLACEABLES);

       // ConfiguredFeatures.register();

       List<OreFeatureConfig.Target> moonZirconiumOres = List.of(OreFeatureConfig.createTarget(moon_replacables, ModBlocks.LUNAR_BASALT_ZIRCONIUM_ORE.getDefaultState()));

       register(context, ZIRCONIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(moonZirconiumOres, 10));


    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

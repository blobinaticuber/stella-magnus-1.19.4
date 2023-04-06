package blobinati.stellamagnus.data;

import blobinati.stellamagnus.world.gen.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGenerator {
    public static void generateOres() {
        BiomeModifications.addFeature(ModBiomeSelectors.foundInMoon(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ZIRCONIUM_ORE_PLACED_KEY);
    }


}

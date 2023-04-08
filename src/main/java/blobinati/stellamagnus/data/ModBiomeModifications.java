package blobinati.stellamagnus.data;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.Collection;
import java.util.function.Predicate;

import static com.mojang.datafixers.View.create;

public class ModBiomeModifications {
    private ModBiomeModifications() {
    }

//    public static void addFeature(Predicate<BiomeSelectionContext> biomeSelector, GenerationStep.Feature step, RegistryKey<PlacedFeature> placedFeatureRegistryKey) {
//        create(placedFeatureRegistryKey.getValue()).add(ModificationPhase.ADDITIONS, biomeSelector, context -> {
//            context.getGenerationSettings().addFeature(step, placedFeatureRegistryKey);
//        });
//    }


//    public static BiomeModification create(Identifier id) {
//        return new BiomeModification(id);
//    }

}

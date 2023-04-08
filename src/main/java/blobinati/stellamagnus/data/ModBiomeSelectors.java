package blobinati.stellamagnus.data;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.world.dimension.DimensionOptions;

import java.util.function.Predicate;

public final class ModBiomeSelectors {
    private ModBiomeSelectors() {
    }

    public static Predicate<BiomeSelectionContext> foundInMoon() {
        return context -> context.canGenerateIn(ModDimensionOptions.MOON);
    }

}

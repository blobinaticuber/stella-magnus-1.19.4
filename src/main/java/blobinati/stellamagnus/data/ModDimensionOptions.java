package blobinati.stellamagnus.data;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGenerator;
public record ModDimensionOptions(RegistryEntry<DimensionType> dimensionTypeEntry, ChunkGenerator chunkGenerator) {
    public static final Codec<net.minecraft.world.dimension.DimensionOptions> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(DimensionType.REGISTRY_CODEC.fieldOf("type").forGetter(net.minecraft.world.dimension.DimensionOptions::dimensionTypeEntry), ChunkGenerator.CODEC.fieldOf("generator").forGetter(net.minecraft.world.dimension.DimensionOptions::chunkGenerator)).apply(instance, instance.stable(net.minecraft.world.dimension.DimensionOptions::new));
    });

    public static final RegistryKey<net.minecraft.world.dimension.DimensionOptions> MOON;

    public ModDimensionOptions(RegistryEntry<DimensionType> dimensionTypeEntry, ChunkGenerator chunkGenerator) {
        this.dimensionTypeEntry = dimensionTypeEntry;
        this.chunkGenerator = chunkGenerator;
    }

    public RegistryEntry<DimensionType> dimensionTypeEntry() {
        return this.dimensionTypeEntry;
    }

    public ChunkGenerator chunkGenerator() {
        return this.chunkGenerator;
    }

    static {
        MOON = RegistryKey.of(RegistryKeys.DIMENSION, new Identifier("the_moon"));
    }


}

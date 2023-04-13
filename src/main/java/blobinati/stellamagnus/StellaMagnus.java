package blobinati.stellamagnus;

import blobinati.stellamagnus.block.ModBlocks;
import blobinati.stellamagnus.data.ModBiomeSelectors;
import blobinati.stellamagnus.data.ModLootTableGenerator;
import blobinati.stellamagnus.data.ModWorldGenerator;
import blobinati.stellamagnus.item.ModItemGroup;
import blobinati.stellamagnus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// This is a test comment!
public class StellaMagnus implements ModInitializer {
	public static final String MOD_ID = "stella-magnus";
	public static final Logger LOGGER = LoggerFactory.getLogger("stella-magnus");

	public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(StellaMagnus.MOD_ID,"moon_zirconium_ore"));

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		//ModWorldGenerator.generateModWorldGen();
		BiomeModifications.addFeature(ModBiomeSelectors.foundInMoon(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);
		//ModBiomeModifications.addFeature(ModBiomeSelectors.foundInMoon(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);
	}
}
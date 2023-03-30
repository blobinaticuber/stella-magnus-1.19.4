package blobinati.stellamagnus;

import blobinati.stellamagnus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// This is a test comment!
public class StellaMagnus implements ModInitializer {
	public static final String MOD_ID = "stella-magnus";
	public static final Logger LOGGER = LoggerFactory.getLogger("stella-magnus");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}
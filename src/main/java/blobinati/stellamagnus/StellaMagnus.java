package blobinati.stellamagnus;

import blobinati.stellamagnus.block.ModBlocks;
import blobinati.stellamagnus.item.ModItemGroup;
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
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
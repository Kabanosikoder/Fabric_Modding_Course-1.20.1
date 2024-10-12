package net.panther.mccourse;

import net.fabricmc.api.ModInitializer;

import net.panther.mccourse.block.ModBlocks;
import net.panther.mccourse.enchantment.ModEnchantments;
import net.panther.mccourse.item.ModItemGroup;
import net.panther.mccourse.item.ModItems;
import net.panther.mccourse.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups(); // call groups at top

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantments();
	}
}
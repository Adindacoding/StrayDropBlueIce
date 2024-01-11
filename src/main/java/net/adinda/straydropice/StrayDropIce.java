package net.adinda.straydropice;

import net.adinda.straydropice.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrayDropIce implements ModInitializer {
	public static final String MOD_ID = "straydropice";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModLootTableModifiers.modifyLootTables();

		LOGGER.info("Hello Fabric world!");
	}
}
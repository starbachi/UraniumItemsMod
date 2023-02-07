package net.starboat.uraniumitemsmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UraniumMod implements ModInitializer {

	public static final String MODID = "uranium_items_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		LOGGER.info("Starting Uranium Items Mod");
		ModItems.registerModItems();
	}
}
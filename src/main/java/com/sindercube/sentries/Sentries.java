package com.sindercube.sentries;

import com.sindercube.sentries.registry.ModBlocks;
import com.sindercube.sentries.registry.ModEntityTypes;
import com.sindercube.sentries.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sentries implements ModInitializer {

	public static final String MOD_ID = "sentries";
	public static final Logger LOGGER = LoggerFactory.getLogger("Sentries");

	public static Identifier of(String path) {
		return Identifier.of(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		ModItems.init();
		ModBlocks.init();
		ModEntityTypes.init();
		LOGGER.info("Initialized!");
	}

}

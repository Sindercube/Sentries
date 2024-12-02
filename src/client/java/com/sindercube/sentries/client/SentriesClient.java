package com.sindercube.sentries.client;

import com.sindercube.iconic.customModel.api.event.CustomModelLoadingEvents;
import com.sindercube.sentries.client.registry.ModEntityRenderers;
import net.fabricmc.api.ClientModInitializer;

public class SentriesClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		CustomModelLoadingEvents.AFTER_MODELS_LOADED.register(ModEntityRenderers::init);
	}

}

package com.sindercube.sentries.client.registry;

import com.sindercube.iconic.customModel.loader.CustomModelLoader;
import com.sindercube.sentries.Sentries;
import com.sindercube.sentries.client.content.entity.model.CannonEntityModel;
import com.sindercube.sentries.client.content.entity.renderer.CannonEntityRenderer;
import com.sindercube.sentries.registry.ModEntityTypes;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModEntityRenderers {

	public static Identifier CANNON_ID = Sentries.of("cannon");
	public static final EntityModelLayer CANNON_LAYER = new EntityModelLayer(CANNON_ID, "main");

	public static void init() {
		EntityRendererRegistry.register(
			ModEntityTypes.CANNON,
			context -> new CannonEntityRenderer(context, new CannonEntityModel(context.getPart(CANNON_LAYER), CANNON_ID))
		);
		EntityModelLayerRegistry.registerModelLayer(
			CANNON_LAYER,
			() -> CustomModelLoader.getEntity(CANNON_ID)
		);
	}

}

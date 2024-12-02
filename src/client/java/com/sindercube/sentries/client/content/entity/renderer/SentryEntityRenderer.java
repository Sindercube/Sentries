package com.sindercube.sentries.client.content.entity.renderer;

import com.sindercube.iconic.customModel.api.content.entity.renderer.LoadedEntityRenderer;
import com.sindercube.sentries.client.content.entity.model.SentryEntityModel;
import com.sindercube.sentries.content.entity.SentryEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public abstract class SentryEntityRenderer extends LoadedEntityRenderer<SentryEntity, SentryEntityModel> {

	public SentryEntityRenderer(EntityRendererFactory.Context context, SentryEntityModel entityModel) {
		super(context, entityModel, 0.5f);
	}

}

package com.sindercube.sentries.client.content.entity.model;

import com.sindercube.iconic.customModel.api.content.entity.model.LoadedEntityModel;
import com.sindercube.sentries.content.entity.SentryEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.util.Identifier;

public abstract class SentryEntityModel extends LoadedEntityModel<SentryEntity> {

	public SentryEntityModel(ModelPart root, Identifier id) {
		super(root, id);
	}

	@Override
    public void setAngles(SentryEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

}

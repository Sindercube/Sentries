package com.sindercube.sentries.client.content.entity.model;

import com.sindercube.sentries.content.entity.SentryEntity;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public abstract class SentryEntityModel extends EntityModel<SentryEntity> {

    @Override
    public void setAngles(SentryEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {

    }

}

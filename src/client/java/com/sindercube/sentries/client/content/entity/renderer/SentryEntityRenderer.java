package com.sindercube.sentries.client.content.entity.renderer;

import com.sindercube.sentries.content.entity.SentryEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public abstract class SentryEntityRenderer extends EntityRenderer<SentryEntity> {

    protected SentryEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public Identifier getTexture(SentryEntity entity) {
        return null;
    }

}

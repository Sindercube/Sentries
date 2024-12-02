package com.sindercube.sentries.content.entity;

import com.sindercube.iconic.constructs.api.content.entity.ConstructableEntity;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class SentryEntity extends MobEntity implements ConstructableEntity {

	protected SentryEntity(EntityType<? extends SentryEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected void initGoals() {
		super.initGoals();
	}

	@Override
    protected void initDataTracker(DataTracker.Builder builder) {
		super.initDataTracker(builder);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
		super.readCustomDataFromNbt(nbt);
    }

    @Override
	public void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);
    }

	@Override
	public void onConstructed(BlockPattern.Result result, World world, BlockPos headPos) {

	}

	public static DefaultAttributeContainer.Builder createMobAttributes() {
		return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_STEP_HEIGHT, 0.0);
	}

}

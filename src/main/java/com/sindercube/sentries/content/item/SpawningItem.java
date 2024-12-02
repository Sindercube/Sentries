package com.sindercube.sentries.content.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.SpawnEggItem;

public class SpawningItem extends SpawnEggItem {

	public SpawningItem(EntityType<? extends MobEntity> type, Settings settings) {
		super(type, 0, 0, settings);
	}

	@Override
	public int getColor(int tintIndex) {
//		return 0;
		return 16581375;
	}

}

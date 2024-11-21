package com.sindercube.sentries.registry;

import com.sindercube.sentries.Sentries;
import com.sindercube.sentries.content.entity.CannonEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntityTypes {

    public static void init() {}

    public static final EntityType<CannonEntity> CANNON = register("cannon",
            EntityType.Builder.create(CannonEntity::new, SpawnGroup.MISC)
    );

    private static <T extends Entity> EntityType<T> register(String path, EntityType.Builder<T> builder) {
        Identifier id = Sentries.of(path);
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, id);
        return Registry.register(Registries.ENTITY_TYPE, key, builder.build(path));
    }

}

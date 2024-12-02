package com.sindercube.sentries.registry;

import com.sindercube.sentries.Sentries;
import com.sindercube.sentries.content.item.SpawningItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static void init() {}

    public static final Item CANNON_CRATE = register("cannon_crate", new SpawningItem(
		ModEntityTypes.CANNON,
		new Item.Settings()
	));

	private static Item register(String path, Item item) {
        Identifier id = Sentries.of(path);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Registry.register(Registries.ITEM, key, item);
    }

}

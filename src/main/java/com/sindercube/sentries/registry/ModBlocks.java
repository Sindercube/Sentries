package com.sindercube.sentries.registry;

import com.sindercube.sentries.Sentries;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static void init() {}

    public static final Block DEFENSE_CORE = register("defense_core", new Block(AbstractBlock.Settings.create()));

    private static Block register(String path, Block block) {
        Identifier id = Sentries.of(path);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Registry.register(Registries.BLOCK, key, block);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
        Item item = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, itemKey, item);
        return block;
    }

}

package com.duckium.items;

import com.duckium.DuckiumMod;
import com.duckium.blocks.DuckiumBlocks;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import com.duckium.tabs.DuckiumTabs;

import java.util.logging.Logger;

public class DuckiumItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(DuckiumMod.MOD_ID, Registries.ITEM);
    
    public static final RegistrySupplier<Item> INGOT = ITEMS.register(new ResourceLocation(DuckiumMod.MOD_ID, "ingot"), () -> new Item(baseProperties()));
    public static final RegistrySupplier<Item> ORE = ITEMS.register(new ResourceLocation(DuckiumMod.MOD_ID, "ore"), () -> new Item(baseProperties()));
    
    public static final RegistrySupplier<Item> ORE_BLOCK = 
            ITEMS.register(new ResourceLocation(DuckiumMod.MOD_ID, "ore_block"), 
                    () -> new BlockItem(DuckiumBlocks.ORE_BLOCK.get(), baseProperties()));
    
    public static final RegistrySupplier<Item> DEEPSLATE_ORE_BLOCK = 
            ITEMS.register(new ResourceLocation(DuckiumMod.MOD_ID, "deepslate_ore_block"), 
                    () -> new BlockItem(DuckiumBlocks.DEEPSLATE_ORE_BLOCK.get(), baseProperties()));
    
    public static Item.Properties baseProperties()
    {
        return new Item.Properties()
                .arch$tab(DuckiumTabs.TABS);
    }
    
    public static void init(){
        ITEMS.register();
    }
}

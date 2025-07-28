package com.duckium.items;

import com.duckium.DuckiumMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import com.duckium.tabs.DuckiumTabs;

import java.util.logging.Logger;

public class DuckiumItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(DuckiumMod.MOD_ID, Registries.ITEM);
    
    public static final RegistrySupplier<Item> INGOT = ITEMS.register(new ResourceLocation(DuckiumMod.MOD_ID, "ingot"), () -> new Item(baseProperties("ingot")));
    public static final RegistrySupplier<Item> ORE = ITEMS.register(new ResourceLocation(DuckiumMod.MOD_ID, "ore"), () -> new Item(baseProperties("ore")));
    
    public static Item.Properties baseProperties(String name)
    {
        return new Item.Properties()
                .arch$tab(DuckiumTabs.TABS);
    }
    
    public static void init(){
        ITEMS.register();

        Logger.getLogger(DuckiumMod.MOD_ID).info("duckium ITEMS REGISTERED");
    }
}

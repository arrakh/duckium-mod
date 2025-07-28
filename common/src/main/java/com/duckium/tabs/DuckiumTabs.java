package com.duckium.tabs;

import com.duckium.DuckiumMod;
import com.duckium.items.DuckiumItems;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DuckiumTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(DuckiumMod.MOD_ID, Registries.CREATIVE_MODE_TAB);
    
    public static RegistrySupplier<CreativeModeTab> TABS = CREATIVE_MODE_TABS.register("duckium.tab", () -> CreativeTabRegistry.create(Component.translatable("category.duckium.tab"), () -> new ItemStack(DuckiumItems.INGOT.get())));

    public static void init(){
        CREATIVE_MODE_TABS.register();
    }
}

package com.duckium.fabric;

import net.fabricmc.api.ModInitializer;

import com.duckium.DuckiumMod;

public final class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        DuckiumMod.init();
    }
}

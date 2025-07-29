package com.duckium.blocks;

import com.duckium.DuckiumMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DuckiumBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(DuckiumMod.MOD_ID, Registries.BLOCK);
    
    public static final RegistrySupplier<Block> ORE_BLOCK = 
            BLOCKS.register(new ResourceLocation(DuckiumMod.MOD_ID, "ore_block"), 
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1f)));
    
    public static final RegistrySupplier<Block> DEEPSLATE_ORE_BLOCK = 
            BLOCKS.register(new ResourceLocation(DuckiumMod.MOD_ID, "deepslate_ore_block"), 
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5f)));
    
    public static void init(){
        BLOCKS.register();
    }
}

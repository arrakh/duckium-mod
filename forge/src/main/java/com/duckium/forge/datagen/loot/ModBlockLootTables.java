package com.duckium.forge.datagen.loot;

import com.duckium.blocks.DuckiumBlocks;
import com.duckium.items.DuckiumItems;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.stream.StreamSupport;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags() );
    }

    @Override
    protected void generate() {
        this.dropOther(DuckiumBlocks.ORE_BLOCK.get(), DuckiumItems.ORE.get());
        this.createOreDrop(DuckiumBlocks.ORE_BLOCK.get(), DuckiumItems.ORE.get());
        
        this.dropOther(DuckiumBlocks.DEEPSLATE_ORE_BLOCK.get(), DuckiumItems.ORE.get());
        this.createOreDrop(DuckiumBlocks.DEEPSLATE_ORE_BLOCK.get(), DuckiumItems.ORE.get());
    }
    
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return () -> StreamSupport.stream(DuckiumBlocks.BLOCKS.spliterator(), false)
                .map(RegistrySupplier<Block>::get)
                .iterator();
    }
}

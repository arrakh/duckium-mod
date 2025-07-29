package com.duckium.forge.datagen;

import com.duckium.DuckiumMod;
import com.duckium.blocks.DuckiumBlocks;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DuckiumMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(DuckiumBlocks.ORE_BLOCK);
        blockWithItem(DuckiumBlocks.DEEPSLATE_ORE_BLOCK);
    }
    
    private void blockWithItem(RegistrySupplier<Block> blockRegistry){
        simpleBlockWithItem(blockRegistry.get(), cubeAll(blockRegistry.get()));
    }
}

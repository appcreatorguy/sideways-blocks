package com.github.appcreatorguy.mods.sidewaysblocks.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

import static com.github.appcreatorguy.mods.sidewaysblocks.SidewaysblocksMain.*;
import static com.github.appcreatorguy.mods.sidewaysblocks.util.BlockUtils.*;

public class SidewaysblocksBlocks {
    //Blocks
    public static final Block TEST_DIRT = new Block(FabricBlockSettings.of(Material.SOIL, MapColor.DIRT_BROWN).breakByTool(FabricToolTags.SHOVELS).strength(0.5F).sounds(BlockSoundGroup.GRAVEL));

    public static void Init(){
        //SIDEWAYSBLOCKS BLOCKS
        registerBlock(true, ItemGroup.BUILDING_BLOCKS, "test_dirt", TEST_DIRT);

        LOGGER.info("Sidewaysblocks Blocks Initialized");
    }
}

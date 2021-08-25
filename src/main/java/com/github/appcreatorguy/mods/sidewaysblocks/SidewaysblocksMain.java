package com.github.appcreatorguy.mods.sidewaysblocks;

import com.github.appcreatorguy.mods.sidewaysblocks.block.SidewaysblocksBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SidewaysblocksMain implements ModInitializer {
    public static final String SIDEWAYSBLOCKS = "sidewaysblocks";
    public static final Logger LOGGER = LogManager.getLogger("Sidewaysblocks Main");

    public static Identifier id(String path){
        return new Identifier(SIDEWAYSBLOCKS, path);
    }

    @Override
    public void onInitialize() {
        SidewaysblocksBlocks.Init();

        LOGGER.info("Sidewaysblocks Initialized");
    }
}

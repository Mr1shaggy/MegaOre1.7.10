package com.main.mod.Blocks;

import com.main.mod.itemblocks.ItemBlockOres;
import cpw.mods.fml.common.registry.GameRegistry;

import static com.main.mod.Blocks.BlockDecMO.*;

/**
 * Created by brandon on 11/27/14.
 */
public class BlocksMO {

    public static void init() {
        registerBlocks();
    }

    public static void registerBlocks() {
        blockOres = new BlockOres().setBlockName("blockOres");
        GameRegistry.registerBlock(blockOres, ItemBlockOres.class, "blockOres");
    }
}

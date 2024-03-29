package com.main.mod.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by brandon on 11/28/14.
 */
public class ItemBlockOres extends ItemBlock {

    final static String[] subBlocks = new String[] {"Copper", "Tin", "Nickel", "Steel"};

    public ItemBlockOres(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if(i < 0 || i >= subBlocks.length) {
            i = 0;
        }

        return super.getUnlocalizedName() + "." + subBlocks[i] + "Ores";
    }

    public int getMetadata(int meta) {
        return meta;
    }
}

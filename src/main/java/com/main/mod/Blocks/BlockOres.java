package com.main.mod.Blocks;

import com.main.mod.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * Created by brandon on 11/28/14.
 */
public class BlockOres extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon[] texture;

    final static String[] subBlocks = new String[] {"Copper", "Tin", "Nickel", "Steel"};

    public BlockOres() {
        super(Material.rock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setCreativeTab(Main.tabMegaOreMaterials);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        texture = new IIcon[subBlocks.length];

        for (int i = 0; i < subBlocks.length; i++) {
            texture[i] = iconRegister.registerIcon(Main.modID + ":" + subBlocks[i] + "Ore");
        }
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < subBlocks.length; i++) {
            list.add(new ItemStack(block, 1, i));

        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return texture[meta];
    }

    public int damageDropped(int meta) {
        return meta;
    }
}

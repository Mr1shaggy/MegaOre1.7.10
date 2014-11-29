package com.main.mod.Items;

import com.main.mod.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by brandon on 11/28/14.
 */
public class SimpleItemsMO extends Item {

    public SimpleItemsMO() {
        this.setCreativeTab(Main.tabMegaOreMaterials);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Main.modID + ":" + this.getUnlocalizedName().substring(5));
    }
}

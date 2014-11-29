package com.main.mod.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import static com.main.mod.Items.ItemDecMO.*;

/**
 * Created by brandon on 11/28/14.
 */
public class ItemsMO {

    public static void init() {
        registerItems();
    }

    public static void registerItems() {
        itemCopperIngot = registerItem(new SimpleItemsMO().setUnlocalizedName("CopperIngot"));
        itemNickelIngot = registerItem(new SimpleItemsMO().setUnlocalizedName("NickelIngot"));
        itemTinIngot = registerItem(new SimpleItemsMO().setUnlocalizedName("TinIngot"));
        itemSteelIngot = registerItem(new SimpleItemsMO().setUnlocalizedName("SteelIngot"));
    }

    public static Item registerItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        return item;
    }
}

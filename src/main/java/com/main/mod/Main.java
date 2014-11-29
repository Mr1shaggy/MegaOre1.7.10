package com.main.mod;


import com.main.mod.Blocks.BlocksMO;
import com.main.mod.Items.ItemsMO;
import com.main.mod.worldgen.MOWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = Main.modID, version = Main.version, name = Main.modName)
public class Main {

    public static final String modID = "Main";
    public static final String version = "Alpha";
    public static final String modName = "MegaOre";

    public static CreativeTabs tabMegaOre = new CreativeTabs("MegaOre") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.diamond_ore);
      }
    };

    public static CreativeTabs tabMegaOreMaterials = new CreativeTabs("MegaOre Materials") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.anvil);
        }
    };

    MOWorldGen eventWorldGen = new MOWorldGen();


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent) {

        BlocksMO.init();
        ItemsMO.init();
        GameRegistry.registerWorldGenerator(eventWorldGen, 0);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent init) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}

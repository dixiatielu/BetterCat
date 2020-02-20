package com.dxtl.btc.util;

import com.dxtl.btc.Init.ModBlocks;
import com.dxtl.btc.Init.ModItems;
import com.dxtl.btc.Main;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class InitHelper {
    public static void itemInit(Item item, String name, CreativeTabs tab) {
        item.setUnlocalizedName(name);
        item.setRegistryName(name);
        item.setCreativeTab(tab);
        ModItems.ITEMS.add(item);
    }
    public static void itemModelRegistry(Item item) {
        Main.proxy.registeryModel(item, 0, "inventory");
    }
    public static void blockInit(Block block, String name, CreativeTabs tab, float hardness) {
        block.setUnlocalizedName(name);
        block.setRegistryName(name);
        block.setCreativeTab(tab);
        block.setHardness(hardness);
        ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        ModBlocks.BLOCKS.add(block);
    }
}

package com.dxtl.btc.Proxy;

import com.dxtl.btc.common.EventLoader;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void registeryModel(Item item, int meta, String id){}
    public void preInit(FMLPreInitializationEvent event) {

    }
    public void init(FMLInitializationEvent event) {
        new EventLoader();
    }
    public void postInit(FMLPostInitializationEvent event) {

    }
}

package com.dxtl.btc.common;

import net.minecraftforge.common.MinecraftForge;

public class EventLoader {
    public void EventLoader() {
        MinecraftForge.EVENT_BUS.register(this);
    }

}

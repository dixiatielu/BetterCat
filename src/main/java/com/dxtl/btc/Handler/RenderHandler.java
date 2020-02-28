package com.dxtl.btc.Handler;

import com.dxtl.btc.Entities.BetterCat;
import com.dxtl.btc.Entities.render.RenderBetterCat;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(BetterCat.class, new IRenderFactory<BetterCat>() {
            @Override
            public Render<? super BetterCat> createRenderFor(RenderManager manager) {
                return new RenderBetterCat(manager);
            }
        });
    }
}

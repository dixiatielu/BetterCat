package com.dxtl.btc.Handler;

import com.dxtl.btc.Init.ModBlocks;
import com.dxtl.btc.Init.ModItems;
import com.dxtl.btc.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegistery(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBlockRegistery(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
    @SubscribeEvent
    public static void onModelRegistery(ModelRegistryEvent event) {
        modelRegisteryHelper(ModItems.ITEMS);
        modelRegisteryHelper(ModBlocks.BLOCKS);
    }

    private static <T> void modelRegisteryHelper(List<T> list) {
        for(T element : list) {
            if(element instanceof IHasModel) {
                ((IHasModel) element).registryItemRender();
            }
        }
    }

    public static void preInitRegistries() {
        RenderHandler.registerEntityRenders();
    }
}

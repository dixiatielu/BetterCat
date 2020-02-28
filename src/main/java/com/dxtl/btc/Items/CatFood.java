package com.dxtl.btc.Items;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CatFood extends Item implements IHasModel {
    public CatFood(String name) {
        InitHelper.itemInit(this, name, CreativeTabs.FOOD);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }

}

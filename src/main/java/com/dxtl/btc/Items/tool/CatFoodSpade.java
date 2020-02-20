package com.dxtl.btc.Items.tool;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CatFoodSpade extends ItemSpade implements IHasModel {
    public CatFoodSpade(String name, ToolMaterial material) {
        super(material);
        InitHelper.itemInit(this, name, CreativeTabs.TOOLS);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}

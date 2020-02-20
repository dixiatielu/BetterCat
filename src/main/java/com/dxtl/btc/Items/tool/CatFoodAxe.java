package com.dxtl.btc.Items.tool;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CatFoodAxe extends ItemAxe implements IHasModel {
    public CatFoodAxe(String name, ToolMaterial material) {
        super(material, 6.4F, -3.5F);
        InitHelper.itemInit(this, name, CreativeTabs.TOOLS);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}

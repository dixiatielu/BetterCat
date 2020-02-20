package com.dxtl.btc.Items.tool;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class CatFoodHoe extends ItemHoe implements IHasModel {
    public CatFoodHoe(String name, ToolMaterial material) {
        super(material);
        InitHelper.itemInit(this, name, CreativeTabs.TOOLS);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}

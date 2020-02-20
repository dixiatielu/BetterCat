package com.dxtl.btc.Items.tool;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CatFoodSword extends ItemSword implements IHasModel {
    public CatFoodSword(String name, ToolMaterial material) {
        super(material);
        InitHelper.itemInit(this, name, CreativeTabs.COMBAT);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}

package com.dxtl.btc.Items.armor;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class CatFoodArmor extends ItemArmor implements IHasModel {
    public CatFoodArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        InitHelper.itemInit(this, name, CreativeTabs.COMBAT);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}

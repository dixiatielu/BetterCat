package com.dxtl.btc.Init;

import com.dxtl.btc.Items.CatFood;
import com.dxtl.btc.Items.armor.CatFoodArmor;
import com.dxtl.btc.Items.tool.*;
import com.dxtl.btc.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<>();
    //Materials
    public static final ArmorMaterial CATFOOD_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
            "catfood_material",
            Reference.MODID + ":catfood",
            14,
            new int[]{2, 4, 7, 3},
            20,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            1.5F
    );
    public static final ToolMaterial CATFOOD_TOOL_MATERIAL = EnumHelper.addToolMaterial(
            "catfood_tool_material",
            2,
            168,
            7.1F,
            1.5F,
            14
    );
    //Normal Items
    public static final CatFood CAT_FOOD = new CatFood("cat_food");
    //Armors
    public static final Item FISH_HELMET = new CatFoodArmor(
            "fish_helmet",
            CATFOOD_ARMOR_MATERIAL,
            1,
            EntityEquipmentSlot.HEAD
    );
    public static final Item FISH_CHESTPLATE = new CatFoodArmor(
            "fish_chestplate",
            CATFOOD_ARMOR_MATERIAL,
            1,
            EntityEquipmentSlot.CHEST
    );
    public static final Item FISH_LEGGINGS = new CatFoodArmor(
            "fish_leggings",
            CATFOOD_ARMOR_MATERIAL,
            2,
            EntityEquipmentSlot.LEGS
    );
    public static final Item FISH_BOOTS = new CatFoodArmor(
            "fish_boots",
            CATFOOD_ARMOR_MATERIAL,
            1,
            EntityEquipmentSlot.FEET
    );
    //Tools
    public static final ItemSword FISH_SWORD = new CatFoodSword(
            "fish_sword",
            CATFOOD_TOOL_MATERIAL
    );
    public static final ItemSpade FISH_SPADE = new CatFoodSpade(
            "fish_spade",
            CATFOOD_TOOL_MATERIAL
    );
    public static final ItemPickaxe FISH_PICKAXE = new CatFoodPickaxe(
            "fish_pickaxe",
            CATFOOD_TOOL_MATERIAL
    );
    public static final ItemHoe FISH_HOE = new CatFoodHoe(
            "fish_hoe",
            CATFOOD_TOOL_MATERIAL
    );
    public static final ItemAxe FISH_AXE = new CatFoodAxe(
            "fish_axe",
            CATFOOD_TOOL_MATERIAL
    );
    public static final ItemTool FISH_SPADEPICKAXE = new CatFoodSpadePickaxe(
            "fish_spadepickaxe",
            CATFOOD_TOOL_MATERIAL
    );
}

package com.dxtl.btc.Entities;

import com.dxtl.btc.util.InitHelper;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.World;

public class BetterCat extends EntityOcelot {
    public static final int entityID = 166;
    public BetterCat(World worldIn) {
        super(worldIn);
        InitHelper.entityInit("better_cat", BetterCat.class, entityID, 50, 13945671, 11044182);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    @Override
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {
        super.dropFewItems(wasRecentlyHit, lootingModifier);
    }
}

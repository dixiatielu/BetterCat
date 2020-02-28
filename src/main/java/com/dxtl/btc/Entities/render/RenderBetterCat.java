package com.dxtl.btc.Entities.render;

import com.dxtl.btc.Entities.BetterCat;
import com.dxtl.btc.Entities.model.ModelBetterCat;
import com.dxtl.btc.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBetterCat extends RenderLiving<BetterCat> {
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/bettercat.png");

    public RenderBetterCat(RenderManager manager) {
        super(manager, new ModelBetterCat(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(BetterCat entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(BetterCat entityLiving, float p_77043_2, float rotationYaw, float particalTicks) {
        super.applyRotations(entityLiving, p_77043_2, rotationYaw, particalTicks);
    }
}

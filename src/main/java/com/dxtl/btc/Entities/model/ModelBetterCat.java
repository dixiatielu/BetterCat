package com.dxtl.btc.Entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelOcelot - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelBetterCat extends ModelBase {
    public ModelRenderer tail1;
    public ModelRenderer main;
    public ModelRenderer nose;
    public ModelRenderer ear1;
    public ModelRenderer ear2;
    public ModelRenderer cat_body;
    public ModelRenderer leg3;
    public ModelRenderer leg1;
    public ModelRenderer tail2;
    public ModelRenderer leg4;
    public ModelRenderer leg2;

    public ModelBetterCat() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.ear2 = new ModelRenderer(this, 6, 10);
        this.ear2.setRotationPoint(0.0F, 15.0F, -9.0F);
        this.ear2.addBox(1.0F, -3.0F, 0.0F, 1, 1, 2, 0.0F);
        this.leg1 = new ModelRenderer(this, 40, 0);
        this.leg1.setRotationPoint(-1.2F, 13.8F, -5.0F);
        this.leg1.addBox(-1.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.tail2 = new ModelRenderer(this, 4, 15);
        this.tail2.setRotationPoint(0.0F, 20.0F, 14.0F);
        this.tail2.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(tail2, 1.7278759594743864F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 15);
        this.tail1.setRotationPoint(0.0F, 15.0F, 8.0F);
        this.tail1.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(tail1, 0.9000662952534757F, 0.0F, 0.0F);
        this.main = new ModelRenderer(this, 0, 0);
        this.main.setRotationPoint(0.0F, 15.0F, -9.0F);
        this.main.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 5, 0.0F);
        this.leg4 = new ModelRenderer(this, 8, 13);
        this.leg4.setRotationPoint(1.1F, 18.0F, 5.0F);
        this.leg4.addBox(-1.0F, 0.0F, 1.0F, 2, 6, 2, 0.0F);
        this.leg2 = new ModelRenderer(this, 40, 0);
        this.leg2.setRotationPoint(1.2F, 13.8F, -5.0F);
        this.leg2.addBox(-1.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.ear1 = new ModelRenderer(this, 0, 10);
        this.ear1.setRotationPoint(0.0F, 15.0F, -9.0F);
        this.ear1.addBox(-2.0F, -3.0F, 0.0F, 1, 1, 2, 0.0F);
        this.cat_body = new ModelRenderer(this, 20, 0);
        this.cat_body.setRotationPoint(0.0F, 12.0F, -10.0F);
        this.cat_body.addBox(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
        this.setRotateAngle(cat_body, 1.5707963267948966F, 0.0F, 0.0F);
        this.nose = new ModelRenderer(this, 0, 24);
        this.nose.setRotationPoint(0.0F, 15.0F, -9.0F);
        this.nose.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 2, 0.0F);
        this.leg3 = new ModelRenderer(this, 8, 13);
        this.leg3.setRotationPoint(-1.1F, 18.0F, 5.0F);
        this.leg3.addBox(-1.0F, 0.0F, 1.0F, 2, 6, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.ear2.render(f5);
        this.leg1.render(f5);
        this.tail2.render(f5);
        this.tail1.render(f5);
        this.main.render(f5);
        this.leg4.render(f5);
        this.leg2.render(f5);
        this.ear1.render(f5);
        this.cat_body.render(f5);
        this.nose.render(f5);
        this.leg3.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

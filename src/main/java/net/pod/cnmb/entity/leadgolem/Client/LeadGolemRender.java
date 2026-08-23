package net.pod.cnmb.entity.leadgolem.Client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pod.cnmb.NeedMoreBulletsMod;
import net.pod.cnmb.entity.leadgolem.LeadGolem;

public class LeadGolemRender extends MobRenderer<LeadGolem, LeadGolemModel<LeadGolem>> {
    public LeadGolemRender(EntityRendererProvider.Context context) {
        super(context, new LeadGolemModel<>(context.bakeLayer(LeadGolemModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(LeadGolem leadGolem) {
        return ResourceLocation.fromNamespaceAndPath(NeedMoreBulletsMod.MODID, "textures/entity/leadgolem/lead_golem.png");
    }

    @Override
    public void render(LeadGolem entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}

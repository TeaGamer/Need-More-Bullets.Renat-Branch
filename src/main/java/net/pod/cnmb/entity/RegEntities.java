package net.pod.cnmb.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pod.cnmb.NeedMoreBulletsMod;
import net.pod.cnmb.entity.leadgolem.LeadGolem;
import javax.swing.text.html.parser.Entity;
import java.util.function.Supplier;

public class RegEntities  {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, NeedMoreBulletsMod.MODID);

    public static final Supplier<EntityType<LeadGolem>> LEADGOLEM =
            ENTITY_TYPES.register("golem", () -> EntityType.Builder.of(LeadGolem::new, MobCategory.CREATURE)
                    .sized(0.5f,1.5f).build("golem"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}

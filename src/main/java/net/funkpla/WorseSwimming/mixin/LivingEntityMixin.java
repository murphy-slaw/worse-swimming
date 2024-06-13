package net.funkpla.WorseSwimming.mixin;

import net.funkpla.WorseSwimming.WorseConfig;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;


@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    private static WorseConfig CONFIG = new WorseConfig();

    public LivingEntityMixin(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @ModifyVariable(
            method = "travel(Lnet/minecraft/world/phys/Vec3;)V",
            at = @At(value = "STORE"),
            name = "f",
            ordinal = 1
    )
    private float addWaterFriction(float f) {
        if (this.isInWater()){
            if (this.isUnderWater()) {
                return f * ((float) (100 - CONFIG.UnderwaterFriction) /100);
            }
            return f * ((float)(100 - CONFIG.WadingFriction)/100);
        }
        return f;
    }
}

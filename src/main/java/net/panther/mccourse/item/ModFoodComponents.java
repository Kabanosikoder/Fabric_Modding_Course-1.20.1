package net.panther.mccourse.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION), 0.5f).build();
}

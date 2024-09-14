package net.panther.mccourse.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    // adds cauliflower consumable to the game
    public static FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(6).saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH), 0.6f).build();
}

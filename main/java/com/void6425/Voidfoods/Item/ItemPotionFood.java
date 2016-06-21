package com.void6425.Voidfoods.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemPotionFood extends ItemFood {
   
   public  ItemPotionFood(int amount, float saturation, boolean isWolfFood, String Potion) {
        super(amount, saturation, isWolfFood);
        setCreativeTab(CreativeTabs.FOOD);
       if(Potion == "speed"){
    	   addSpeedPotionEffect();
    	   
       }else{
    	   if(Potion == "fullbelly"){
    		   addStrengthPotionEffect();
    	   }else{
    		   if(Potion == "levitation"){
    			   addLevitationPotionEffect();
    		   }
    	   }
       }
   }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    public ItemPotionFood addSpeedPotionEffect() {
        Potion potion = Potion.getPotionFromResourceLocation("speed");
        setPotionEffect(new PotionEffect(potion, 1200, 1), 1f);
        setAlwaysEdible();

        return this;
    }
    
   
    public ItemPotionFood addStrengthPotionEffect() {
        Potion potion1 = Potion.getPotionFromResourceLocation("strength");
        setPotionEffect(new PotionEffect(potion1, 600, 0), 1f);
        setAlwaysEdible();

        return this;
    }
    
    public ItemPotionFood addLevitationPotionEffect() {
        Potion potion2 = Potion.getPotionFromResourceLocation("levitation");
        setPotionEffect(new PotionEffect(potion2, 1200, 0), 1f);
        setAlwaysEdible();

        return this;
    }
    
    
    
}

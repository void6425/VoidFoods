package com.void6425.Voidfoods.Crafting;

import com.void6425.Voidfoods.Item.VoidModFoods;
import com.void6425.Voidfoods.Item.VoidModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VoidModCrafting {

	
	public static void initCrafting()
	{
		GameRegistry.addShapedRecipe(new ItemStack(VoidModItems.mixing_bowl), new Object []{" S ", "I I", " I ", 'I', new ItemStack(Items.IRON_INGOT), 'S', new ItemStack(Items.STICK)});
        GameRegistry.addShapelessRecipe(new ItemStack(VoidModFoods.seperated_egg, 4), new ItemStack(Items.EGG));
		GameRegistry.addShapedRecipe(new ItemStack(VoidModFoods.egg_white), new Object []{"SS ", 'S', new ItemStack(VoidModFoods.seperated_egg)});
		GameRegistry.addShapedRecipe(new ItemStack(VoidModFoods.egg_yolk), new Object []{" S ", " S ", 'S', new ItemStack(VoidModFoods.seperated_egg)});
		GameRegistry.addShapedRecipe(new ItemStack(VoidModFoods.mayo), new Object []{"E  ", "B  ", 'E', new ItemStack(VoidModFoods.egg_yolk), 'B', new ItemStack(VoidModItems.mixing_bowl)});
	}
}

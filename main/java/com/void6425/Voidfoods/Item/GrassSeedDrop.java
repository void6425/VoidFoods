package com.void6425.Voidfoods.Item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;


public class GrassSeedDrop {

    public static void getSeedDrops() {

        if (VoidModFoods.garlicseedfromgrass) {
            MinecraftForge.addGrassSeed(new ItemStack(VoidModFoods.garlic_seeds, 1, 0), VoidModFoods.seedrarity);
        }

       
    }
}

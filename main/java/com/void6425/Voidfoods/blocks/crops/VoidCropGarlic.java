package com.void6425.Voidfoods.blocks.crops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.void6425.Voidfoods.Item.VoidModFoods;
import com.void6425.Voidfoods.blocks.VoidCropsParent;

import init.VoidBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class VoidCropGarlic extends VoidCropsParent {
//Unused class just here to make sure i have a copy
	public Item Seeds;
    public VoidCropGarlic(String UName, String Rname) {
        super();
        this.setUnlocalizedName(UName);
        this.setRegistryName(Rname);
        
        VoidBlocks.BLOCKS.add(this);
        
    }
// right here is where you tell it what seed to drop the rates are in the parent class
	 @Override
	    public Item getSeed(){
		 return  VoidModFoods.garlic_seeds;
	    }
	// this is there you put in what item the crop drops again the rates are in the parent class
    @Override
    protected Item getCrop() {
        return VoidModFoods.garlic;
    }

   
    
    
}

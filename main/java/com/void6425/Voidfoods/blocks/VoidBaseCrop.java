package com.void6425.Voidfoods.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.void6425.Voidfoods.Item.VoidModFoods;

import init.VoidBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class VoidBaseCrop extends VoidCropsParent {
    //Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	//Unused class just here to make sure i have a copy
	
	public Item Seeds;
    public VoidBaseCrop(String UName, String Rname) {
        super();
        this.setUnlocalizedName(UName);
        this.setRegistryName(Rname);
        
        VoidBlocks.BLOCKS.add(this);
        
    }

	 @Override
	    public Item getSeed(){
		 return  VoidModFoods.test_seed;
	    }
	
    @Override
    protected Item getCrop() {
        return VoidModFoods.test_seed;
    }

   
    
    
}

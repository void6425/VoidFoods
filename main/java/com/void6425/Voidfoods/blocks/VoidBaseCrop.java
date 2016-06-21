package com.void6425.Voidfoods.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import init.VoidBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class VoidBaseCrop extends VoidCropsParent {

	public static Item Seeds;
    public VoidBaseCrop(String UName, String Rname,  Item seeds) {
        super();
        this.setUnlocalizedName(UName);
        this.setRegistryName(Rname);
        Seeds = seeds;
        VoidBlocks.BLOCKS.add(this);
        
    }
   
    
    @Override
    protected Item getCrop() {
        return Items.ENDER_PEARL;
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> drops = new ArrayList<ItemStack>();

        int age = state.getValue(AGE);
        Random rand = ((World) world).rand;

        int pearls = 0;
        int seeds = 1;

        if (age == 7) {
            //10% chance to get an extra seed
            if (rand.nextInt(10) == 9) {
                seeds++;
            }

            //10% chance to get a second pearl
            if (rand.nextInt(10) > 0)
                pearls = 1;
            else
                pearls = 2;
        }

        drops.add(new ItemStack(this.getSeed(), seeds, 0));
        drops.add(new ItemStack(this.getCrop(), pearls, 0));
        return drops;
    }
    
    
    
}

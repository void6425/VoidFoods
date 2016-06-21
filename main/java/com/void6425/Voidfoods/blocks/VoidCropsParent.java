package com.void6425.Voidfoods.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.void6425.Voidfoods.Item.VoidModFoods;

import init.VoidBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



	public class VoidCropsParent extends BlockCrops {
		
		
		
		public boolean isOpaqueCube()
	    {
	        return false;
	    }
	  	
	  	public boolean isFullCube()
	    {
	        return false;
	    }

	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	    }

	    public int getMetaFromState(IBlockState state)
	    {
	        return ((Integer)state.getValue(AGE)).intValue();
	    }

	    @Override
	    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
	        return true;
	    }


	    @Override
	    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
	        return state.getValue(AGE) < 7 || worldIn.getLightFromNeighbors(pos.up()) <= 7;
	    }

	    @Override
	    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
	        Block soil = worldIn.getBlockState(pos.down()).getBlock();
	        return soil.equals(Blocks.FARMLAND);
	    }

	    @Override
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
	        float baseChance =25.0F;

	        if (worldIn.getLightFromNeighbors(pos.up()) <= 7) {
	            if (state.getValue(AGE) < 7) {
	                if (rand.nextInt((int) (baseChance / getGrowthChance(this, worldIn, pos)) + 1) == 0) {
	                    worldIn.setBlockState(pos, state.withProperty(AGE, state.getValue(AGE) + 1), 2);
	                }
	            }
	        }
	    }
	    @Override
	    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
	        List<ItemStack> drops = new ArrayList<ItemStack>();

	        int age = state.getValue(AGE);
	        Random rand = ((World) world).rand;

	        int drop = 0;
	        int seeds = 1;

	        if (age == 7) {
	            //10% chance to get an extra seed
	            if (rand.nextInt(10) == 9) {
	                seeds++;
	            }

	            //10% chance to get a second pearl
	            if (rand.nextInt(10) > 0)
	                drop = 1;
	            else
	                drop = 2;
	        }

	        drops.add(new ItemStack(this.getSeed(), seeds, 0));
	        drops.add(new ItemStack(this.getCrop(), drop, 0));
	        return drops;
	    }
	    

	    
	    

	}


package com.void6425.Voidfoods.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.void6425.Voidfoods.Item.VoidModFoods;

import init.VoidBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
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
//This is the parent class for my crops
import net.minecraftforge.common.IPlantable;
//Thanks to MatrexsVigil of pams harvestcraft. Your code was a huge inspiration 

	public class VoidCropsParent extends BlockCrops implements IGrowable, IPlantable {
		
		public Item Seeds;
	    public VoidCropsParent(String UName, String Rname) {
	        super();
	        this.setUnlocalizedName(UName);
	        this.setRegistryName(Rname);
	        VoidBlocks.BLOCKS.add(this);
	        
	    }
	
		 @Override
		    public Item getSeed(){
			 Item item = VoidModFoods.seedsMap.get(this);
			 return  item;
		    }
		
	    @Override
	    protected Item getCrop() {
				 Item item = VoidModFoods.dropsMap.get(this);
				 return  item;
			    }
	    

		//from here
		public boolean isOpaqueCube()
	    {
	        return false;
	    }
	  	
	  	public boolean isFullCube()
	    {
	        return false;
	    } 
	  	//to here im not sure if this is needed but ehh

	   
	  	
	  	public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	    }

	   
	    public int getMetaFromState(IBlockState state)
	    {
	        return ((Integer)state.getValue(AGE)).intValue();
	    }
     
	    //self explanatory
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
	    
	    public boolean isHarvestReady(IBlockState state) {
	        return state.getValue(AGE) >= getHarvestReadyAge();
	    }
	    

	    public int getHarvestReadyAge() {
	        return 7;
	    }
	    
	    @Override
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
	        this.checkAndDropBlock(worldIn, pos, state);

	        if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {
	            int i = this.getMetaFromState(state);

	            if (i < this.getHarvestReadyAge()) {
	                float f = getGrowthChance(this, worldIn, pos);

	                if (rand.nextInt((int) (.0F / f) + 1) == 0) {
	                    worldIn.setBlockState(pos, this.getStateFromMeta(i + 1), 2);
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


package com.void6425.Voidfoods.Item;

import java.util.HashMap;

import com.void6425.Voidfoods.Resources;
import com.void6425.Voidfoods.blocks.VoidCropsParent;

import init.VoidBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class VoidModFoods {
	
	
	public static HashMap<VoidCropsParent, Item> seedsMap = new HashMap<VoidCropsParent, Item>();	
	public static Item test_seed;
	public static Item egg_white;
	public static Item egg_yolk;
    public static Item seperated_egg;
    public static Item mayo;
   
    public static Item LevitationStew;
   
    public static Item garlic;
    public static Item green_onion;
    public static Item onion;
    public static Item shallots;
    
   
    public static Item tomato;
    
    public static Item red_bell_pepper;
    public static Item green_bell_pepper;
    public static Item yellow_bell_Pepper;
    public static Item diced_yellow_bell_Pepper;
    public static Item diced_red_bell_Pepper;
    public static Item diced_green_bell_Pepper;
    public static Item sliced_yellow_bell_Pepper;
    public static Item sliced_red_bell_Pepper;
    public static Item sliced_green_bell_Pepper;
    
    public static Item cucumber;
    public static Item cucumber_slices;
    public static Item diced_cucumber;
    
    public static Item squash;
    public static Item diced_squash;
    
    
    public static Item chili_pepper;
    public static Item diced_chili_pepper;
    
    
   
    public static Item corn_on_the_cob;
    public static Item corn;
    public static Item corn_off_the_cob;
    //that even a thing?
    
    public static Item diced_carrots;
    public static Item diced_potatoes;
    public static Item sliced_potatoes;
    
    
    public static Item uncooked_fries;
	
    
    public static Item blueberry;
    public static Item rasphberry;
    public static Item blackberry;
    
    
	
	
	
	public static void init()
	{
	   
	 test_seed = registerSeeds("test_seed", VoidBlocks.test_crop, true);
	   
	  
	}
	private static Item registerItem(Item item, String registryName) {
        item.setCreativeTab(CreativeTabs.FOOD);
        item.setRegistryName(registryName);
        item.setUnlocalizedName(registryName);

        return GameRegistry.register(item);
    }
	
	

    public static Item registerSeeds(String registryName, Block crop, boolean isseed) {
        Item item = new ItemSeeds(crop, Blocks.FARMLAND);
        return registerItem(item, registryName);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void regiseterRenders()
	{
    registerRender(egg_white);
    registerRender(egg_yolk);
    registerRender(mayo);
    registerRender(seperated_egg);
    registerRender(LevitationStew);
    registerRender(test_seed);
    
	}
   public static void registerRender(Item item)
   {
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new 
			ModelResourceLocation(Resources.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Item registerItem(Item item, String name, CreativeTabs tab)
	{
		 GameRegistry.register(item, new ResourceLocation(Resources.MODID, name));
		return item;
	}
	
	//Register item End\\
	
}
	
	
	
	
	
	
	
	
	
	
	

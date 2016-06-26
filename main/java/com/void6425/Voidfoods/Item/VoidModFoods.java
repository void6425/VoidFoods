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
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class VoidModFoods {
	
	
	
	public static HashMap<VoidCropsParent, Item> seedsMap = new HashMap<VoidCropsParent, Item>();	
	public static HashMap<VoidCropsParent, Item> dropsMap = new HashMap<VoidCropsParent, Item>();	
	
	public static Item test_seed;
	
    public static Item garlic;
    public static Item garlic_seeds;
    public static Item green_onion;
    public static Item green_onion_seed;
    public static Item onion;
    public static Item onion_seed;
    public static Item shallots;
    public static Item shallots_seed;
    public static Item tomato;
    public static Item tomato_seed;
    public static Item red_bell_pepper;
    public static Item red_bell_pepper_seed;
    public static Item green_bell_pepper;
    public static Item green_bell_pepper_seed;
    public static Item yellow_bell_pepper;
    public static Item yellow_bell_pepper_seed;
    public static Item corn;
    public static Item corn_seed;
    public static Item cucumber;
    public static Item cucumber_seed;
    public static Item squash;
    public static Item squash_seed;
    public static Item chili;
    public static Item chili_seed;
    public static Item blueberry;
    public static Item blueberry_seed;
    public static Item rasphberry;
    public static Item rasphberry_seed;
    public static Item blackberry;
    public static Item blackberry_seed;
    public static Item asparagus;
    public static Item asparagus_seed;
    public static Item rice;
    public static Item rice_seed;
    public static Item soy_bean;
    public static Item soy_bean_seed;
    public static Item barley;
    public static Item barley_seed;
    public static Item oats;
    public static Item oats_seed;
    public static Item rye;
    public static Item rye_seed;
    public static Item sweet_potato;
    public static Item sweet_potato_seed;
    public static Item peanut;
    public static Item peanut_seed;
    public static Item broccoli;
    public static Item broccoli_seed;
    public static Item lettuce;
    public static Item lettuce_seed;
    public static Item celery;
    public static Item celery_seed;
    public static Item cabbage;
    public static Item cabbage_seed;
    public static Item green_bean;
    public static Item green_bean_seed;
    
    
    
    public static Item diced_yellow_bell_Pepper;
    public static Item diced_red_bell_Pepper;
    public static Item diced_green_bell_Pepper;
    public static Item sliced_yellow_bell_Pepper;
    public static Item sliced_red_bell_Pepper;
    public static Item sliced_green_bell_Pepper;
    public static Item cucumber_slices;
    public static Item diced_cucumber;
    public static Item diced_squash;
    public static Item diced_chili;
    public static Item corn_off_the_cob;
    //that even a thing?
    public static Item diced_carrots;
    public static Item diced_potatoes;
    public static Item sliced_potatoes;
    public static Item uncooked_fries;
	//Configs
    public static boolean garlicseedfromgrass;
    public static boolean greenonionfromgrass;
    public static boolean onionseedfromgrass;
    public static boolean shallotseedfromgrass;
    public static boolean tomatoseedfromgrass;
    public static boolean greenbellpepperseedfromgrass;
    public static boolean redbellpepperseedfromgrass;
    public static boolean yellowbellpepperfromgrass; 
    public static boolean cornseedfromgrass;
    public static boolean cucumberseedfromgrass;
    public static boolean squashseedfromgrass;
    public static boolean chiliseedfromgrass;
    public static boolean blueberryseedfromgrass;
    public static boolean rasphberryseedfromgrass;
    public static boolean blackberryseedfromgrass;
    public static boolean asparagusseedfromgrass;
    public static boolean riceseedfromgrass;
    public static boolean soyseedfromgrass;
    public static boolean barleyseedfromgrass;
    public static boolean ryeseedfromgrass;
    public static boolean sweetpotatoseedfromgrass;
    public static boolean peanutseedfromgrass;
    public static boolean broccoliseedfromgrass;
    public static boolean lettuceseedfromgrass;
    public static boolean celeryseedfromgrass;
    public static boolean cabbageseedfromgrass;
    public static boolean greenbeanseedfromgrass;
    
    
    public static int seedrarity;
	
	
	
	public static void init()
	{
	   //base_seeds = registerSeeds("base_seeds", VoidBlocks.base_crop, true);
	 test_seed = registerSeeds("test_seed", VoidBlocks.test_crop, true);
	
	 
	 
	 
	 //crop drops
	 garlic = registerCropDrop("garlic", VoidBlocks.crop_garlic, true, false);
	 green_onion = registerCropDrop("green_onion", VoidBlocks.green_onion_crop, true, false);
	 onion = registerCropDrop("onion", VoidBlocks.onion_crop, true, false);
	 shallots = registerCropDrop("shallots", VoidBlocks.shallots_crop, true, false);
	 tomato = registerCropDrop("tomato", VoidBlocks.tomato_crop, true, false);
	 green_bell_pepper = registerCropDrop("green_bell_pepper", VoidBlocks.green_bell_pepper_crop, true, false);
	 yellow_bell_pepper = registerCropDrop("yellow_bell_pepper", VoidBlocks.yellow_bell_pepper_crop, true, false);
	 red_bell_pepper = registerCropDrop("red_bell_pepper", VoidBlocks.red_bell_pepper_crop, true, false);
	 corn = registerCropDrop("corn", VoidBlocks.corn_crop, true, false);
	 cucumber = registerCropDrop("cucumber", VoidBlocks.cucumber_crop, true, false);
	 squash = registerCropDrop("squash", VoidBlocks.squash_crop, true, false);
	 chili = registerCropDrop("chili", VoidBlocks.chili_crop, true, false);
	 blueberry = registerCropDrop("blueberry", VoidBlocks.blueberry_crop, true, false);
	 rasphberry = registerCropDrop("rasphberry", VoidBlocks.rasphberry_crop, true, false);
	 blackberry = registerCropDrop("blackberry", VoidBlocks.blackberry_crop, true, false);
	 asparagus = registerCropDrop("asparagus", VoidBlocks.asparagus_crop, true, false);
	 soy_bean = registerCropDrop("soy_bean", VoidBlocks.soy_bean_crop, true, false);
	 barley = registerCropDrop("barley", VoidBlocks.barley_crop, true, false);
	 rye = registerCropDrop("rye", VoidBlocks.rye_crop, true, false);
	 sweet_potato = registerCropDrop("sweet_potato", VoidBlocks.sweet_potato_crop, true, false);
	 peanut = registerCropDrop("peanut", VoidBlocks.peanut_crop, true, false);
	 broccoli = registerCropDrop("broccoli", VoidBlocks.broccoli_crop, true, false);
	 lettuce = registerCropDrop("lettuce", VoidBlocks.lettuce_crop, true, false);
	 celery = registerCropDrop("celery", VoidBlocks.celery_crop, true, false);
	 cabbage = registerCropDrop("cabbage", VoidBlocks.cabbage_crop, true, false);
	 green_bean = registerCropDrop("green_bean", VoidBlocks.green_bean_crop, true, false);
	 
	 
	 
	 
	 
	 
	 //seeds
	 garlic_seeds = registerSeeds("garlic_seeds", VoidBlocks.crop_garlic, true);
	 green_onion_seed = registerSeeds("green_onion_seed", VoidBlocks.green_onion_crop, true);
	 onion_seed = registerSeeds("onion_seed", VoidBlocks.onion_crop, true);
	 shallots_seed = registerSeeds("shallots_seed", VoidBlocks.shallots_crop, true);
	 tomato_seed = registerSeeds("tomato_seed", VoidBlocks.tomato_crop, true);
	 green_bell_pepper_seed = registerSeeds("green_bell_pepper_seed", VoidBlocks.green_bell_pepper_crop, true);
	 yellow_bell_pepper_seed = registerSeeds("yellow_bell_pepper_seed", VoidBlocks.yellow_bell_pepper_crop, true);
	 red_bell_pepper_seed = registerSeeds("red_bell_pepper_seed", VoidBlocks.red_bell_pepper_crop, true);
	 corn_seed = registerSeeds("corn_seed", VoidBlocks.corn_crop, true);
	 cucumber_seed = registerSeeds("cucumber_seed", VoidBlocks.cucumber_crop, true);
	 squash_seed = registerSeeds("squash_seed", VoidBlocks.squash_crop, true);
	 chili_seed = registerSeeds("chili_seed", VoidBlocks.chili_crop, true);
	 blueberry_seed = registerSeeds("blueberry_seed", VoidBlocks.blueberry_crop, true);
	 rasphberry_seed = registerSeeds("rasphberry_seed", VoidBlocks.rasphberry_crop, true);
	 blackberry_seed = registerSeeds("blackberry_seed", VoidBlocks.blackberry_crop, true);
	 asparagus_seed = registerSeeds("asparagus_seed", VoidBlocks.asparagus_crop, true);
	 soy_bean_seed = registerSeeds("soy_bean_seed", VoidBlocks.soy_bean_crop, true);
	 barley_seed = registerSeeds("barley_seed", VoidBlocks.barley_crop, true);
	 rye_seed = registerSeeds("rye_seed", VoidBlocks.rye_crop, true);
	 sweet_potato_seed = registerSeeds("sweet_potato_seed", VoidBlocks.sweet_potato_crop, true);
	 peanut_seed = registerSeeds("peanut_seed", VoidBlocks.peanut_crop, true);
	 broccoli_seed = registerSeeds("broccoli_seed", VoidBlocks.broccoli_crop, true);
	 lettuce_seed = registerSeeds("lettuce_seed", VoidBlocks.lettuce_crop, true);
	 celery_seed = registerSeeds("celery_seed", VoidBlocks.celery_crop, true);
	 cabbage_seed = registerSeeds("cabbage_seed", VoidBlocks.cabbage_crop, true);
	 green_bean_seed = registerSeeds("green_bean_seed", VoidBlocks.green_bean_crop, true);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	}
	public static void initItems(Configuration config) {
   
        
       seedrarity = config.get("seeds", "seedrarity", 1).getInt();
        

       garlicseedfromgrass = config.get("seeds", "garlicseedfromgrass", true).getBoolean(true);
       greenonionfromgrass = config.get("seeds", "greenonionfromgrass", true).getBoolean(true);
       onionseedfromgrass = config.get("seeds", "onionseedfromgrass", true).getBoolean(true);
       shallotseedfromgrass = config.get("seeds", "shallotseedfromgrass", true).getBoolean(true);
       tomatoseedfromgrass = config.get("seeds", "tomatoseedfromgrass", true).getBoolean(true);
       greenbellpepperseedfromgrass = config.get("seeds", "greenbellpepperseedfromgrass", true).getBoolean(true);
       redbellpepperseedfromgrass = config.get("seeds", "redbellpepperseedfromgrass", true).getBoolean(true);
       yellowbellpepperfromgrass = config.get("seeds", "yellowbellpepperfromgrass", true).getBoolean(true);
       cornseedfromgrass = config.get("seeds", "cornseedfromgrass", true).getBoolean(true);
       cucumberseedfromgrass = config.get("seeds", "cucumberseedfromgrass", true).getBoolean(true);
       squashseedfromgrass = config.get("seeds", "squashseedfromgrass", true).getBoolean(true);
       chiliseedfromgrass = config.get("seeds", "chiliseedfromgrass", true).getBoolean(true);
       blueberryseedfromgrass = config.get("seeds", "blueberryseedfromgrass", true).getBoolean(true);
       rasphberryseedfromgrass = config.get("seeds", "rasphberryseedfromgrass", true).getBoolean(true);
       blackberryseedfromgrass = config.get("seeds", "blackberryseedfromgrass", true).getBoolean(true);
       asparagusseedfromgrass = config.get("seeds", "asparagusseedfromgrass", true).getBoolean(true);
       riceseedfromgrass = config.get("seeds", "riceseedfromgrass", true).getBoolean(true);
       soyseedfromgrass = config.get("seeds", "soyseedfromgrass", true).getBoolean(true);
       barleyseedfromgrass = config.get("seeds", "barleyseedfromgrass", true).getBoolean(true);
       ryeseedfromgrass = config.get("seeds", "ryeseedfromgrass", true).getBoolean(true);
       sweetpotatoseedfromgrass = config.get("seeds", "sweetpotatoseedfromgrass", true).getBoolean(true);
       peanutseedfromgrass = config.get("seeds", "peanutseedfromgrass", true).getBoolean(true);
       broccoliseedfromgrass = config.get("seeds", "broccoliseedfromgrass", true).getBoolean(true);
       lettuceseedfromgrass = config.get("seeds", "lettuceseedfromgrass", true).getBoolean(true);
       celeryseedfromgrass = config.get("seeds", "celeryseedfromgrass", true).getBoolean(true);
       cabbageseedfromgrass = config.get("seeds", "cabbageseedfromgrass", true).getBoolean(true);
       greenbeanseedfromgrass = config.get("seeds", "greenbeanseedfromgrass", true).getBoolean(true);
        
    }
	
	
	
	
	public static void regiseterRenders()
	{
    initModels(garlic);
    initModels(garlic_seeds);
    initModels(green_onion_seed);
    initModels(green_onion);
    initModels(onion);
    initModels(onion_seed);
    initModels(shallots);
    initModels(shallots_seed);
    initModels(tomato);
    initModels(tomato_seed);
    initModels(red_bell_pepper);
    initModels(red_bell_pepper_seed);
    initModels(yellow_bell_pepper);
    initModels(yellow_bell_pepper_seed);
    initModels(green_bell_pepper);
    initModels(green_bell_pepper_seed);
    initModels(corn);
    initModels(corn_seed);
    initModels(cucumber);
    initModels(cucumber_seed);
    initModels(chili);
    initModels(chili_seed);
    initModels(blueberry);
    initModels(blueberry_seed);
    initModels(rasphberry);
    initModels(rasphberry_seed);
    initModels(blackberry);
    initModels(blackberry_seed);
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
	
	@SideOnly(Side.CLIENT)
    public static void initModels(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString()));
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	private static Item registerPotionFood(Item item, String reigstryName, int amount, float saturation, boolean isWolfFood, String Potion){
		Item item1 = new ItemPotionFood( amount,  saturation,  isWolfFood, Potion);
		item1.setCreativeTab(CreativeTabs.FOOD);
        item1.setRegistryName(reigstryName);
        item1.setUnlocalizedName(reigstryName);
		return GameRegistry.register(item1);
	}
	
	
	private static Item registerItemFood(Item item1, String registryName, int amount, float sat, boolean isWolfFood) {
        Item item11 = new ItemFood(amount, sat, isWolfFood);
		item11.setCreativeTab(CreativeTabs.FOOD);
        item11.setRegistryName(registryName);
        item11.setUnlocalizedName(registryName);

        return GameRegistry.register(item11);
    }
	
	public static Item registerCropDrop(String registryName, Block crop, boolean isdrop, boolean isWolfFood){
		Item item = new ItemFood( 1, 0f, isWolfFood);
		if(isdrop){
	    	   dropsMap.put((VoidCropsParent) crop, item);
	       }
		 return registerItem(item, registryName);
	}
	
	
	
	
	  public static Item registerGenericItem(String registryName) {
	        final Item item = new Item();
      
	        return registerItem(item, registryName);
	    }
	
	private static Item registerItem(Item item, String registryName) {
        item.setCreativeTab(CreativeTabs.FOOD);
        item.setRegistryName(registryName);
        item.setUnlocalizedName(registryName);

        return GameRegistry.register(item);
    }
	
	// i dont know how you register items but make sure to register your seeds as ItemSeeds and that takes the farmland and the block that the crop is
    public static Item registerSeeds(String registryName, Block crop, boolean isseed) {
        Item item = new ItemSeeds(crop, Blocks.FARMLAND);
        seedsMap.put((VoidCropsParent) crop, item);  
        return registerItem(item, registryName);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
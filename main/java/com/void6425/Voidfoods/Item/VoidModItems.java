package com.void6425.Voidfoods.Item;

import com.void6425.Voidfoods.Resources;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class VoidModItems {
	public static Item void_ingot;
	public static Item mixing_bowl;
	
	
	public static void init()
	{
	   
	   void_ingot = registerItem(new Item(), "void_ingot").setUnlocalizedName("void_ingot").setCreativeTab(CreativeTabs.MATERIALS);
	   mixing_bowl = registerItem(new Item(), "mixing_bowl").setUnlocalizedName("mixing_bowl").setCreativeTab(CreativeTabs.TOOLS);
	   
	}
	
	
	public static void regiseterRenders()
	{
	registerRender(void_ingot);
	registerRender(mixing_bowl);
    
	}
   public static void registerRender(Item item)
   {
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new 
			ModelResourceLocation(Resources.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	//registerItem Start\\
	public static Item registerItem(Item item, String name)
	{
		return registerItem(item, name, null);
	}
	public static Item registerItem(Item item, String name, CreativeTabs tab)
	{
		 GameRegistry.register(item, new ResourceLocation(Resources.MODID, name));
		return item;
	}
	
	//Register item End\\
	
}
	
	
	
	
	
	
	
	
	
	
	

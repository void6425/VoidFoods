package com.void6425.Voidfoods.proxy;

import com.void6425.Voidfoods.Crafting.VoidModCrafting;
import com.void6425.Voidfoods.Item.VoidModFoods;
import com.void6425.Voidfoods.Item.VoidModItems;

import init.VoidBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) 
    {
    	
        VoidModFoods.init();
        VoidModItems.init();
        VoidModCrafting.initCrafting();
        VoidBlocks.register(); 
    }

    public void init(FMLInitializationEvent e) 
    { 
    	
    
    	
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
   
  
}

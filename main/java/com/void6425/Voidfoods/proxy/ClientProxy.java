package com.void6425.Voidfoods.proxy;

import com.void6425.Voidfoods.Resources;

import init.VoidBlocks;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        VoidBlocks.initModels();
    //	VoidModFoods.init();
        
  
     
       
     OBJLoader.INSTANCE.addDomain(Resources.MODID);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
     
      
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
   
    
    
  
}


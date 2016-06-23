package com.void6425.Voidfoods.proxy;

import com.void6425.Voidfoods.Resources;
import com.void6425.Voidfoods.Item.VoidModFoods;

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
        VoidModFoods.regiseterRenders();
    
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


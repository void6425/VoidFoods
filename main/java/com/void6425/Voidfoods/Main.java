package com.void6425.Voidfoods;

import com.void6425.Voidfoods.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = Resources.MODID,name = Resources.NAME,version = Resources.VERSION)

public class Main {
    //public GuiHandler guiHandler = new GuiHandler();
	
	
	
	
	@SidedProxy(clientSide= Resources.ClientProxy, serverSide= Resources.CommonProxy)
	public static CommonProxy proxy;
	
    
    @Instance   
	public static Main instance = new Main();
	
	
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
		proxy.preInit(e);  
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
        proxy.postInit(e);
    }

}       

package com.void6425.Voidfoods;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.void6425.Voidfoods.Item.VoidModFoods;

public class Configs {
    public static final Configs instance = new Configs();

    
    public static final String CATEGORY_SEEDS = "seeds";
    
    private Map<String, String[]> dropConfig = new HashMap<String, String[]>();

    public void load(FMLPreInitializationEvent event) {
        final Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        //BlockRegistry.initBlockConfig(config);
        VoidModFoods.initItems(config);

        

        if (config.hasChanged()) {
            config.save();
        }
    }

    /**
     * Configures drops from the various gardens; this needs to happen after the item registries are updated
     */
    
    }

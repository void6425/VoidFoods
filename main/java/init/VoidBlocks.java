package init;

import java.util.ArrayList;
import java.util.List;

import com.void6425.Voidfoods.blocks.VoidCropsParent;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class VoidBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();
    //like this
    
  
    //This is how i register my blocks i recommend it as it is clean
    public static final VoidCropsParent test_crop = new VoidCropsParent("test_crop", "test_crop");
    public static final VoidCropsParent crop_garlic = new VoidCropsParent("garlic_crop","garlic_crop");
    public static final VoidCropsParent green_onion_crop = new VoidCropsParent("green_onion_crop", "green_onion_crop");
    public static final VoidCropsParent onion_crop = new VoidCropsParent("onion_crop", "onion_crop");
    public static final VoidCropsParent shallots_crop = new VoidCropsParent("shallots_crop", "shallots_crop");
    public static final VoidCropsParent tomato_crop = new VoidCropsParent("tomato_crop", "tomato_crop");
    public static final VoidCropsParent green_bell_pepper_crop = new VoidCropsParent("green_bell_pepper_crop", "green_bell_pepper_crop");
    public static final VoidCropsParent yellow_bell_pepper_crop = new VoidCropsParent("yellow_bell_pepper_crop", "yellow_bell_pepper_crop");
    public static final VoidCropsParent red_bell_pepper_crop = new VoidCropsParent("red_bell_pepper_crop", "red_bell_pepper_crop");
    public static final VoidCropsParent corn_crop = new VoidCropsParent("corn_crop", "corn_crop");
    public static final VoidCropsParent cucumber_crop = new VoidCropsParent("cucumber_crop", "cucumber_crop");
    public static final VoidCropsParent squash_crop = new VoidCropsParent("squash_crop", "squash_crop");
    public static final VoidCropsParent chili_crop = new VoidCropsParent("chili_crop", "chili_crop");
    public static final VoidCropsParent blueberry_crop = new VoidCropsParent("blueberry_crop", "blueberry_crop");
    public static final VoidCropsParent rasphberry_crop = new VoidCropsParent("rasphberry_crop", "rasphberry_crop");
    public static final VoidCropsParent blackberry_crop = new VoidCropsParent("blackberry_crop", "blackberry_crop");
    public static final VoidCropsParent asparagus_crop = new VoidCropsParent("asparagus_crop", "asparagus_crop");
    public static final VoidCropsParent soy_bean_crop = new VoidCropsParent("soy_bean_crop", "soy_bean_crop");
    public static final VoidCropsParent barley_crop = new VoidCropsParent("barley_crop", "barley_crop");
    public static final VoidCropsParent rye_crop = new VoidCropsParent("rye_crop", "rye_crop");
    public static final VoidCropsParent sweet_potato_crop = new VoidCropsParent("sweet_potato_crop", "sweet_potato_crop");
    public static final VoidCropsParent peanut_crop = new VoidCropsParent("peanut_crop", "peanut_crop");
    public static final VoidCropsParent broccoli_crop = new VoidCropsParent("broccoli_crop", "broccoli_crop");
    public static final VoidCropsParent lettuce_crop = new VoidCropsParent("lettuce_crop", "lettuce_crop");
    public static final VoidCropsParent celery_crop = new VoidCropsParent("celery_crop", "celery_crop");
    public static final VoidCropsParent cabbage_crop = new VoidCropsParent("cabbage_crop", "cabbage_crop");
    public static final VoidCropsParent green_bean_crop = new VoidCropsParent("green_bean_crop", "green_bean_crop");
    
    
    
    
    
    
    
    
    
   public static void register(){
        for (Block block : BLOCKS) {
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
            (block).setCreativeTab(CreativeTabs.FOOD);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        for (Block block : BLOCKS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName().toString()));
        }
    }
}
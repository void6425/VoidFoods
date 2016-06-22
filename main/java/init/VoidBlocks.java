package init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

import com.void6425.Voidfoods.Item.VoidModFoods;
import com.void6425.Voidfoods.blocks.VoidBaseCrop;
import com.void6425.Voidfoods.blocks.VoidCropsParent;
import com.void6425.Voidfoods.blocks.crops.VoidCropGarlic;


public class VoidBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();
    //like this
    
  
    //This is how i register my blocks i recommend it as it is clean
    public static final VoidBaseCrop test_crop = new VoidBaseCrop("test_crop", "test_crop");
    public static final VoidCropGarlic crop_garlic = new VoidCropGarlic("garlic_crop","garlic_crop");
   
   
   
   
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
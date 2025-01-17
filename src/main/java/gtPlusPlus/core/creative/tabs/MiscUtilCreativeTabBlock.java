package gtPlusPlus.core.creative.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MiscUtilCreativeTabBlock extends CreativeTabs {

    public MiscUtilCreativeTabBlock(final String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.bedrock);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int func_151243_f() {
        return 0;
    }
}

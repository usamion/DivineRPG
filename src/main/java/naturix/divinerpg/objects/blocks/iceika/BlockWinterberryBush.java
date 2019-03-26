package naturix.divinerpg.objects.blocks.iceika;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import naturix.divinerpg.objects.blocks.BlockMod;
import naturix.divinerpg.registry.ModBlocks;
import naturix.divinerpg.registry.ModItems;
import naturix.divinerpg.utils.material.EnumBlockType;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWinterberryBush extends BlockMod implements IShearable {

    protected String stateChangeName;
    public boolean isGrown;

    World w;

    public BlockWinterberryBush(boolean grown, String name) {
        super(EnumBlockType.LEAVES, name, 0.2F);
        this.isGrown = grown;
        setTickRandomly(true);
        this.setLightOpacity(1);
        this.setSoundType(SoundType.PLANT);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (this == ModBlocks.ripeWinterberryBush) {
            return ModItems.winterberry;
        }
        return null;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public boolean causesSuffocation(IBlockState state) {
        return false;
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
        return true;
    }

    @Override
    public void onBlockDestroyedByPlayer(World w, BlockPos pos, IBlockState state) {
        if (isGrown) {
            w.setBlockState(pos, ModBlocks.winterberryBush.getDefaultState());
        }
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        if (this == ModBlocks.winterberryBush) {
            ret.add(new ItemStack(this, 1));
        }
        return ret;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public void updateTick(World w, BlockPos pos, IBlockState state, Random r) {
        if (r.nextInt(2) == 0 && w.getBlockState(pos) == ModBlocks.winterberryBush) {
            w.setBlockState(pos, ModBlocks.ripeWinterberryBush.getDefaultState());
        }
    }
}
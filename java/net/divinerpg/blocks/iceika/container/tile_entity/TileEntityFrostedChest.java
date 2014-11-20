package net.divinerpg.blocks.iceika.container.tile_entity;

import net.divinerpg.blocks.iceika.BlockFrostedChest;
import net.minecraft.tileentity.TileEntityChest;

public class TileEntityFrostedChest extends TileEntityChest {
	
	@Override
	public void closeInventory()
    {
        if (this.getBlockType() instanceof BlockFrostedChest)
        {
            --this.numPlayersUsing;
            this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType(), 1, this.numPlayersUsing);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType());
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType());
        }
    }

}
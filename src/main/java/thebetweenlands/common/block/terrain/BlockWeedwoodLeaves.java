package thebetweenlands.common.block.terrain;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import thebetweenlands.common.block.ITintedBlock;
import thebetweenlands.common.registries.BlockRegistry;

public class BlockWeedwoodLeaves extends BlockLeavesBetweenlands implements ITintedBlock {
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockRegistry.SAPLING_WEEDWOOD);
	}

	@Override
	public int getColorMultiplier(IBlockState state, IBlockAccess worldIn, BlockPos pos, int tintIndex) {
		return worldIn != null && pos != null ? BiomeColorHelper.getFoliageColorAtPos(worldIn, pos) : ColorizerFoliage.getFoliageColorBasic();
	}
}

package thebetweenlands.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;

public class BetweenlandsPlantable extends Block {
    public BetweenlandsPlantable(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.relative(facing));
        return net.minecraftforge.common.PlantType.PLAINS.equals(type);
    }
}

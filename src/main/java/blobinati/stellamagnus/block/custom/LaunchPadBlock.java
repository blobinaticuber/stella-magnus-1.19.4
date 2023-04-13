package blobinati.stellamagnus.block.custom;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class LaunchPadBlock extends Block{

    public  LaunchPadBlock(FabricBlockSettings properties) {
        super(properties);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        //return VoxelShapes.cuboid(0, 0, 0, 1.0, 0.2, 1);
        return Block.createCuboidShape(0,0,0,16,3,16);
    }
}

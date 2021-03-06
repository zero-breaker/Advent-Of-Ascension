package net.tslat.aoa3.structure.lborean;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class DracyonFountain extends AoAStructure { //StructureSize: 8x8x8
	private static final IBlockState coralBricks = BlockRegister.bricksCoral.getDefaultState();
	private static final IBlockState glass = BlockRegister.glassAquatic.getDefaultState();
	private static final IBlockState dracyonAltar = BlockRegister.dracyonAltar.getDefaultState();
	private static final IBlockState water = Blocks.FLOWING_WATER.getDefaultState();

	public DracyonFountain() {
		super("DracyonFountain");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 1, 0, 1, coralBricks);
		addBlock(world, basePos, 1, 0, 2, coralBricks);
		addBlock(world, basePos, 1, 0, 3, coralBricks);
		addBlock(world, basePos, 1, 0, 4, coralBricks);
		addBlock(world, basePos, 1, 0, 5, coralBricks);
		addBlock(world, basePos, 1, 0, 6, coralBricks);
		addBlock(world, basePos, 2, 0, 1, coralBricks);
		addBlock(world, basePos, 2, 0, 2, coralBricks);
		addBlock(world, basePos, 2, 0, 3, coralBricks);
		addBlock(world, basePos, 2, 0, 4, coralBricks);
		addBlock(world, basePos, 2, 0, 5, coralBricks);
		addBlock(world, basePos, 2, 0, 6, coralBricks);
		addBlock(world, basePos, 3, 0, 1, coralBricks);
		addBlock(world, basePos, 3, 0, 2, coralBricks);
		addBlock(world, basePos, 3, 0, 3, coralBricks);
		addBlock(world, basePos, 3, 0, 4, coralBricks);
		addBlock(world, basePos, 3, 0, 5, coralBricks);
		addBlock(world, basePos, 3, 0, 6, coralBricks);
		addBlock(world, basePos, 4, 0, 1, coralBricks);
		addBlock(world, basePos, 4, 0, 2, coralBricks);
		addBlock(world, basePos, 4, 0, 3, coralBricks);
		addBlock(world, basePos, 4, 0, 4, coralBricks);
		addBlock(world, basePos, 4, 0, 5, coralBricks);
		addBlock(world, basePos, 4, 0, 6, coralBricks);
		addBlock(world, basePos, 5, 0, 1, coralBricks);
		addBlock(world, basePos, 5, 0, 2, coralBricks);
		addBlock(world, basePos, 5, 0, 3, coralBricks);
		addBlock(world, basePos, 5, 0, 4, coralBricks);
		addBlock(world, basePos, 5, 0, 5, coralBricks);
		addBlock(world, basePos, 5, 0, 6, coralBricks);
		addBlock(world, basePos, 6, 0, 1, coralBricks);
		addBlock(world, basePos, 6, 0, 2, coralBricks);
		addBlock(world, basePos, 6, 0, 3, coralBricks);
		addBlock(world, basePos, 6, 0, 4, coralBricks);
		addBlock(world, basePos, 6, 0, 5, coralBricks);
		addBlock(world, basePos, 6, 0, 6, coralBricks);
		addBlock(world, basePos, 1, 1, 1, coralBricks);
		addBlock(world, basePos, 1, 1, 2, glass);
		addBlock(world, basePos, 1, 1, 3, glass);
		addBlock(world, basePos, 1, 1, 4, glass);
		addBlock(world, basePos, 1, 1, 5, glass);
		addBlock(world, basePos, 1, 1, 6, coralBricks);
		addBlock(world, basePos, 2, 1, 1, glass);
		addBlock(world, basePos, 2, 1, 6, glass);
		addBlock(world, basePos, 3, 1, 1, glass);
		addBlock(world, basePos, 3, 1, 3, coralBricks);
		addBlock(world, basePos, 3, 1, 4, coralBricks);
		addBlock(world, basePos, 3, 1, 6, glass);
		addBlock(world, basePos, 4, 1, 1, glass);
		addBlock(world, basePos, 4, 1, 3, coralBricks);
		addBlock(world, basePos, 4, 1, 4, coralBricks);
		addBlock(world, basePos, 4, 1, 6, glass);
		addBlock(world, basePos, 5, 1, 1, glass);
		addBlock(world, basePos, 5, 1, 6, glass);
		addBlock(world, basePos, 6, 1, 1, coralBricks);
		addBlock(world, basePos, 6, 1, 2, glass);
		addBlock(world, basePos, 6, 1, 3, glass);
		addBlock(world, basePos, 6, 1, 4, glass);
		addBlock(world, basePos, 6, 1, 5, glass);
		addBlock(world, basePos, 6, 1, 6, coralBricks);
		addBlock(world, basePos, 3, 2, 3, glass);
		addBlock(world, basePos, 3, 2, 4, glass);
		addBlock(world, basePos, 4, 2, 3, glass);
		addBlock(world, basePos, 4, 2, 4, glass);
		addBlock(world, basePos, 3, 3, 3, coralBricks);
		addBlock(world, basePos, 3, 3, 4, coralBricks);
		addBlock(world, basePos, 4, 3, 3, coralBricks);
		addBlock(world, basePos, 4, 3, 4, coralBricks);
		addBlock(world, basePos, 3, 4, 3, water);
		addBlock(world, basePos, 3, 4, 4, water);
		addBlock(world, basePos, 4, 4, 3, water);
		addBlock(world, basePos, 4, 4, 4, water);
		addBlock(world, basePos, 3, 5, 3, coralBricks);
		addBlock(world, basePos, 3, 5, 4, coralBricks);
		addBlock(world, basePos, 4, 5, 3, coralBricks);
		addBlock(world, basePos, 4, 5, 4, coralBricks);
		addBlock(world, basePos, 0, 6, 0, coralBricks);
		addBlock(world, basePos, 0, 6, 1, coralBricks);
		addBlock(world, basePos, 0, 6, 2, coralBricks);
		addBlock(world, basePos, 0, 6, 3, coralBricks);
		addBlock(world, basePos, 0, 6, 4, coralBricks);
		addBlock(world, basePos, 0, 6, 5, coralBricks);
		addBlock(world, basePos, 0, 6, 6, coralBricks);
		addBlock(world, basePos, 0, 6, 7, coralBricks);
		addBlock(world, basePos, 1, 6, 0, coralBricks);
		addBlock(world, basePos, 1, 6, 1, glass);
		addBlock(world, basePos, 1, 6, 2, glass);
		addBlock(world, basePos, 1, 6, 3, glass);
		addBlock(world, basePos, 1, 6, 4, glass);
		addBlock(world, basePos, 1, 6, 5, glass);
		addBlock(world, basePos, 1, 6, 6, glass);
		addBlock(world, basePos, 1, 6, 7, coralBricks);
		addBlock(world, basePos, 2, 6, 0, coralBricks);
		addBlock(world, basePos, 2, 6, 1, glass);
		addBlock(world, basePos, 2, 6, 2, glass);
		addBlock(world, basePos, 2, 6, 3, glass);
		addBlock(world, basePos, 2, 6, 4, glass);
		addBlock(world, basePos, 2, 6, 5, glass);
		addBlock(world, basePos, 2, 6, 6, glass);
		addBlock(world, basePos, 2, 6, 7, coralBricks);
		addBlock(world, basePos, 3, 6, 0, coralBricks);
		addBlock(world, basePos, 3, 6, 1, glass);
		addBlock(world, basePos, 3, 6, 2, glass);
		addBlock(world, basePos, 3, 6, 3, coralBricks);
		addBlock(world, basePos, 3, 6, 4, coralBricks);
		addBlock(world, basePos, 3, 6, 5, glass);
		addBlock(world, basePos, 3, 6, 6, glass);
		addBlock(world, basePos, 3, 6, 7, coralBricks);
		addBlock(world, basePos, 4, 6, 0, coralBricks);
		addBlock(world, basePos, 4, 6, 1, glass);
		addBlock(world, basePos, 4, 6, 2, glass);
		addBlock(world, basePos, 4, 6, 3, coralBricks);
		addBlock(world, basePos, 4, 6, 4, coralBricks);
		addBlock(world, basePos, 4, 6, 5, glass);
		addBlock(world, basePos, 4, 6, 6, glass);
		addBlock(world, basePos, 4, 6, 7, coralBricks);
		addBlock(world, basePos, 5, 6, 0, coralBricks);
		addBlock(world, basePos, 5, 6, 1, glass);
		addBlock(world, basePos, 5, 6, 2, glass);
		addBlock(world, basePos, 5, 6, 3, glass);
		addBlock(world, basePos, 5, 6, 4, glass);
		addBlock(world, basePos, 5, 6, 5, glass);
		addBlock(world, basePos, 5, 6, 6, glass);
		addBlock(world, basePos, 5, 6, 7, coralBricks);
		addBlock(world, basePos, 6, 6, 0, coralBricks);
		addBlock(world, basePos, 6, 6, 1, glass);
		addBlock(world, basePos, 6, 6, 2, glass);
		addBlock(world, basePos, 6, 6, 3, glass);
		addBlock(world, basePos, 6, 6, 4, glass);
		addBlock(world, basePos, 6, 6, 5, glass);
		addBlock(world, basePos, 6, 6, 6, glass);
		addBlock(world, basePos, 6, 6, 7, coralBricks);
		addBlock(world, basePos, 7, 6, 0, coralBricks);
		addBlock(world, basePos, 7, 6, 1, coralBricks);
		addBlock(world, basePos, 7, 6, 2, coralBricks);
		addBlock(world, basePos, 7, 6, 3, coralBricks);
		addBlock(world, basePos, 7, 6, 4, coralBricks);
		addBlock(world, basePos, 7, 6, 5, coralBricks);
		addBlock(world, basePos, 7, 6, 6, coralBricks);
		addBlock(world, basePos, 7, 6, 7, coralBricks);
		addBlock(world, basePos, 3, 7, 3, dracyonAltar);
		addBlock(world, basePos, 3, 7, 4, dracyonAltar);
		addBlock(world, basePos, 4, 7, 3, dracyonAltar);
		addBlock(world, basePos, 4, 7, 4, dracyonAltar);
	}
}

package com.main.mod.worldgen;

import com.main.mod.Blocks.BlockDecMO;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by brandon on 11/29/14.
 */
public class MOWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        //
        switch(world.provider.dimensionId) {

            case 0:     //surface
                generateSurface(world, random, chunkX*16, chunkZ*16);
            case 1:     //end
               // generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case -1:    //nether
               // generateNether(world, random, chunkX * 16, chunkZ * 16);

        }
    }

    private void generateSurface(World world, Random random, int x, int z) {
        this.addOreSpawn(BlockDecMO.blockOres, 0, world, random, x, z, 16, 16, 4 + random.nextInt(6), 75, 38, 100);
        this.addOreSpawn(BlockDecMO.blockOres, 1, world, random, x, z, 16, 16, 4 + random.nextInt(6), 75, 38, 100);
        this.addOreSpawn(BlockDecMO.blockOres, 2, world, random, x, z, 16, 16, 4 + random.nextInt(6), 75, 38, 100);
        this.addOreSpawn(BlockDecMO.blockOres, 3, world, random, x, z, 16, 16, 4 + random.nextInt(6), 75, 38, 100);

    }

    private void addOreSpawn(Block block, int meta, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
        for(int i = 0; i < chanceToSpawn; i++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, meta, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
        }
    }
}

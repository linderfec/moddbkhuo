package com.linderfec.dbjk;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DbjkTomBlock extends Block {
    public comuseblock() {
        super(BlockBehaviour.Properties.of().strength(2.0f).requiresCorrectToolForDrops());
    }
}

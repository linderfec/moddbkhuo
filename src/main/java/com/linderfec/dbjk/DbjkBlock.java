package com.linderfec.dbjk;

import com.linderfec.dbjk.Dbjk;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class DbjkBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dbjk.MODID);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dbjk.MODID);

    public static final RegistryObject<Block> MYBLOCK = BLOCKS.register("islook", () -> new Block(BlockBehaviour.Properties.of().strength(2.0f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> MYBLOCK_ITEM = ITEMS.register("islock", () -> new BlockItem(MYBLOCK.get(), new Item.Properties()));
}

package com.linderfec.dbjk.block;

import com.linderfec.dbjk.Dbjk;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class CpmBlock {
    public CpmBlock() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        CpmBlock.BLOCKS.register(bus);
        CpmBlock.ITEMS.register(bus);
        CpmBlock.CREATIVE_MODE_TABS.register(bus);
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dbjk.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dbjk.MODID);
    public static final RegistryObject<Block> CPMBLOCK = BLOCKS.register("cpm", () ->
            new Block(BlockBehaviour.Properties.of().strength(2.0f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> CPMBLOCK_ITEM = ITEMS.register("cpm", () -> new BlockItem(CPMBLOCK.get(), new Item.Properties()));


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dbjk.MODID);
    public static final RegistryObject<CreativeModeTab> COP_TAB = CREATIVE_MODE_TABS.register("cpm_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("Happlelo")).withTabsBefore(CreativeModeTabs.COMBAT).icon(() ->
                    CpmBlock.CPMBLOCK_ITEM.get().getDefaultInstance()).displayItems((p, o) -> o.accept(CpmBlock.CPMBLOCK_ITEM.get())).build());

}
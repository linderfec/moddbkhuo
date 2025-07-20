package com.linderfec.dbjk;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Dbjk.MODID)

public class Dbjk {
    public static final String MODID = "dbjk";
    public Dbjk() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        DbjkBlock.BLOCKS.register(bus);
        DbjkBlock.ITEMS.register(bus);
        DbjkTabs.CREATIVE_MODE_TABS.register(bus);
    }
}

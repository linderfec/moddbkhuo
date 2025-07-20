package com.linderfec.dbjk;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class DbjkTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dbjk.MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("dbjk_tab", () -> CreativeModeTab.builder().title(Component.translatable("itenGroup.Dbjk.dbjk_tab")).withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> DbjkBlock.MYBLOCK_ITEM.get().getDefaultInstance()).displayItems((p, o) -> o.accept(DbjkBlock.MYBLOCK_ITEM.get())).build());
}

package com.shawnbyday.sbdprogsys.item;

import com.shawnbyday.sbdprogsys.SBDProgSys;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SBDProgSys.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SBD_PROG_SYS_TAB = CREATIVE_MODE_TABS.register("sbdprogsys_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLINTWORKED.get()))
                    .title(Component.translatable("creativetab.sbdprogsys_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FLINTWORKED.get());
                        pOutput.accept(ModItems.KNIFEWORKING.get());
                        pOutput.accept(ModItems.LW_AWL.get());
                        pOutput.accept(ModItems.LW_BEVELER.get());
                        pOutput.accept(ModItems.LW_BURNISHER.get());
                        pOutput.accept(ModItems.LW_CHISEL.get());
                        pOutput.accept(ModItems.LW_CUTTING_MAT.get());
                        pOutput.accept(ModItems.LW_GLUE.get());
                        pOutput.accept(ModItems.LW_MAUL.get());
                        pOutput.accept(ModItems.LW_NEEDLE.get());
                        pOutput.accept(ModItems.LW_PICKING_IRON.get());
                        pOutput.accept(ModItems.LW_PUNCH.get());
                        pOutput.accept(ModItems.LW_ROTARY_CUTTER.get());
                        pOutput.accept(ModItems.LW_SKIVER.get());
                        pOutput.accept(ModItems.LW_STAMP.get());
                        pOutput.accept(ModItems.LW_STRAP_CUTTER.get());
                        pOutput.accept(ModItems.LW_THREAD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

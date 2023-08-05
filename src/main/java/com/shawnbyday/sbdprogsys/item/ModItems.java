package com.shawnbyday.sbdprogsys.item;

import com.shawnbyday.sbdprogsys.SBDProgSys;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SBDProgSys.MOD_ID);

    public static final RegistryObject<Item> FLINTWORKED = ITEMS.register("flint_worked", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KNIFEWORKING = ITEMS.register("knife_working", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

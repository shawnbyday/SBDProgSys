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
    public static final RegistryObject<Item> LW_AWL = ITEMS.register("lw_awl", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_BEVELER = ITEMS.register("lw_beveler", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_BURNISHER = ITEMS.register("lw_burnisher", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_STRAP_CUTTER = ITEMS.register("lw_strap_cutter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_ROTARY_CUTTER = ITEMS.register("lw_rotary_cutter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_GLUE = ITEMS.register("lw_glue", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_MAUL = ITEMS.register("lw_maul", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_PICKING_IRON = ITEMS.register("lw_picking_iron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_CHISEL = ITEMS.register("lw_chisel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_PUNCH = ITEMS.register("lw_punch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_SKIVER = ITEMS.register("lw_skiver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_STAMP = ITEMS.register("lw_stamp", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_NEEDLE = ITEMS.register("lw_needle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_THREAD = ITEMS.register("lw_thread", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LW_CUTTING_MAT = ITEMS.register("lw_cutting_mat", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

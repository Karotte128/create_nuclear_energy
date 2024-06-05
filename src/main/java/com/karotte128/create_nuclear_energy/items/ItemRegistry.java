package com.karotte128.create_nuclear_energy.items;

import com.karotte128.create_nuclear_energy.CreativeTab;
import com.simibubi.create.content.equipment.extendoGrip.ExtendoGripItemRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.karotte128.create_nuclear_energy.CreateNuclearEnergy.REGISTRATE;

public class ItemRegistry {

    public static final ItemEntry<Item> ACID_POWDER = REGISTRATE.item("acid_powder", Item::new).register();
    public static final ItemEntry<Item> LEAD_INGOT = REGISTRATE.item("lead_ingot", Item::new).register();
    public static final ItemEntry<Item> LEAD_NUGGET = REGISTRATE.item("lead_nugget", Item::new).register();
    public static final ItemEntry<Item> NUCLEAR_FUEL = REGISTRATE.item("nuclear_fuel", Item::new).register();


	public static void register() {}
}

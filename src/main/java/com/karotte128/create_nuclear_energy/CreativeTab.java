package com.karotte128.create_nuclear_energy;

//import com.karotte128.create_nuclear_energy.blocks.BlockRegistry;
import com.karotte128.create_nuclear_energy.fluids.FluidRegistry;
import com.karotte128.create_nuclear_energy.items.ItemRegistry;
import com.karotte128.create_nuclear_energy.blocks.BlockRegistry;
import com.simibubi.create.foundation.utility.Components;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeTab {

    public static void register(){
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, "create_nuclear_energy", BASE_CREATIVE_TAB);
        ItemGroupEvents.MODIFY_ENTRIES_ALL.register(CreativeTab::make);
    }

    private static void make(CreativeModeTab creativeModeTab, FabricItemGroupEntries entries) {
        if (creativeModeTab == BASE_CREATIVE_TAB) {

            entries.accept(FluidRegistry.ACID.get().getBucket());
	    entries.accept(FluidRegistry.CONCENTRATED_ACID.get().getBucket());
	    entries.accept(FluidRegistry.HOT_WATER.get().getBucket());
	    entries.accept(ItemRegistry.ACID_POWDER);
	    entries.accept(ItemRegistry.LEAD_INGOT);
	    entries.accept(ItemRegistry.LEAD_NUGGET);
            entries.accept(ItemRegistry.NUCLEAR_FUEL);
	    entries.accept(BlockRegistry.LEAD_CASING);
	    entries.accept(BlockRegistry.LEAD_GLASS);
        }
    }

    public static final CreativeModeTab BASE_CREATIVE_TAB = FabricItemGroup.builder()
                    .title(Components.translatable("itemGroup.create_nuclear_energy"))
                    .icon(ItemRegistry.ACID_POWDER::asStack)
                    .build();
}

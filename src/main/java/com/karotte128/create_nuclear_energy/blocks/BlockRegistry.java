package com.karotte128.create_nuclear_energy.blocks;

//import static com.simibubi.create.content.redstone.displayLink.AllDisplayBehaviours.assignDataBehaviour;
import static com.karotte128.create_nuclear_energy.CreateNuclearEnergy.REGISTRATE;
import com.karotte128.create_nuclear_energy.CreativeTab;

//import com.simibubi.create.AllCreativeModeTabs;
//import com.simibubi.create.content.processing.AssemblyOperatorBlockItem;
import com.simibubi.create.foundation.data.AssetLookup;
//import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.client.renderer.RenderType;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;


public class BlockRegistry {

//    static {
//        REGISTRATE.setCreativeTab(AllCreativeModeTabs.BASE_CREATIVE_TAB.key());
//    }

    public static final BlockEntry<Block> LEAD_CASING = REGISTRATE
            .block("lead_casing", Block::new)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> LEAD_GLASS = REGISTRATE
	    .block("lead_glass", Block::new)
	    .simpleItem()
	    .register();

    public static final BlockEntry<Block> COMPRESSED_COBBLESTONE = REGISTRATE
	    .block("compressed_cobblestone", Block::new)
	    .simpleItem()
	    .register();

    public static void register() {}

}

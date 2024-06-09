package com.karotte128.create_nuclear_energy.blocks;

import static com.karotte128.create_nuclear_energy.CreateNuclearEnergy.REGISTRATE;
import com.karotte128.create_nuclear_energy.CreativeTab;
import com.karotte128.create_nuclear_energy.blocks.LeadCasingBlocks;
import com.karotte128.create_nuclear_energy.blocks.RadiationSensorBlock;


//import com.simibubi.create.AllCreativeModeTabs;
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

    public static final BlockEntry<LeadCasingBlocks> LEAD_CASING = REGISTRATE
            .block("lead_casing", LeadCasingBlocks::new)
            .simpleItem()
            .register();

    public static final BlockEntry<LeadCasingBlocks> LEAD_GLASS = REGISTRATE
	    .block("lead_glass", LeadCasingBlocks::new)
	    .properties(BlockBehaviour.Properties::noOcclusion)
            .addLayer(() -> RenderType::cutout)
            .simpleItem()
	    .register();


    public static final BlockEntry<RadiationSensorBlock> RADIATION_SENSOR = REGISTRATE
            .block("radiation_sensor", RadiationSensorBlock::new)
            .simpleItem()
            .register();

    public static void register() {}

}

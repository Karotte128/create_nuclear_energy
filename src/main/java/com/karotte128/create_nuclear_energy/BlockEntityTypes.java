package com.karotte128.create_nuclear_energy;

import com.simibubi.create.content.kinetics.base.CutoutRotatingInstance;
import com.simibubi.create.content.kinetics.base.HalfShaftInstance;
import com.simibubi.create.content.kinetics.base.KineticBlockEntityRenderer;
import com.simibubi.create.content.kinetics.base.ShaftInstance;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.karotte128.create_nuclear_energy.blocks.RadiationSensorBlock;
//import com.karotte128.create_nuclear_energy.blocks.RadiationSensorRenderer;
import com.karotte128.create_nuclear_energy.blocks.RadiationSensorBlockEntity;
import com.karotte128.create_nuclear_energy.blocks.BlockRegistry;
import static com.karotte128.create_nuclear_energy.CreateNuclearEnergy.REGISTRATE;

public class BlockEntityTypes {
        public static final BlockEntityEntry<RadiationSensorBlockEntity> SENSOR = REGISTRATE
            .blockEntity("radiation_sensor", RadiationSensorBlockEntity::new)
            .validBlocks(BlockRegistry.SENSOR)
            .register();

    public static void load() {  }
}


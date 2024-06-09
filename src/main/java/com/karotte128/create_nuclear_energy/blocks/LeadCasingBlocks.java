package com.karotte128.create_nuclear_energy.blocks;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.world.level.block.Block;

public class LeadCasingBlocks extends Block implements IWrenchable {
    public LeadCasingBlocks(Properties properties) {
        super(properties.strength(6.0f));
    }
}


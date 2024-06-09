package com.karotte128.create_nuclear_energy.compat.computercraft;

import com.karotte128.create_nuclear_energy.blocks.RadiationSensorBlockEntity;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PeripheralProvider{

    @Nullable
    public static IPeripheral getPeripheral(@NotNull Level level, @NotNull BlockPos blockPos, @NotNull BlockState state, @NotNull BlockEntity be, @NotNull Direction direction) {
        if(be instanceof RadiationSensorBlockEntity RadiationSensorTile) {
            return Peripherals.createRadiationSensorPeripheral(RadiationSensorTile);
        } 

        return null;
    }
}

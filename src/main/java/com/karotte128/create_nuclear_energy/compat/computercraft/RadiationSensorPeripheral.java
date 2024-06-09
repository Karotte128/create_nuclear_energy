package com.karotte128.create_nuclear_energy.compat.computercraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.karotte128.create_nuclear_energy.blocks.RadiationSensorBlockEntity;

//import com.karotte128.create_nuclear_energy.config.Config;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;

public class RadiationSensorPeripheral implements IPeripheral {
	protected final List<IComputerAccess> connected = new ArrayList<>();
    protected String type;
    protected RadiationSensorBlockEntity tileEntity;

    public RadiationSensorPeripheral(String type, RadiationSensorBlockEntity tileEntity) {
        this.type = type;
        this.tileEntity = tileEntity;
    }

    public List<IComputerAccess> getConnectedComputers() {
        return connected;
    }

    @Override
    public Object getTarget() {
        return tileEntity;
    }

    @Override
    public void attach(IComputerAccess computer) {
        connected.add(computer);
    }

    @Override
    public void detach(IComputerAccess computer) {
        connected.remove(computer);
    }

    @Override
    public boolean equals(IPeripheral iPeripheral) {
        return iPeripheral == this;
    }
    
        
        @LuaFunction(mainThread = true)
    public final int getRadiation(){
        return 24;
    }
    
   
}

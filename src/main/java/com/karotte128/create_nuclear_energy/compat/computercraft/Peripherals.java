package com.karotte128.create_nuclear_energy.compat.computercraft;

import com.karotte128.create_nuclear_energy.blocks.RadiationSensorBlockEntity;

public class Peripherals {
	public static RadiationSensorPeripheral createRadiationSensorPeripheral(RadiationSensorBlockEntity te) {
		return new RadiationSensorPeripheral("radiation_sensor", te);
	}
}

package com.karotte128.create_nuclear_energy;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;


import com.karotte128.create_nuclear_energy.fluids.FluidRegistry;
import com.karotte128.create_nuclear_energy.items.ItemRegistry;
import com.karotte128.create_nuclear_energy.blocks.BlockRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateNuclearEnergy implements ModInitializer {
	public static final String ID = "create_nuclear_energy";
	public static final String NAME = "Create: Nuclear Energy";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create("create_nuclear_energy");

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);


		FluidRegistry.register();
		ItemRegistry.register();
		BlockRegistry.register();
		CreativeTab.register();

		REGISTRATE.register();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}

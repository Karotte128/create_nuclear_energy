package com.karotte128.create_nuclear_energy.fluids;

import com.karotte128.create_nuclear_energy.CreativeTab;
//import com.karotte128.create_nuclear_energy.TagRegistry;
import com.simibubi.create.AllFluids;
import com.simibubi.create.AllTags;
import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.fabric.SimpleFlowableFluid;
import net.fabricmc.fabric.api.transfer.v1.fluid.*;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;

import javax.annotation.Nullable;

import static com.karotte128.create_nuclear_energy.CreateNuclearEnergy.REGISTRATE;
import static net.minecraft.world.item.Items.BUCKET;

public class FluidRegistry {


//Acid
    public static final FluidEntry<SimpleFlowableFluid.Flowing> ACID
	    = REGISTRATE.fluid("acid", new ResourceLocation("create_nuclear_energy:block/acid_still"), new ResourceLocation("create_nuclear_energy:block/acid_flow"))
//                    .lang("Acid")
                    .fluidAttributes(() -> new CreateAttributeHandler("block.create_nuclear_energy.acid", 1500, 500))
                    .fluidProperties(p -> p.levelDecreasePerBlock(1)
                            .tickRate(25)
                            .flowSpeed(5)
                            .blastResistance(100f))
                    .source(SimpleFlowableFluid.Source::new)
//                    .tag(AllTags.forgeFluidTag("acid"))
                    .onRegisterAfter(Registries.ITEM, acid -> {
                        Fluid source = acid.getSource();

                        FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
                                new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
                        FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
                                new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
                    })
                    .register();


//Concentrated Acid
    public static final FluidEntry<SimpleFlowableFluid.Flowing> CONCENTRATED_ACID
	    = REGISTRATE.fluid("concentrated_acid", new ResourceLocation("create_nuclear_energy:block/concentrated_acid_still"), new ResourceLocation("create_nuclear_energy:block/concentrated_acid_flow"))
//                    .lang("Concentrated Acid")
                    .fluidAttributes(() -> new CreateAttributeHandler("block.create_nuclear_energy.concentrated_acid", 1500, 500))
                    .fluidProperties(p -> p.levelDecreasePerBlock(1)
                            .tickRate(25)
                            .flowSpeed(5)
                            .blastResistance(100f))
                    .source(SimpleFlowableFluid.Source::new)
//                    .tag(AllTags.forgeFluidTag("acid"))
                    .onRegisterAfter(Registries.ITEM, concentrated_acid -> {
                        Fluid source = concentrated_acid.getSource();

                        FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
                                new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
                        FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
                                new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
                    })
                    .register();


//Coolant
    public static final FluidEntry<SimpleFlowableFluid.Flowing> COOLANT
	    = REGISTRATE.fluid("coolant", new ResourceLocation("create_nuclear_energy:block/coolant_still"), new ResourceLocation("create_nuclear_energy:block/coolant_flow"))
//                    .lang("coolant")
                    .fluidAttributes(() -> new CreateAttributeHandler("block.create_nuclear_energy.coolant", 1500, 500))
                    .fluidProperties(p -> p.levelDecreasePerBlock(1)
                            .tickRate(25)
                            .flowSpeed(5)
                            .blastResistance(100f))
                    .source(SimpleFlowableFluid.Source::new)
//                    .tag(AllTags.forgeFluidTag("coolant"))
                    .onRegisterAfter(Registries.ITEM, coolant -> {
                        Fluid source = coolant.getSource();

                        FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
                                new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
                        FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
                                new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
                    })
                    .register();




    public static void register() {}

    private record CreateAttributeHandler(Component name, int viscosity, boolean lighterThanAir) implements FluidVariantAttributeHandler {
        private CreateAttributeHandler(String key, int viscosity, int density) {
            this(Component.translatable(key), viscosity, density <= 0);
        }

        public CreateAttributeHandler(String key) {
            this(key, FluidConstants.WATER_VISCOSITY, 1000);
        }

        @Override
        public Component getName(FluidVariant fluidVariant) {
            return name.copy();
        }

        @Override
        public int getViscosity(FluidVariant variant, @Nullable Level world) {
            return viscosity;
        }

        @Override
        public boolean isLighterThanAir(FluidVariant variant) {
            return lighterThanAir;
        }
    }
}

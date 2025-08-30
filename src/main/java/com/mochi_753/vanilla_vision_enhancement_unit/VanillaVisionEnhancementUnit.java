package com.mochi_753.vanilla_vision_enhancement_unit;

import com.mochi_753.vanilla_vision_enhancement_unit.register.ModItems;
import com.mochi_753.vanilla_vision_enhancement_unit.register.ModModules;
import mekanism.api.MekanismIMC;
import mekanism.api.gear.ICustomModule;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VanillaVisionEnhancementUnit.MOD_ID)
public class VanillaVisionEnhancementUnit implements ICustomModule<VanillaVisionEnhancementUnit> {
    public static final String MOD_ID = "vveu";

    @SuppressWarnings("removal")
    public VanillaVisionEnhancementUnit() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
        ModModules.register(bus);
        bus.addListener(this::imcQueue);
    }

    private void imcQueue(InterModEnqueueEvent event) {
        MekanismIMC.addMekaSuitHelmetModules(ModModules.VANILLA_VISION_ENHANCEMENT_UNIT);
    }
}

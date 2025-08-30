package com.mochi_753.vanilla_vision_enhancement_unit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VanillaVisionEnhancementUnit.MOD_ID)
public class VanillaVisionEnhancementUnit {
    public static final String MOD_ID = "vanilla_vision_enhancement_unit";

    @SuppressWarnings("removal")
    public VanillaVisionEnhancementUnit() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}

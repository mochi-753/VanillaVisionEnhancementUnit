package com.mochi_753.vanilla_vision_enhancement_unit.register;

import com.mochi_753.vanilla_vision_enhancement_unit.VanillaVisionEnhancementUnit;
import com.mochi_753.vanilla_vision_enhancement_unit.module.ModuleVanillaVisionEnhancementUnit;
import mekanism.common.registration.impl.ModuleDeferredRegister;
import mekanism.common.registration.impl.ModuleRegistryObject;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModModules {
    public static final ModuleDeferredRegister MODULES = new ModuleDeferredRegister(VanillaVisionEnhancementUnit.MOD_ID);
    public static final ModuleRegistryObject<ModuleVanillaVisionEnhancementUnit> VANILLA_VISION_ENHANCEMENT_UNIT =
            MODULES.register("vanilla_vision_enhancement_unit", ModuleVanillaVisionEnhancementUnit::new,
                    () -> ModItems.VANILLA_VISION_ENHANCEMENT_UNIT.asItem(),
                    builder -> builder.maxStackSize(1).rarity(Rarity.RARE).handlesModeChange().rendersHUD().disabledByDefault());

    private ModModules() {
    }

    public static void register(IEventBus bus) {
        MODULES.register(bus);
    }
}

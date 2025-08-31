package com.mochi_753.vanilla_vision_enhancement_unit.register;

import com.mochi_753.vanilla_vision_enhancement_unit.VanillaVisionEnhancementUnit;
import mekanism.common.item.ItemModule;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(VanillaVisionEnhancementUnit.MOD_ID);
    public static final ItemRegistryObject<ItemModule> VANILLA_VISION_ENHANCEMENT_UNIT = ITEMS.registerModule(ModModules.VANILLA_VISION_ENHANCEMENT_UNIT);

    private ModItems() {
    }

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}

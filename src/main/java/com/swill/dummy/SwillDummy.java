package com.swill.dummy;

import net.fabricmc.api.ModInitializer;
import net.minecraft.text.Text;

public class SwillDummy implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("[SwillDummy] Загружен!");
    }
}

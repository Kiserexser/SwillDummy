package com.swill.dummy;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class DummyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        DummyCommand.register();
        if (MinecraftClient.getInstance().player != null) {
            MinecraftClient.getInstance().player.sendMessage(Text.literal("§a[SwillDummy] Пустышка загружена!"), false);
        }
        System.out.println("[SwillDummy] Client initialized");
    }
}

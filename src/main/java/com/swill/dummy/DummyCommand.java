package com.swill.dummy;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;
import static net.minecraft.server.command.CommandManager.literal;

public class DummyCommand {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(literal("swill")
                .executes(context -> {
                    context.getSource().sendMessage(Text.literal("§aМод-пустышка работает!"));
                    return 1;
                })
            );
        });
    }
}

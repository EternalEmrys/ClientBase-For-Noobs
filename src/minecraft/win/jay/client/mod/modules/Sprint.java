package win.jay.client.mod.modules;

import net.minecraft.client.Minecraft;
import win.jay.client.mod.Category;
import win.jay.client.mod.Mod;

/**
 * Created by Jay
 */

/*
 * Client Base Test Module. (Sprint)
 */

public class Sprint extends Mod{

    public Sprint() {
        super("Sprint", "L", Category.MOVEMENT);
    }

    public void onUpdate() {
        mc.gameSettings.keyBindSprint.pressed = true;
    }

    public void onDisable() {
        mc.gameSettings.keyBindSprint.pressed = false;
    }

}


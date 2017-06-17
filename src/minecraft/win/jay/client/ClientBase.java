package win.jay.client;

import org.lwjgl.opengl.Display;
import win.jay.client.mod.ModManager;
import win.jay.client.utils.Logger;
import win.jay.client.utils.LoggerCategory;

/**
 * Created by Jay
 */
public class ClientBase {

    //Edit to what you want.
    public static String clientName = "ClientBase";

    public static ModManager modManager;

    public static void startClient() {
        modManager = new ModManager();
        Logger.printCategoriedString("Started Client", LoggerCategory.ONSTART);
    }

    public void createDisplay() {
        Display.setResizable(true);
        Display.setTitle(clientName);
    }

}

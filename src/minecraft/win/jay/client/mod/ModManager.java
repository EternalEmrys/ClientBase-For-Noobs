package win.jay.client.mod;

import win.jay.client.mod.modules.Sprint;

import java.util.ArrayList;

/**
 * Created by Jay
 */
public class ModManager {

    //Mods in general.
    public static ArrayList<Mod> mods = new ArrayList<>();

    //Active Mods.
    public static ArrayList<Mod> activeMods = new ArrayList<>();

    public ModManager() {
        add(new Sprint());
    }

    public void add(Mod mod) {
        this.mods.add(mod);
    }


    public Mod getMod(Class<? extends Mod> modClass) {
        for(Mod mod: mods) {
            if(mod.getClass() == modClass) {
                return mod;
            }
        }
        return null;
    }
}

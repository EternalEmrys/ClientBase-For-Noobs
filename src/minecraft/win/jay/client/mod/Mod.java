package win.jay.client.mod;

import com.mojang.authlib.yggdrasil.response.MinecraftTexturesPayload;
import net.minecraft.client.Minecraft;
import win.jay.client.ClientBase;

/**
 * Created by Jay
 */
public class Mod {

    protected Minecraft mc = Minecraft.getMinecraft();

    private String name;
    private String bind;
    private Category category;

    private boolean active;

    public Mod(String name, String bind, Category category) {
        this.name = name;
        this.bind = bind;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void toggle() {
        active = !active;
        if(active) {
            this.onEnable();
            ClientBase.modManager.activeMods.add(this);
        }else{
            this.onDisable();
            ClientBase.modManager.activeMods.remove(this);
        }
    }

    public void onEnable() {}
    public void onDisable() {}
    public void onUpdate() {}
}

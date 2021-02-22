package src.CraftMine;

import org.lwjgl.opengl.Display;

import src.RenderEngine.DisplayManager;
import src.RenderEngine.MasterRenderer;

public class MainGame {
    
    public static void main(String[] args) {
        DisplayManager.createDisplay();

        MasterRenderer renderer = new MasterRenderer();

        while (!Display.isCloseRequested()) {
            renderer.prepare();
            DisplayManager.updateDisplay();
        }
    }
}

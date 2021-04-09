package src.CraftMine;

import org.lwjgl.opengl.Display;

import src.Models.RawModel;
import src.RenderEngine.DisplayManager;
import src.RenderEngine.Loader;
import src.RenderEngine.MasterRenderer;

public class MainGame {
    public static Loader loader1 = null;
    public static void main(String[] args) {
        DisplayManager.createDisplay();

        MasterRenderer renderer = new MasterRenderer();
        Loader loader = new Loader();
        loader1 = loader;
        float[] vertices = {

            -0.5f,-0.5f,0,
            0.5f,-0.5f,0,
            0.5f,0.5f,0,
            -0.5f,0.5f,0

        };

        int [] indices = {
            0,1,2,
            2,3,0
        };
        RawModel model = loader.loadToVAO(vertices,indices);


        while (!Display.isCloseRequested()) {
            renderer.prepare();
            renderer.render(model);
            DisplayManager.updateDisplay();
        }
    }
}

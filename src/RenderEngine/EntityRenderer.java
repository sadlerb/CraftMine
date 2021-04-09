package src.RenderEngine;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import src.Models.RawModel;

public class EntityRenderer {
    
    public static void render(RawModel model){

        GL30.glBindVertexArray(model.getvaoID());
        GL20.glEnableVertexAttribArray(0);
        GL11.glDrawElements(GL11.GL_TRIANGLES, model.getvertexCount(),GL11.GL_UNSIGNED_INT,0);
        GL30.glBindVertexArray(0);
    }
}

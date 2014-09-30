package org.ipovalyaev.jariohd.engine2d.base;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class PNGTexture {
    private Texture texture;
    
    public PNGTexture(){
        texture=null;
    }
    
    public PNGTexture(String path){
        try {
            //texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/image.png"));
            texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(path));
        } catch (IOException ex) {
            Logger.getLogger(PNGTexture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Применить текстуру
    public void bind(){
        Color.white.bind();
        texture.bind(); // or GL11.glBind(texture.getTextureID());
    }
}

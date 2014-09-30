package org.ipovalyaev.jariohd.engine2d.core;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;

public class HRender {
    public static void init(){
        try {
            Display.setDisplayMode(new DisplayMode(HOptions.WINDOW_WIDTH,HOptions.WINDOW_HEIGHT));
            Display.setFullscreen(false);
            Display.setTitle("Hello LWJGL World!");
            Display.create();
        } catch (LWJGLException ex) {
            Logger.getLogger(HRender.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //2D Initialization
        glClearColor(0.0f,0.0f,0.0f,0.0f);
        glDisable(GL_DEPTH_TEST);
        glDisable(GL_LIGHTING);

        //2D Scene
        glViewport(0,0,HOptions.WINDOW_WIDTH,HOptions.WINDOW_HEIGHT);
 
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        gluOrtho2D(0.0f,HOptions.WINDOW_WIDTH,0.0f,HOptions.WINDOW_HEIGHT);
        
        glPushMatrix();
            glMatrixMode(GL_MODELVIEW);
            glLoadIdentity();
        glPushMatrix();
    }
    
    public static void render(){
        glClear(GL_COLOR_BUFFER_BIT);
        glLoadIdentity();
 
        //Draw a basic square
        glColor3f(0.0f,0.5f,0.5f);
        glBegin(GL_QUADS);
            glTexCoord2f(0.0f,0.0f); glVertex2f(0.0f,0.0f);
            glTexCoord2f(1.0f,0.0f); glVertex2f(100.0f,0.0f);
            glTexCoord2f(1.0f,1.0f); glVertex2f(100.0f,100.0f);
            glTexCoord2f(0.0f,1.0f); glVertex2f(0.0f,100.0f);
        glEnd();       
    }
    
    public static void destroy(){
        Display.destroy();
    }
}

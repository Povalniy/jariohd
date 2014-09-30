package org.ipovalyaev.jariohd.engine2d.core;

import static jariohd.JarioHD.DISPLAY_HEIGHT;
import static jariohd.JarioHD.DISPLAY_WIDTH;
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
            Display.setDisplayMode(new DisplayMode(1280,720));
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
        glViewport(0,0,1280,720);
 
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        gluOrtho2D(0.0f,1280,0.0f,720);
        glPushMatrix();
 
            glMatrixMode(GL_MODELVIEW);
            glLoadIdentity();
        glPushMatrix();
    }
}

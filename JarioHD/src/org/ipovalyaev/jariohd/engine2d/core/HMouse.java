package org.ipovalyaev.jariohd.engine2d.core;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;

public class HMouse {
    public static void init(){
        Mouse.setGrabbed(false);
        try {        
            Mouse.create();
        } catch (LWJGLException ex) {
            Logger.getLogger(HMouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void destroy(){
        Mouse.destroy();
    }
}

package org.ipovalyaev.jariohd.engine2d.core;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;

public class HKeyboard {
    public static void init(){
        try {
            Keyboard.create();
        } catch (LWJGLException ex) {
            Logger.getLogger(HKeyboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void destroy(){
        Keyboard.destroy();
    }
}

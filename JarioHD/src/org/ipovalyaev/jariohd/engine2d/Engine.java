package org.ipovalyaev.jariohd.engine2d;

import org.ipovalyaev.jariohd.engine2d.core.HKeyboard;
import org.ipovalyaev.jariohd.engine2d.core.HMouse;
import org.ipovalyaev.jariohd.engine2d.core.HRender;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

public class Engine {
    public static void init(){
        HRender.init();
    }
    
    public static void run(){
        while(!Display.isCloseRequested() && !Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
            if(Display.isVisible()) {
                HRender.render();
            }
            else {
                if(Display.isDirty()) {
                    HRender.render();
                }
                try {
                    Thread.sleep(100);
                }
                catch(InterruptedException ex) {
                }
            }
            Display.update();
            Display.sync(60);
        }
    }
    
    public static void stop(){
        HMouse.destroy();
        HKeyboard.destroy();
        HRender.destroy();
    }
}

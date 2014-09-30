package org.ipovalyaev.jariohd.engine2d.system;

import org.ipovalyaev.jariohd.engine2d.core.HOptions;

public class SysMessage {
    
    public static void debugMessage(String mess){
        if(HOptions.DEBUG_MODE){
            System.out.println(mess);
        }
    }
}

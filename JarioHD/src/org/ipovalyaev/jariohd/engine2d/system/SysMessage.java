package org.ipovalyaev.jariohd.engine2d.system;

public class SysMessage {
    
    public static void debugMessage(String mess){
        //TODO : тут по идее должна быть проверка на DEBUG режим движка
        if(true){
            System.out.println(mess);
        }
    }
}

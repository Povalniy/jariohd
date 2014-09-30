package org.ipovalyaev.jariohd;

import org.ipovalyaev.jariohd.engine2d.Engine;
import org.ipovalyaev.jariohd.engine2d.system.SysMessage;

public class Main {
    public static void main(String[] args) {
        SysMessage.debugMessage("Jario application!!!");
        Engine.init();
        Engine.run();
        Engine.stop();
    }
}

package org.ipovalyaev.jariohd;

import org.ipovalyaev.jariohd.engine2d.Engine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jario application!!!");
        Engine.init();
        Engine.run();
        Engine.stop();
    }
}

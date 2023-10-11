package org.jrescalante.salecomputersapp;

import org.jrescalante.salecomputersapp.model.*;

public class MainApp {
    public static void main(String[] args) {
        Mouse mouseLenovo = new Mouse("Bluetooht", "Lenovo");
        System.out.println(mouseLenovo);
        Keyboard keyboardLenovo = new Keyboard("Bluetooht", "Lenovo");
        System.out.println("keyboardLenovo = " + keyboardLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", "27");
        System.out.println("monitorLenovo = " + monitorLenovo);

        System.out.println();
        
        Computer lenovoComputer = new Computer("Lenovo Computer" , monitorLenovo,keyboardLenovo,mouseLenovo);
        System.out.println(lenovoComputer);
    }
}

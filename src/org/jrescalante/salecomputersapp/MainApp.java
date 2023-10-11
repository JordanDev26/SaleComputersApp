package org.jrescalante.salecomputersapp;

import org.jrescalante.salecomputersapp.model.*;
import org.jrescalante.salecomputersapp.service.Order;

public class MainApp {
    public static void main(String[] args) {

        Order order1 = new Order();
        Mouse mouseLenovo = new Mouse("Bluetooht", "Lenovo");
        Keyboard keyboardLenovo = new Keyboard("Bluetooht", "Lenovo");
        Monitor monitorLenovo = new Monitor("Lenovo", "27");
        Computer lenovoComputer = new Computer("Lenovo Computer" , monitorLenovo,keyboardLenovo,mouseLenovo);

        Mouse mouseDell = new Mouse("Bluetooht", "Dell");
        Keyboard keyboardDell = new Keyboard("Bluetooht", "Dell");
        Monitor monitorDell = new Monitor("Dell", "27");
        Computer dellComputer = new Computer("Dell Computer" , monitorDell,keyboardDell,mouseDell);

        Mouse mouseMac = new Mouse("Bluetooht", "Mac");
        Keyboard keyboardMac = new Keyboard("Bluetooht", "Mac");
        Monitor monitorMac = new Monitor("Dell", "27");
        Computer macComputer = new Computer("Mac Computer" , monitorMac,keyboardMac,mouseMac);

        order1.addComputer(lenovoComputer);
        order1.addComputer(dellComputer);
        order1.showOrder();

        Order order2 = new Order();
        order2.addComputer(lenovoComputer);
        order2.addComputer(dellComputer);
        order2.addComputer(macComputer);
        order2.showOrder();

    }
}

package org.jrescalante.salecomputersapp.model;

public class Computer {
    private final int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static  int computerCounter;

    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.idComputer = ++computerCounter;
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Id Computer: " + idComputer+
                "\nName: " + name +
                "\nMonitor specifications-> " + monitor +
                "\nKeyboard specifications-> " + keyboard +
                "\nMouse specifications-> " + computerCounter;
    }
}

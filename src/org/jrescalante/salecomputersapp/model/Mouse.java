package org.jrescalante.salecomputersapp.model;

public class Mouse extends InputDevice {
    private final int idMouse;
    private static int mouseCounter;

    public Mouse(String inputType, String brand) {
        super(inputType, brand);
        this.idMouse = ++mouseCounter;
    }

    @Override
    public String toString() {
        return "Id mouse: " + idMouse
                + ", " + super.toString();
    }
}

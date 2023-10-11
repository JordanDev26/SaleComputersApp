package org.jrescalante.salecomputersapp.model;

public class Keyboard extends InputDevice{
    private final int idKeyboard;
    private int keyboarCounter;


    public Keyboard(String inputType, String brand) {
        super(inputType, brand);
        this.idKeyboard = ++keyboarCounter;
    }
    public String toString() {
        return "Id Keyboard: " + idKeyboard
                + " " + super.toString();
    }
}

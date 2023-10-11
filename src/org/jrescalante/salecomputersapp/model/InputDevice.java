package org.jrescalante.salecomputersapp.model;

public class InputDevice {
    private String inputType;
    private String brand;

    public InputDevice(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Input Type: " + inputType+
                "Brand: " + brand;
    }
}

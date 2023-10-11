package org.jrescalante.salecomputersapp.model;

public class Monitor {
    private final int idMonitor;
    private String brand;
    private String size;
    private static int monitorCounter;

    public Monitor(String brand, String size) {
        this.idMonitor = ++monitorCounter;
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Id monitor: " + idMonitor +
                ", Brand: " + brand +
                ", Size: " + size + " inches";
    }
}

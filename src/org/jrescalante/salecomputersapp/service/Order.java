package org.jrescalante.salecomputersapp.service;

import org.jrescalante.salecomputersapp.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int idOrder;
    private final List<Computer> computers;

    private static int orderCounter;

    public Order() {
        this.idOrder = ++orderCounter;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer){
        this.computers.add(computer);
    }

    public void showOrder(){
        System.out.println("Order #: " + idOrder);
        System.out.println("Total computers: " + computers.size());
        System.out.println();
        computers.forEach(System.out::println);
    }
}

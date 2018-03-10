package com.jbisht.blogs.java8;

public class InterfaceVsAbstractClass {

    public static void main(String[] args) {
        Car c = new Tiago();
        System.out.println(c.getPrice());

        Vehicle v = new Tiago();
        System.out.println(v.getPrice());

        Tiago t = new Tiago();
        System.out.println(t.getPrice());

    }
}

interface Car {
    default int getPrice() {
        return 10;
    }
}

interface Vehicle {
    default int getPrice() {
        return 20;
    }
}

class Tiago implements Car, Vehicle {

    @Override
    public int getPrice() {
        return Vehicle.super.getPrice();
    }
}

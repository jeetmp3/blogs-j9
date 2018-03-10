package com.jbisht.blogs.oops;

import java.text.NumberFormat;

public class AbstractClassTest {

    public static void main(String[] args) {
        Car car = new Tiago();
        NumberFormat format = NumberFormat.getInstance();
        System.out.println(car.getVendor() +" - "+format.format(car.getPrice()));
    }
}

abstract class Car {

    private String vendor;

    public Car(String vendor) {
        this.vendor = vendor;
    }

    public abstract long getPrice();

    public String getVendor() {
        return vendor;
    }
}

class Tiago extends Car {

    public Tiago() {
        super("Tata");
    }
    @Override
    public long getPrice() {
        return 563000;
    }
}
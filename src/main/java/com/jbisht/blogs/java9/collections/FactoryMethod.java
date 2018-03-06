package com.jbisht.blogs.java9.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FactoryMethod {

    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        factoryMethod.oldWayOfCreatingList();

        factoryMethod.newWayToCreateList();
    }

    public void oldWayOfCreatingList() {
        List<Integer> oldList = Arrays.asList(10, 11, 12);
        System.out.println("Old Way Using arrays: "+oldList);

        List<Integer> singletonList = Collections.singletonList(10);
        System.out.println("Old way using collections singleton list: "+singletonList);
    }

    public void newWayToCreateList() {
        List<Integer> list = List.of(10, 11, 12, 13);
        System.out.println("New Way using List::of :" + list);
    }
}

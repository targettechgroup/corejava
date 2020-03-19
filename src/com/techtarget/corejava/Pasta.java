package com.techtarget.corejava;

public class Pasta implements Recipie {

    @Override
    public void ingredients() {
        System.out.println("Marinara, Basil, Pasta");
    }

    @Override
    public void preparation() {
        System.out.println("Boil Pasta, .....");
    }
}

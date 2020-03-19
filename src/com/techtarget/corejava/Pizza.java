package com.techtarget.corejava;

public class Pizza implements Recipie {

    @Override
    public void ingredients() {
        System.out.println("Chicken, peppers, cheese");
    }

    @Override
    public void preparation() {
        System.out.println("Bake....");
    }
}

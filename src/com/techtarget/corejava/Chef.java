package com.techtarget.corejava;

public abstract class Chef {
    public abstract String name();
    public abstract String speciality();

    public void title() {
        System.out.println(name() + speciality());
    }
}

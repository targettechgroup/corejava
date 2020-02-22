package com.targettech.corejava;

public class OvenTest {
    public static void main(String[] args) {
        Microvave m=new Microvave();
        ConventionalOven c=new ConventionalOven();
        m.reheat();
        m.reheat("20degrees");
        c.bake("300degrees","30min");
    }
}

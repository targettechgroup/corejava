package com.techtarget.corejava;

public class Test {

    public static void main(String[] args) {
        Male male = new Male();
        Female female = new Female();
        AlphaMale am = new AlphaMale();

        male.breath();
        male.talk();

        female.breath();
        female.talk();

        am.run();
    }
}

package com.techtarget.corejava;

public class Test {

    public static void main(String[] args) {
        Human male = new Male();
        Human female = new Female();
        AlphaMale am = new AlphaMale();
        IndianMale im = new IndianMale();

        male.breath();
        male.talk();

        female.breath();
        female.talk();

        am.run();

        System.out.println(im.shave(1));
        System.out.println(im.shave(1.50));
        System.out.println(im.shave(1.50, "Gillete"));
    }
}

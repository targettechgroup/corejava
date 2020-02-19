package com.techtarget.corejava;

public class Female implements Human {
    @Override
    public void breath() {

        System.out.println("I am a female breathing");

    }

    @Override
    public void talk() {
        System.out.println("I am a female talking");
    }
}

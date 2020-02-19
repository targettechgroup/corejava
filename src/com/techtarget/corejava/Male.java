package com.techtarget.corejava;

public class Male implements Human{
    @Override
    public void breath() {

        System.out.println("I am a male breathing");

    }

    @Override
    public void talk() {

        System.out.println("I am a male talking");

    }
}

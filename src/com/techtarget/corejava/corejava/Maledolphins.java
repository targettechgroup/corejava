package com.targettech.corejava;

public class Maledolphins implements Dolphins {
    @Override
    public void swim() {
        System.out.println("I am a maledolphin swimming");
    }

    @Override
    public void dive() {
        System.out.println("I am a maledolphin diving");
    }
}

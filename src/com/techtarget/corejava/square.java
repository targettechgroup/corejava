package com.targettech.corejava;

public class square implements Shape{
    @Override
    public void length() {
        int x = 2;
        System.out.println("Length of square is :"+x);

    }

    @Override
    public void breadth() {
        int y =3;
        System.out.println("Breadth of square is :"+y);

    }
}

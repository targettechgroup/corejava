package com.targettech.corejava;

public class Rectangle implements Shape {
    @Override
    public void length() {
        int x = 4;
        System.out.println("Length of Rectangle is:"+x);
    }

    @Override
    public void breadth() {

        int y = 5;
        System.out.println("Breadth of rectangle is :"+y);

    }

}

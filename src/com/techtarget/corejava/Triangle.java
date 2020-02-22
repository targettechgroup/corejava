package com.targettech.corejava;

public class Triangle extends Dimension implements Shape{
    @Override
    public String height(int z) {
        return "Height of Triangle is:"+String.valueOf(z);
    }

    @Override
    public String height(float z) {
        return "Height of Triangle is:"+String.valueOf(z);
    }

    @Override
    public String height(double z) {
        return "Height of Triangle is :"+String.valueOf(z);
    }

    @Override
    public void length() {
        int x= 1;
        System.out.println("Length of Triangle is:"+x);

    }

    @Override
    public void breadth() {

        int y= 1;
        System.out.println("Breadth of Triangle is:"+y);
    }
}

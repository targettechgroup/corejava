package com.targettech.corejava;

public class Cars {
    private String color;
    private String make;
    private String size;


    public Cars(String color, String make, String size) {
        this.color = color;
        this.make = make;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

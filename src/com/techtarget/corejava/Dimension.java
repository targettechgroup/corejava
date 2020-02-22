package com.targettech.corejava;

public abstract class Dimension {
    public abstract String height(int z);
    public abstract String height(float z);
    public abstract String height(double z);

    public void raidus(){

        int r = 20;
        System.out.println("Radius is:"+r);
    }
}

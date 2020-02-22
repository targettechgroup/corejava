package com.targettech.corejava;

public class test{
    public static void main (String[] args){
        Maledolphins maledolphin= new Maledolphins();
        Femaledolphins femaledolphin= new Femaledolphins();
        Whaledolphin wm = new Whaledolphin();


        maledolphin.dive();
        maledolphin.swim();

        femaledolphin.dive();
        femaledolphin.swim();
        femaledolphin.givebirth();

        wm.whistle();
    }
}



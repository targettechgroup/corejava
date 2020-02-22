package com.targettech.corejava;

public class Loops {

    public static void main(String[] args) {
        System.out.println("Target Tech");

        String[] animals ={"cat","dog","tiger","zebra","Lion"};

            for(String a: animals)
            {
                if(a== "cat")
                    System.out.println("cat says meow");

                else if(a== "dog")
                    System.out.println("dog barks");

                else if(a == "tiger")
                    System.out.println("tiger roars");

                else if(a == "zebra")
                    System.out.println("zebra zees");

                else
                    System.out.println("oops, i am new animal,SORRY");

            };




    }
}

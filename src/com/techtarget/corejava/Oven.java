package com.targettech.corejava;

public abstract class Oven {
     public void reheat(){
             System.out.println("default reheat");
      }

      public void reheat(String temp)
       {
           System.out.println("reheated to "+ temp );
       }

        public void bake(String temp,String time){
            System.out.println("baked at "+temp+" for "+ time);
        }
}

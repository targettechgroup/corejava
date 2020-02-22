package com.targettech.corejava;

public class Test_assignment {
    public static void main(String[] args) {

        square sq = new square();
        Rectangle re = new Rectangle();
        Triangle tr = new Triangle();

        sq.length();
        sq.breadth();
        re.length();
        re.breadth();

        tr.length();
        tr.breadth();
        System.out.println(tr.height(1));
        System.out.println(tr.height(7.4));
        System.out.println(tr.height(700));


    }
}

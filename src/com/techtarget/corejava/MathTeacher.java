package com.targettech.corejava;

public class MathTeacher implements Teacher {

    @Override
    public void Teaching() {
        System.out.println("I'm a math teacher");
    }

    @Override
    public void grading() {

        System.out.println("I grade all my students in math");
    }

    @Override
    public void Tutoring() {
        System.out.println("I also do tutoring in math");
    }
}

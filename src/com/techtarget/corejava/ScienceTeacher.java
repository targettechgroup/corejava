package com.targettech.corejava;

public class ScienceTeacher implements Teacher {
    @Override
    public void Teaching() {
        System.out.println("I'm a Science teacher");
    }

    @Override
    public void grading() {
        System.out.println("I do grading in Science");
    }

    @Override
    public void Tutoring() {
        System.out.println("I do science tutoring");
    }
}

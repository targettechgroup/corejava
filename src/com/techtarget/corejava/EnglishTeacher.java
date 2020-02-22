package com.targettech.corejava;

public class EnglishTeacher implements Teacher {
    @Override
    public void Teaching() {
        System.out.println("I'm a English teacher");
    }

    @Override
    public void grading() {
        System.out.println("I do grading in English");
    }

    @Override
    public void Tutoring() {
        System.out.println("I do english Tutoring");
    }
}

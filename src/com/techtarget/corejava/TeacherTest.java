package com.targettech.corejava;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher m1=new MathTeacher();
        ScienceTeacher s1=new ScienceTeacher();
        EnglishTeacher e1=new EnglishTeacher();
        m1.Teaching();
        m1.grading();
        m1.Tutoring();
        s1.Teaching();
        s1.grading();
        s1.Tutoring();
        e1.Teaching();
        e1.grading();
        e1.Tutoring();
    }
}

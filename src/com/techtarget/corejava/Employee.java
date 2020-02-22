package com.targettech.corejava;

public class Employee {

    private int empid;
    private String designation;
    private int salary;


    public Employee(int empid, String designation, int salary) {
        this.empid = empid;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

}

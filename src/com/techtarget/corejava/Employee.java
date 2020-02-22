package com.targettech.corejava;

public class Employee {
    private int empno;
    private String empname;
    private String designation;

    public Employee(int empno, String empname, String designation) {
        this.empno = empno;
        this.empname = empname;
        this.designation = designation;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

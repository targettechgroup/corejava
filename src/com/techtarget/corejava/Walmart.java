package com.targettech.corejava;

import java.util.Arrays;


public class Walmart {

    private String location;
    private String phnumber;
    private String timing;
    private Employee[] employees;
    private Product[] products;
    private Sale[] sales;
    private Customerservice[] services;

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Sales_Manager",1000);
        Employee e2 = new Employee(2,"Cashier",500);
        Employee[] earray ={e1,e2};

        Product p1 = new Product(101,"Grocery",50);
        Product p2 = new Product(102,"Electronics",5000);
        Product[] prodarray ={p1,p2};

        Sale s1 = new Sale(1,205,"14Feb20");
        Sale s2 = new Sale(2,305,"17Feb20");
        Sale[] salesarray ={s1,s2};

        Customerservice c1 = new Customerservice(1,"Refund","Pending");
        Customerservice c2 = new Customerservice(2,"Replacement","Successful");
        Customerservice[] servicearray ={c1,c2};


        Walmart walmart = new Walmart("Bridgeton","1234","24 hours",earray,prodarray,salesarray,servicearray);
        System.out.println(walmart.toString());
    }

    public Walmart(String location, String phnumber, String timing, Employee[] employees,Product[] products,Sale[] sales, Customerservice[] services) {
        this.location = location;
        this.phnumber = phnumber;
        this.timing = timing;
        this.employees = employees;
        this.products = products;
        this.sales= sales;
        this.services= services;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "Walmart{" +
                "location='" + location + '\'' +
                ", phnumber='" + phnumber + '\'' +
                ", timing='" + timing + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", products=" + Arrays.toString(products) +
                ", sales=" + Arrays.toString(sales) +
                ", services=" + Arrays.toString(services) +
                '}';
    }
}


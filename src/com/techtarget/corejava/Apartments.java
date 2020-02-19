package com.techtarget.corejava;

import java.util.Arrays;

public class Apartments{
    private String address;
    private String phone;
    private String name;
    private Floorplan[] floorPlan;

    // camelCase floorPlanDiagram

    public Apartments(String address, String phone, String name, Floorplan[] floorplan) {
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.floorPlan = floorplan;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apartments{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", floorplan=" + Arrays.toString(floorPlan) +
                '}';
    }

    public static void main(String[] args) {
        Floorplan f1 = new Floorplan(2, "town home", 1);
        Floorplan[] floorPlanArray = {f1};
        Apartments A1 = new Apartments("784 Kenilworth Ln", "614-123-7875","Ravines At Westar", floorPlanArray);
        System.out.println(A1.toString());
    }
}











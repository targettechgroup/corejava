package com.targettech.corejava;

import java.util.Arrays;

public class Apartments {
    private String address;
    private String phone;
    private String name;
    private floorplan[] floorplan;

    public Apartments(String address, String phone, String name, com.targettech.corejava.floorplan[] floorplan) {
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.floorplan = floorplan;
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


    public com.targettech.corejava.floorplan[] getFloorplan() {
        return floorplan;
    }

    public void setFloorplan(com.targettech.corejava.floorplan[] floorplan) {
        this.floorplan = floorplan;
    }

    @Override
    public String toString() {
        return "Apartments{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", floorplan=" + Arrays.toString(floorplan) +
                '}';
    }
}













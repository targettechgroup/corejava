package com.techtarget.corejava;

import java.util.Arrays;

public class Restaurant {

    private String address;
    private String phone;
    private String name;
    private Menu[] menu;

    public Restaurant(String a, String p, String n, Menu[] menu) {
        this.address = a;
        this.phone = p;
        this.name = n;
        this.menu = menu;
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

    public Menu[] getMenu() {
        return menu;
    }

    public void setMenu(Menu[] menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", menu=" + Arrays.toString(menu) +
                '}';
    }

    public static void main(String[] args) {
        Menu m1 = new Menu(1,"Chicken 65", "Very yummy");
        Menu[] mArray = {m1};


        Restaurant anis = new Restaurant("123 Main St", "12345678", "Anis", mArray);
        anis.setAddress("456 West Street");
        System.out.println(anis.toString());
        System.out.println(anis.getMenu()[0]);
    }
}

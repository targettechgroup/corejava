package com.targettech.corejava;

import java.util.Arrays;

public class showroom {
    private String address;
    private String number;
    private String name;
    private Cars[] cars;
    private Bikes[] bikes;
    private  Ev[] ev;
    private Trucks[] trucks;


    public showroom(String address, String number, String name,Cars[] c,Bikes[] b,Ev[] e,Trucks[] t) {
        this.address = address;
        this.number = number;
        this.name = name;
        this.cars = c;
        this.bikes = b;
        this.ev = e;
        this.trucks = t;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cars[] getCars() {
        return cars;
    }

    public void setCars(Cars[] cars) {
        this.cars = cars;
    }

    public Bikes[] getBikes() {
        return bikes;
    }

    public void setBikes(Bikes[] bikes) {
        this.bikes = bikes;
    }

    public Ev[] getEv() {
        return ev;
    }

    public void setEv(Ev[] ev) {
        this.ev = ev;
    }

    public Trucks[] getTrucks() {
        return trucks;
    }

    public void setTrucks(Trucks[] trucks) {
        this.trucks = trucks;
    }

    @Override
    public String toString() {
        return "showroom{" +
                "address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                ", bikes=" + Arrays.toString(bikes) +
                ", ev=" + Arrays.toString(ev) +
                ", trucks=" + Arrays.toString(trucks) +
                '}';
    }

    public static void main(String[] args) {

        Cars c1=new Cars("grey","toyota","sedan");
        Cars c2=new Cars("red","honda","coupe");
        Cars[] cArray={c1,c2};
        Bikes b1=new Bikes("vespa", "sports","2020");
        Bikes[] bArray={b1};
        Ev e1=new Ev("Tesla","model x","2020");
        Ev[] eArray={e1};
        Trucks t1=new Trucks("nissan ","frontier","2020");
        Trucks[] tArray={t1};

        showroom s=new showroom("123 main st","2736187263","honda",cArray,bArray,eArray,tArray);
        System.out.println(s.toString());


    }
}

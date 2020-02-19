package com.techtarget.corejava;

public class Floorplan {

    private int bedrooms;
    private String Model;
    private int Bathroom;

    public Floorplan(int bedrooms, String model, int bathroom) {
        this.bedrooms = bedrooms;
        Model = model;
        Bathroom = bathroom;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getBathroom() {
        return Bathroom;
    }

    public void setBathroom(int bathroom) {
        Bathroom = bathroom;
    }

    @Override
    public String toString() {
        return "floorplan{" +
                "bedrooms=" + bedrooms +
                ", Model='" + Model + '\'' +
                ", Bathroom=" + Bathroom +
                '}';
    }
}


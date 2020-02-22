package com.targettech.corejava;

public class amenities {

    private String community;
    private String apartment;
    private String pet;

    public amenities(String community, String apartment, String pet) {
        this.community = community;
        this.apartment = apartment;
        this.pet = pet;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "amenities{" +
                "community='" + community + '\'' +
                ", apartment='" + apartment + '\'' +
                ", pet='" + pet + '\'' +
                '}';
    }
}



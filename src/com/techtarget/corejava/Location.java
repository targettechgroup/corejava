package com.targettech.corejava;

public class Location {
    private int locationid;
    private String state;
    private String country;

    public Location(int locationid, String state, String country) {
        this.locationid = locationid;
        this.state = state;
        this.country = country;
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationid=" + locationid +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

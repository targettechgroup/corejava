package com.techtarget.corejava;

public class IndianMale extends AsianMale implements Human {


    @Override
    public void mustach() {

    }

    @Override
    public void breath() {

    }

    @Override
    public void talk() {

    }

    public String shave(int inches) {

        return "I am shaving " + String.valueOf(inches) + "inches";
    }

    public String shave(double inches) {

        return "I am shaving more than 1 inch which is " + String.valueOf(inches) + "inches";
    }

    public String shave(double inches, String soapType) {

        return "I am shaving more than 1 inch which is " + String.valueOf(inches) + "inches using " + soapType;
    }
}
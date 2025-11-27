package com.cabbooking.model;

public class Car extends Vehicale{
    public Car(String number,String model){
        super(number ,model);

    }

    @Override
    public String getType(){
        return "Car";
    }
}

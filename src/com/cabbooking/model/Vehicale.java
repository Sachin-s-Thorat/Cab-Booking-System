package com.cabbooking.model;

public abstract class Vehicale {
    protected String  number ;
    protected String model;

    public Vehicale(String number, String model){
        this.number=number;
        this.model=model;

    }

    public abstract String getType();

    @Override
    public  String  toString(){
        return model+" - "+number;
    }
}

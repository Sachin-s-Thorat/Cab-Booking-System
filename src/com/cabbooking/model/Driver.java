package com.cabbooking.model;

public class Driver {

    private String id;
    private String name;
    private Vehicale vehicale;
    private boolean  available;

    public Driver(String id,String name,Vehicale vehicale){
        this.id=id;
        this.name=name;
        this.vehicale=vehicale;
        this.available=true;
    }

    public String getId(){
        return id;
    }

    public  String getName(){
        return name;
    }

    public Vehicale getVehicale() {
        return vehicale;
    }
    public boolean isAvailable(){
        return available;
    }

    public void  setAvailable( boolean available){
        this.available=available;
    }

    public String  ToString(){
        return name+"  "+vehicale;
    }
}

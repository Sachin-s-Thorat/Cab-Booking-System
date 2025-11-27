package com.cabbooking.model;

public class Ride {
    private String id;
    private Driver driver;
    private String  pickup;
    private  String drop;
    private  double distance;
    private double fare;

    public Ride(String id,Driver driver,String pickup,String drop,double distance){
        this.id=id;
        this.driver=driver;
        this.pickup=pickup;
        this.drop=drop;
        this.distance=distance;


    }

    public String getId(){
        return id;
    }

    public Driver getDriver() {
        return driver;
    }
    public String getPickup(){
        return pickup;
    }
    public String getDrop(){
        return drop;

    }
    public  double getDistance(){
        return distance;
    }
    public void  setFare(double fare){
        this.fare=fare;
    }

    @Override
    public String toString(){
        return "Ride"+id+" Driver"+driver+"Distance"+distance+" km  Fare "+fare;
    }

}

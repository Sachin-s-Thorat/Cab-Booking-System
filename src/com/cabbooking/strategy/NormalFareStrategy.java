package com.cabbooking.strategy;

public class NormalFareStrategy implements FareStrategy{
    @Override
    public double calculateFare(double distance){
        return  distance*10;
    }
}

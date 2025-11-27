package com.cabbooking.repository;

import com.cabbooking.model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepository {
    private List<Driver> drivers=new ArrayList<>();

    public void save(Driver driver){
        drivers.add(driver);
    }

    public List <Driver>getAll(){
        return drivers;
    }

    public  Driver findAvailableDriver(){
        return drivers.stream()
                .filter(Driver::isAvailable)
                .findFirst()
                .orElse(null);
    }
}

package com.cabbooking.service;

import com.cabbooking.model.Driver;
import com.cabbooking.model.Ride;
import com.cabbooking.repository.DriverRepository;
import com.cabbooking.strategy.FareStrategy;

public class RideServiceImpl implements RideService{

    private DriverRepository driverRepo;
    private FareStrategy fareStrategy;

    public RideServiceImpl(DriverRepository repo,FareStrategy fareStrategy){
        this.driverRepo=repo;
        this.fareStrategy=fareStrategy;
    }

    @Override
    public void  bookRide( String pickup,String drop,double distance){
        Driver driver=driverRepo.findAvailableDriver();
        if(driver==null){
            System.out.println("No Driver Available");
            return;
        }
        driver.setAvailable(false);

        Ride ride= new Ride("R"+System.currentTimeMillis(),driver,pickup,drop,distance);

        double fare = fareStrategy.calculateFare(distance);
        ride.setFare(fare);
        System.out.println(" Ride Booked successfully!");
        System.out.println(ride);

        driver.setAvailable(true);


    }
}

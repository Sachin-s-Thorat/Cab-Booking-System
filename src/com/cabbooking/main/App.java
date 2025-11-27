package com.cabbooking.main;

import com.cabbooking.model.Car;
import com.cabbooking.model.Driver;
import com.cabbooking.repository.DriverRepository;
import com.cabbooking.service.RideService;
import com.cabbooking.service.RideServiceImpl;
import com.cabbooking.strategy.FareStrategy;
import com.cabbooking.strategy.NormalFareStrategy;

public class App {

    public static void main(String[] args) {
        DriverRepository drive = new DriverRepository();
        drive.save(new Driver("d1", "rahul", new Car("MH15S2345", "RangeRover")));
        drive.save(new Driver("d2", "Abhi", new Car("MH13S2345", "Siyara")));

        FareStrategy fareStrategy = new NormalFareStrategy();

        RideService service = new RideServiceImpl(drive, fareStrategy);

        service.bookRide("Baner", "Hinjewadi", 8.0);
        service.bookRide("Pune", "PCMC", 12.5);
    }


}
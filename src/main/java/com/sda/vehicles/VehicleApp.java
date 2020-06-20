package com.sda.vehicles;

import org.w3c.dom.ls.LSOutput;

public class VehicleApp {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run(100);

        vehicle = new Car();
        vehicle.run(100);
    }
}

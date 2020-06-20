package com.sda.vehicles;

public class Vehicle {

    public void run(double velocity) {

        System.out.println("Vehicle running at " + velocity);
    }

    @Override
    public String toString() {
        return "Vehicle{}";
    }


}

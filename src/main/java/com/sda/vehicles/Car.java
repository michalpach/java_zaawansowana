package com.sda.vehicles;

public class Car extends Vehicle{

    int passangers;

    void addPassanger() {

        ++passangers;
        System.out.println("Added. Current number: " + passangers);
    }

    @Override
    public String toString() {
        return "Car{" +
                "passangers=" + passangers +
                '}';
    }

    void removePassanger() {

        if (passangers<1) {
            return;
        }
        else {
            --passangers;
            System.out.println("Removed. Current number: " + passangers);
        }


    }

    public void run(double velocity) {

        System.out.println("Car running at " + velocity);
    }
}

package com.sda.postoffice;

public class PostOfficeApp {
    public static void main(String[] args) {

        Parcel socks = new Parcel("socks");

        ParcelStatus statuses = ParcelStatus.values();
        System.out.println();

        String chosenStatus = "SENT";

        ParcelStatus newStatus = ParcelStatus.valueOf(chosenStatus); uwaga!!wyjątek


        /*System.out.println(socks);

        socks.changeStatus(ParcelStatus.DELIVERED);

        System.out.println(socks);*/

    }
}

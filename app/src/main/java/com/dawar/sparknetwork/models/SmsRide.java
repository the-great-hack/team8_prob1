package com.dawar.sparknetwork.models;

public class SmsRide {
    public int cid = 1;
    public int contentLength = 100;
    public Location location;
    public int rideStatus;

    public SmsRide(Location location) {
        this.location = location;

    }

    public SmsRide() {

    }

}

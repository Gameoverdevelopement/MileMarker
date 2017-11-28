package com.example.lathe.milemarker;

import java.io.Serializable;

/**
 * Created by lathe on 11/26/2017.
 */

public class Trip implements Serializable{
    private String destination;
    private double lat;
    private double Log;
    private double rate;
    private double milage;



    public Trip(){

    }

    public Trip(String destination, double rate){
        this.destination = destination;
        this.rate = rate;
    }

    //setting up getters and setters

    public String getDestination(){
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLog(double log) {
        Log = log;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

    public double getLatitude() {
        return this.lat;
    }

    public double getLongtitude(){
        return this.Log;
    }

    public double getRate(){
        return this.rate;
    }

    public double getMilage(){
        return this.milage;
    }


}

package com.klef.jfsd.exam;

import javax.persistence.Entity;

@Entity
public class Tablet extends Device {
    private String screenSize;
    private int batteryLife;

    // Getters and Setters
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public int getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}

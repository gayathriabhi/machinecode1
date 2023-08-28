package com.telusko.models;

import com.telusko.interfaces.SmartHomeDevices;

public class Fan implements SmartHomeDevices {
    String name;
    String location;
    Boolean state;
    int speed;
    String activationWords;

    public Fan(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getState() {
        return state;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void setActivationWords(String activationWords) {
        this.activationWords = activationWords;
    }

    @Override
    public String getActivationWords() {
        return activationWords;
    }
}

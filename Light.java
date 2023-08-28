package com.telusko.models;

import com.telusko.interfaces.SmartHomeDevices;
public class Light implements SmartHomeDevices{
    String name;
    String location;
    Boolean state;
    Color lightcolor;
    int brightness;
    String activationWords;

    public Light(String name, String Location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Boolean getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public void setLightcolor(Color lightcolor) {
        this.lightcolor = lightcolor;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public Color getLightcolor() {
        return lightcolor;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setActivationWords(String activationWords) {
        this.activationWords = activationWords;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getActivationWords() {
        return activationWords;
    }

    public int getBrightness() {
        return brightness;
    }
}

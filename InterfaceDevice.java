package com.telusko.models;

import java.util.*;
import com.telusko.interfaces.SmartHomeDevices;
public class InterfaceDevice {
    String name;

    public String getLocation() {
        return location;
    }

    String location;

    public void setLocation(String location) {
        this.location = location;
    }

    List<SmartHomeDevices> devices;
    String activationWord;

    public InterfaceDevice(String name, String location,
                           String activationWord) {
        this.name = name;
        this.location = location;
        this.activationWord = activationWord;
    }

    public String getName() {
        return name;
    }

    public List<SmartHomeDevices> getDevices() {
        return devices;
    }

    public String getActivationWord() {
        return activationWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDevices(List<SmartHomeDevices> devices) {
        this.devices = devices;
    }

    public void setActivationWord(String activationWord) {
        this.activationWord = activationWord;
    }
}

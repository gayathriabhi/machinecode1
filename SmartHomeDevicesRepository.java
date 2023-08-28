package com.telusko.repository;

import com.telusko.interfaces.*;
import com.telusko.models.*;
import com.telusko.services.*;

import java.util.List;

public class SmartHomeDevicesRepository {
    List<SmartHomeDevices> smartHomeDevices;

    public SmartHomeDevices getByName(String name){
        for(SmartHomeDevices smartHomeDevice: smartHomeDevices){
            if(smartHomeDevice.getName().equals(name)){
                return smartHomeDevice;
            }
        }
        return null;
    }

    public void createSmartDevices(String name, String location){
        SmartHomeDevices device = SmartHomeDevicesBuilder.createObject(name, location);
        smartHomeDevices.add(device);
    }


}

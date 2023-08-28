package com.telusko.repository;

import com.telusko.exception.InvalidCommandExeception;
import com.telusko.interfaces.SmartHomeDevices;
import com.telusko.models.InterfaceDevice;
import java.util.*;
public class InterfaceDevicesRepository {

    List<InterfaceDevice> interfaceDevices;
    SmartHomeDevicesRepository shexec = new SmartHomeDevicesRepository();

    public InterfaceDevice getByName(String name){
        for(InterfaceDevice interfaceDevice: interfaceDevices){
            if(interfaceDevice.getName().equals(name)){
                return interfaceDevice;
            }
        }
        return null;
    }

    public void createInterfaceDevices(String name, String location, String activationWords){
        InterfaceDevice device = new InterfaceDevice(name, location, activationWords);
        interfaceDevices.add(device);
    }
    public void connectSmartHomeDevices(String interface_name, String deviceName, String activationWords) throws InvalidCommandExeception {
        InterfaceDevice interfaceDevice = getByName(interface_name);
        if(interfaceDevice == null)
            throw new InvalidCommandExeception("Interface Device Doesn't exist");
        SmartHomeDevices smartHomeDevice = shexec.getByName(deviceName);
        if(smartHomeDevice.getLocation() != interfaceDevice.getLocation())
            throw new InvalidCommandExeception("Location of smart home device and interface is different");
        interfaceDevice.getDevices().add(smartHomeDevice);
    }
}

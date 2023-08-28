package com.telusko.services;

import java.util.*;
import com.telusko.exception.InvalidCommandExeception;
import com.telusko.repository.InterfaceDevicesRepository;
import com.telusko.repository.SmartHomeDevicesRepository;

public class CommandExecutor {
    InterfaceDevicesRepository interfaceDevicesRepository = new InterfaceDevicesRepository();
    SmartHomeDevicesRepository smartHomeDevicesRepository = new SmartHomeDevicesRepository();
    public void executeCommand(int commandNumber, String[] commands) throws InvalidCommandExeception{
        if(commandNumber == 1) {
            try {
                String interfaceName = commands[0];
                String Location = commands[1];
                String activationWords = commands[2];
                interfaceDevicesRepository.createInterfaceDevices(interfaceName, Location, activationWords);
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new InvalidCommandExeception("Necessary command params not given");
            }
        }
        if(commandNumber == 2){
            try {
                String interfaceName = commands[0];
                String Location = commands[1];
                smartHomeDevicesRepository.createSmartDevices(interfaceName, Location);
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new InvalidCommandExeception("Necessary command params not given");
            }
        }
        if(commandNumber == 3){
            try {
                String interfaceName = commands[0];
                String deviceName = commands[1];
                String activationWords = commands[2];
                interfaceDevicesRepository.connectSmartHomeDevices(interfaceName, deviceName, activationWords);
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new InvalidCommandExeception("Necessary command params not given");
            }
        }

    }

}

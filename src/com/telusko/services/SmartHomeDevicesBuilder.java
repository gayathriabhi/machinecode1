package com.telusko.services;

import com.telusko.interfaces.SmartHomeDevices;
import com.telusko.models.*;

public class SmartHomeDevicesBuilder {
   public static SmartHomeDevices createObject(String name, String location){
       if(name.equals("Lights")){
           return new Light(name, location);
       }
       if(name.equals("Fan")){
           return new Fan(name, location);
       }
       if(name.equals("Generic Electrical Devices")){
           return new GeneralElectricDevices(name, location);
       }
       return null;
   }
}




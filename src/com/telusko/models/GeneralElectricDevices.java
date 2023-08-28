package com.telusko.models;

import com.telusko.interfaces.SmartHomeDevices;
public class GeneralElectricDevices implements SmartHomeDevices{
        String name;
        String location;
        Boolean state;
        String activationWords;

        public String getName() {
                return name;
        }

        public String getLocation() {
                return location;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public void setLocation(String location) {
                location = location;
        }

        public void setState(Boolean state) {
                this.state = state;
        }

        public void setActivationWords(String activationWords) {
                this.activationWords = activationWords;
        }

        public Boolean getState() {
                return state;
        }

        public String getActivationWords() {
                return activationWords;
        }

        public GeneralElectricDevices(String name, String location) {
                this.name = name;
                this.location = location;
        }
}

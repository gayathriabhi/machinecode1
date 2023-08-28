package com.telusko;


import com.telusko.exception.InvalidCommandExeception;
import com.telusko.services.CommandExecutor;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CommandExecutor exec = new CommandExecutor();
        String commandline;
        String[] commands;
        while (true) {
            System.out.println("Please Enter the Command you want to give");
            System.out.println("1. Add interface Device");
            System.out.println("2. Add smarthome Device");
            System.out.println("3. Connect smarthome Device");
            System.out.println("4. Give Command");
            System.out.println("5. Print connected devices");

            Scanner sc = new Scanner(System.in);
            Integer command = sc.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("I am here");
                    String commandwords = sc.nextLine();
                    commands = commandwords.split(" ");
                    try {
                        exec.executeCommand(1, commands);
                    } catch (InvalidCommandExeception ex) {
                        System.out.println("Caught this exception " + ex.getMessage());
                    }
                    break;
                }
                case 2: {
                    commandline = sc.nextLine();
                    commands = commandline.split(" ");
                    try {
                        exec.executeCommand(2, commands);
                    } catch (InvalidCommandExeception ex) {
                        System.out.println("Caught this exception " + ex.getMessage());
                    }
                    break;
                }
                case 3: {
                    commandline = sc.nextLine();
                    commands = commandline.split(" ");
                    try {
                        exec.executeCommand(3, commands);
                    } catch (InvalidCommandExeception ex) {
                        System.out.println("Caught this exception " + ex.getMessage());
                    }
                    break;
                }
                case 4: {
                    commandline = sc.nextLine();
                    commands = commandline.split(" ");
                    try {
                        exec.executeCommand(4, commands);
                    } catch (InvalidCommandExeception ex) {
                        System.out.println("Caught this exception " + ex.getMessage());
                    }
                    break;
                }
                case 5: {
                    commandline = sc.nextLine();
                    commands = commandline.split(" ");
                    try {
                        exec.executeCommand(5, commands);
                    } catch (InvalidCommandExeception ex) {
                        System.out.println("Caught this exception " + ex.getMessage());
                    }
                    break;
                }

            }
        }
    }
}
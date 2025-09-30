package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int serialNumber = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("What model is the phone? ");
        String model = myScanner.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = myScanner.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();

        CellPhone phone = new CellPhone();
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);
        System.out.println("====================================================");

        System.out.println("The serial number: " + phone.getSerialNumber());
        System.out.println("The model: " + phone.getModel());
        System.out.println("The carrier: " + phone.getCarrier());
        System.out.println("The phone number: " + phone.getPhoneNumber());
        System.out.println("The owner of the phone: " + phone.getOwner());
    }
}

package com.israelmesa;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printMobileContactList();
                    break;
                case 2:
                    addPhoneContact();
                    break;
                case 3:
                    modifyPhoneContact();
                    break;
                case 4:
                    removePhoneContact();
                    break;
                case 5:
                    searchPhoneCntact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addPhoneContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.storeContact(name, phoneNumber);
        System.out.println("Contact " + mobilePhone.getNameContact(name) + " has been saved successfully.");
    }

    public static void modifyPhoneContact() {
        System.out.println("Enter name of contact you would like to modify: ");
        String modifyingContact = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        mobilePhone.modifyContact(modifyingContact, newName, newPhoneNumber);
        System.out.println("Contact " + modifyingContact + " has been modified.");
        System.out.println("New name: " + mobilePhone.getNameContact(newName));
        System.out.println("New phone number: " + mobilePhone.getPhoneNumberContact(newPhoneNumber));
    }

    public static void removePhoneContact() {
        System.out.println("Enter name of contact to be removed: ");
        String removingContact = scanner.nextLine();
        mobilePhone.removeContact(removingContact);
        System.out.println("Contact " + removingContact + " has been removed.");
    }

    public static void searchPhoneCntact() {
        System.out.println("Enter name of contact: ");
        String searchedContact = scanner.nextLine();
        mobilePhone.contactExists(searchedContact);
    }



}

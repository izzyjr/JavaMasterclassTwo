package com.israelmesa;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Santander");

    public static void main(String[] args) {

        boolean quit = false;
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    createBranch();
                    break;

                case 2:
                    queryBranch();
                    break;

                case 3:
                    bank.listBranches();
                    break;


            }

        }

    }

    private static void createBranch() {
        System.out.println("Enter name of city: ");
        String cityName = scanner.nextLine();
        Branches newBranch = Branches.createBranch(cityName);
        if(bank.createNewBranch(newBranch)) {
            System.out.println("New branch has opened in: " + cityName);
        } else {
            System.out.println("Cannot create, branch " + cityName + " already on file");
        }
    }

    private static void queryBranch() {
        System.out.println("Enter name of city: ");
        String cityName = scanner.nextLine();
        Branches existingBranch = bank.queryBranches(cityName);
        if (existingBranch == null) {
            System.out.println("Branch not found.");
            return;
        }

        System.out.println("Branch city: " + existingBranch.getCityBranch());
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - create new branch\n" +
                "2  - query a branch\n" +
                "3  - list all branches\n" +
                "4  - create new customer\n" +
                "5  - deposit\n" +
                "6  - withdraw\n" +
                "7  - list transactions\n" +
                "8  - balance\n" +
                "9  - query customer\n" +
                "10  - list all customers\n" +
                "11 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }


}

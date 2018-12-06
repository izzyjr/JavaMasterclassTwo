package com.israelmesa;

import java.util.ArrayList;

public class Branches {

    private String cityBranch;
    private ArrayList<Customer> cutomerList;

    public Branches(String cityBranch) {
        this.cityBranch = cityBranch;
        this.cutomerList = new ArrayList<Customer>();
    }

    public static Branches createBranch(String cityName) {
        return new Branches(cityName);
    }

    public String getCityBranch() {
        return cityBranch;
    }

    public ArrayList<Customer> getCutomerList() {
        return cutomerList;
    }

    public boolean addNewCustomer(Customer customer) {
        if (findCustomer(customer) >= 0) {
            System.out.println("Customer " + customer.getName() + " Already exists.");
            return false;
        }
        cutomerList.add(customer);
        return true;
    }

    public boolean deposit(String customerName, Double depositAmount) {
        int position = findCustomerByName(customerName);
        if (position < 0) {
            return false;
        }
        cutomerList.get(position).getTransactions().add(depositAmount);
        double currentBalance = cutomerList.get(position).getBalance();
        currentBalance += depositAmount;
        System.out.println(depositAmount + " was successfully deposited. Current balance is " + currentBalance);
        return true;
    }

    public boolean withdraw(String customerName, Double depositAmount) {
        int position = findCustomerByName(customerName);
        if (position < 0) {
            return false;
        }
        cutomerList.get(position).getTransactions().add(depositAmount);
        double currentBalance = cutomerList.get(position).getBalance();
        currentBalance -= depositAmount;
        System.out.println(depositAmount + " was successfully withdrawn. Current balance is " + currentBalance);
        return true;
    }

    private int findCustomer(Customer customer) {
        return this.cutomerList.indexOf(customer);
    }

    private int findCustomerByName(String customerName) {
        int position = -1;
        for (int i = 0; i < cutomerList.size(); i++) {
            if(this.cutomerList.get(i).getName().equals(customerName)) {
                position = i;
            }
        }
        return position;
    }

    public Customer queryContact(String name) {
        int position = findCustomerByName(name);
        if(position >= 0) {
            return this.cutomerList.get(position);
        }
        return null;
    }

    public void listCustomers() {
        System.out.println("List of Customers");
        for (int i = 0; i < cutomerList.size(); i++) {
            System.out.println((i + 1) + ": " + cutomerList.get(i).getName() + " - " + cutomerList.get(i).getBalance());
        }
    }
}

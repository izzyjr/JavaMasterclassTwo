package com.israelmesa;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.00;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void listTransactions() {
        System.out.println(name + " - List of Transactions");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println((i + 1) + ": " + transactions.get(i));
        }
    }

    public static Customer createContact(String name) {
        return new Customer(name);
    }

}

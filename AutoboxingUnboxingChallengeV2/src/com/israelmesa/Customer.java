package com.israelmesa;

import java.util.ArrayList;

public class Customer {

    private String Name;
    private ArrayList<Double> transactions;

    public Customer(String name, double amount) {
        Name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(amount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return Name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

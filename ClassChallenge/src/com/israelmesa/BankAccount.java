package com.israelmesa;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Constructor without parameters called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(00000, 100, customerName, email, phoneNumber);
        System.out.println("Two default parameters");
    }

    public void deposit(int deposit) {

        this.balance += deposit;

    }

    public void withdraw(int withdraw) {

        if(this.balance > withdraw) {

            this.balance -= withdraw;

        } else {
            System.out.println("Insufficient funds");
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

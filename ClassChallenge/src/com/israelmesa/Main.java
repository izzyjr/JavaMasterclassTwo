package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(1);
        account1.setBalance(100);
        account1.setCustomerName("Roger");
        account1.setEmail("roger@gmail.com");
        account1.setPhoneNumber("722-3214");

        account1.deposit(5000);
        account1.withdraw(4000);

        System.out.println("Current Balance is: " + account1.getBalance());

    }
}

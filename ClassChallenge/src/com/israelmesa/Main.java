package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        //Constructor no parameters
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(1);
        account1.setBalance(100);
        account1.setCustomerName("Roger");
        account1.setEmail("roger@gmail.com");
        account1.setPhoneNumber("722-3214");

        account1.deposit(5000);
        account1.withdraw(4000);

        System.out.println("Current Balance for " + account1.getCustomerName() + " = " + account1.getBalance());

        //Constructor with parameters
        BankAccount account2 = new BankAccount(1, 100, "Peggy", "peggy@gmail.com", "6278989");
        account2.deposit(3000);
        account2.withdraw(350);

        System.out.println("Current Balance for " + account2.getCustomerName() + " = " + account2.getBalance());
    }
}

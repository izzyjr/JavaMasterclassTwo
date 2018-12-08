package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Santander");

        bank.addBranch("Providence");
        bank.addCustomer("Providence", "Bob", 50.00);
        bank.addCustomer("Providence", "Mary", 90.00);
        bank.addCustomer("Providence", "Dan", 40.23);

        bank.addBranch("Boston");
        bank.addCustomer("Boston", "John", 150.54);

        bank.addCustomerTransaction("Providence", "Bob", 47.00);
        bank.addCustomerTransaction("Providence", "Mary", 47.00);
        bank.addCustomerTransaction("Boston", "John", 47.00);

        bank.listCutomers("Providence", false);
        bank.listCutomers("Boston", true);

        if(!bank.addCustomer("Portland", "ALex", 50.00)) {
            System.out.println("Error Branch Portland does not exist");
        }

        if(!bank.addBranch("Boston")) {
            System.out.println("Error branch Boston already exists");
        }

        if(!bank.addCustomerTransaction("Boston", "Mark", 50.00)) {
            System.out.println("Error customer Mark does not exist");
        }

        if(!bank.addCustomer("Providence", "Bob", 50.00)) {
            System.out.println("Error customer Bob already exist");
        }

    }
}

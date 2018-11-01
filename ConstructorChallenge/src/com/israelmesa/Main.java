package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        //Constructor no parameters
        VipCustomer account1 = new VipCustomer();
        System.out.println("Name: " + account1.getName() + ", Credit Limit: " + account1.getCreditLimit() + ", email: " + account1.getEmail());

        //Constructor one default parameters
        VipCustomer account2 = new VipCustomer("Harry",3000);
        System.out.println("Name: " + account2.getName() + ", Credit Limit: " + account2.getCreditLimit() + ", email: " + account2.getEmail());

        //Constructor with parameters
        VipCustomer account3 = new VipCustomer("John",3000, "john@gmail.com");
        System.out.println("Name: " + account3.getName() + ", Credit Limit: " + account3.getCreditLimit() + ", email: " + account3.getEmail());
    }
}

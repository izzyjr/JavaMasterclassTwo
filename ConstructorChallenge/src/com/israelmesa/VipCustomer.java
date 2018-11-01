package com.israelmesa;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("customer", 5000, "customer@gmail.com");
        System.out.println("Constructor - all default parameters");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "customer@gmail.com");
        System.out.println("Constructor - one default parameters");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        System.out.println("Constructor - with parameters");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

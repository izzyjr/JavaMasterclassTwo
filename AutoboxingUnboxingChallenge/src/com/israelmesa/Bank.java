package com.israelmesa;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branches> branchesList;

    public Bank(String name, ArrayList<Branches> branchesList) {
        this.name = name;
        this.branchesList = new ArrayList<Branches>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branches> getBranchesList() {
        return branchesList;
    }
}

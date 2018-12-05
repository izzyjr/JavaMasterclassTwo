package com.israelmesa;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branches> branchesList;

    public Bank(String name) {
        this.name = name;
        this.branchesList = new ArrayList<Branches>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branches> getBranchesList() {
        return branchesList;
    }

    private int findBranch(Branches branches) {
        return this.branchesList.indexOf(branches);
    }

    private int findBranchByName(String cityName) {
        int position = -1;
        for (int i = 0; i < branchesList.size(); i++) {
            if(this.branchesList.get(i).getCityBranch().equals(cityName)) {
                position = i;
            }
        }
        return position;
    }

    public Branches queryBranches(String cityName) {
        int position = findBranchByName(name);
        if(position >= 0) {
            return this.branchesList.get(position);
        }
        return null;
    }

    public void listCustomers() {
        System.out.println("List of Branches");
        for (int i = 0; i < branchesList.size(); i++) {
            System.out.println((i + 1) + ": " + branchesList.get(i).getCityBranch());
        }
    }

}

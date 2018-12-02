package com.israelmesa;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> phoneList;

    public MobilePhone(ArrayList<Contacts> phoneList) {
        this.phoneList = phoneList;
    }

    public void storeContact(String name, String phoneNumber) {
        Contacts contact = new Contacts(name, phoneNumber);
        phoneList.add(contact);
    }
}

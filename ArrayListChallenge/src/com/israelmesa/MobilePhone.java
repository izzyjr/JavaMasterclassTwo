package com.israelmesa;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> phoneList = new ArrayList<Contacts>();

    public int findContact(String contactName) {

        int contactPosition = -1;

        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().compareTo(contactName) == 0) {
                contactPosition = i;
            }
        }

        if (contactPosition < 0) {
            System.out.println("Name not found");
        }

        return contactPosition;

    }

    public void storeContact(String name, String phoneNumber) {
        Contacts contact = new Contacts(name, phoneNumber);
        phoneList.add(contact);
    }


}

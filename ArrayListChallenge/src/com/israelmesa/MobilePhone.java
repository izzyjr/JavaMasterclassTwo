package com.israelmesa;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> phoneList = new ArrayList<Contacts>();

    public ArrayList<Contacts> getPhoneList() {
        return phoneList;
    }

    public int findContact(String contactName) {

        int contactPosition = -1;

        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().compareTo(contactName) == 0) {
                contactPosition = i;
            }
        }

        if (contactPosition < 0) {
            System.out.println(contactPosition);
            System.out.println("Name not found");
        }

        return contactPosition;

    }

    public void storeContact(String name, String phoneNumber) {
        Contacts contact = new Contacts(name, phoneNumber);
        phoneList.add(contact);
    }

    public void modifyContact(String contactName, String newName, String newNumber) {
        int position = findContact(contactName);
        Contacts contact = new Contacts(newName, newNumber);
        phoneList.set(position, contact);
    }

    public void removeContact(String contactName) {
        int position = findContact(contactName);
        phoneList.remove(position);
    }

    public String getNameContact(String name) {
        return getPhoneList().get(findContact(name)).getName();
    }

    public String getPhoneNumberContact(String phoneNumber) {
        return getPhoneList().get(findContact(phoneNumber)).getPhoneNumber();
    }

    public Boolean contactExists(String name) {
        Boolean exists;
        if (findContact(name) >= 0) {
            exists = true;
            System.out.println("Contact " + getNameContact(name) + " exists.");
        } else {
            exists = false;
            System.out.println("Contact " + name + " does not exist");
        }
        return exists;
    }

    public void printMobileContactList() {
        System.out.println("You have " + getPhoneList().size() + " contacts in your Mobile Phone");
        for(int i=0; i< getPhoneList().size(); i++) {
            System.out.println((i+1) + ". " + getPhoneList().get(i).getName());
        }
    }


}

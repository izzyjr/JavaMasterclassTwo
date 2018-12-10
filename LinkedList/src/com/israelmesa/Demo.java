package com.israelmesa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVistit = new LinkedList<String>();
        addInorder(placesToVistit, "Sydney");
        addInorder(placesToVistit, "Melbourne");
        addInorder(placesToVistit, "Brisbane");
        addInorder(placesToVistit, "Perth");
        addInorder(placesToVistit, "Canberra");
        addInorder(placesToVistit, "Adelaide");
        addInorder(placesToVistit, "Darwin");
        printList(placesToVistit);

        

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInorder(LinkedList<String> linkedListParam, String newCity) {
        ListIterator<String> stringListIterator = linkedListParam.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal - do not add
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if (comparison > 0) {
                // newCity = should appear before this one
                // Brisbanse -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}

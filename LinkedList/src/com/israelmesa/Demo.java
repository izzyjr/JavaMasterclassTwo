package com.israelmesa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

        addInorder(placesToVistit, "Alice Springs");
        addInorder(placesToVistit, "Darwin");
        printList(placesToVistit);
        visit(placesToVistit);

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

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator  = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenarary");
            return;
        } else{
            System.out.println("No visiting: " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday vacation over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting: " + listIterator.previous());
                    } else {
                        System.out.println("We are the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                            "1 - go to next city\n" +
                            "2 - go to previous city\n" +
                            "3 - print menu options");
    }
}

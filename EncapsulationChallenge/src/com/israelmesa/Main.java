package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(true);
        System.out.println("Toner is at " + printer.getTonerPercentage());
        printer.printPages(57);
        System.out.println("Toner is at " + printer.getTonerPercentage());
        printer.refillToner();


    }
}

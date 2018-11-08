package com.israelmesa;

public class Printer {

    private int tonerPercentage = 100;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(boolean duplex) {
        this.tonerPercentage = tonerPercentage;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void refillToner() {

        if (tonerPercentage == 100) {
            System.out.println("Toner is currently at " + tonerPercentage + "%");
        } else if (tonerPercentage < 100){
            tonerPercentage += (100 - tonerPercentage);
        }

        System.out.println("Toner has been filled to " + tonerPercentage + "%");

    }

    public void printPages(int pagesNeeded) {

        tonerPercentage -= pagesNeeded;

        if(duplex) {

            int evenOrOdd = pagesNeeded % 2;

            if(evenOrOdd == 0) {
                pagesPrinted += (pagesNeeded / 2);
                System.out.println(pagesPrinted + " double sided - pages printed");
            } else {
                pagesPrinted += ((pagesNeeded - 1) / 2) + 1;
                System.out.println(pagesPrinted - 1 + " double sided, 1 single side - pages printed");
            }


        } else {
            pagesPrinted += pagesNeeded;
            System.out.println(pagesPrinted + " single side pages have been printed");
        }
    }

    public int getTonerPercentage() {
        return tonerPercentage;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}

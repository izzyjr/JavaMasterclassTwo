package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567);

        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();

        System.out.println("**************************************************");

        timsPhone = new MobilePhone(2345671);
//        timsPhone.powerOn();
        timsPhone.callPhone(2345671);
        timsPhone.answer();


    }
}

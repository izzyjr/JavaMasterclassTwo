package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567);

        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();


    }
}

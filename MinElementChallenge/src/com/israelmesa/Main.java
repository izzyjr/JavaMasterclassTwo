package com.israelmesa;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Array lenght: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        findMin(array);


    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();

        }

        return array;

    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= min) {

                min = array[i];

            }

        }

        System.out.println("Min: " + min);

        return min;

    }

}

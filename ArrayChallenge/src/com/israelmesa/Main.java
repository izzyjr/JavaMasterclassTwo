package com.israelmesa;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    int[] mustSortArray = getIntegers(5);
    sortArray(mustSortArray);
    printArray(mustSortArray);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.println("#" + (i + 1) + ": " + array[i]);
        }

    }

    public static int[] sortArray(int[] array) {

        int temp;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (j + 1 < array.length) {

                    if (array[j] < array[j + 1]) {

                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                    }

                }

            }

        }
        return array;
    }

//    public static int[] sortArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
//
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//
//        boolean flag = true;
//        int temp;
//        while(flag) {
//            flag = false;
//
//            for(int i=0; i<sortedArray.length-1; i++) {
//                if(sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
//
//        return sortedArray;
//    }


}

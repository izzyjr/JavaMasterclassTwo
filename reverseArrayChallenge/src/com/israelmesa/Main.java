package com.israelmesa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));

    }

    public static void reverse(int[] array) {

        int temp;
        int count = 0;

        for (int i = array.length - 1; i >= (array.length / 2) ; i--) {

            temp = array[count];
            array[count] = array[i];
            array[i] = temp;
            count++;

        }

    }

}

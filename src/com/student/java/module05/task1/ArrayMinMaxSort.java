package com.student.java.module05.task1;

public class ArrayMinMaxSort {

    public static String getMax(int[] myArray) {

        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {

            if (max < myArray[i])

            {
                max = myArray[i];
            }
        }

        return "Max number is: " + max;
    }

    public static String getMin(int[] myArray) {

        int min = myArray[0];

        for (int i = 0; i < myArray.length; i++) {

            if (min > myArray[i])

            {
                min = myArray[i];
            }
        }

        return "Min number is: " + min;

    }

    public static void sortArray(int[] array){

        boolean swap = true;

        while (swap){

            swap = false;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {

                    int temp = array[i];


                    array[i] = array[i + 1];

                    array[i + 1] = temp;

                    swap = true;

                }
            }
        }

        System.out.println("Sort results:");

        for (int elem : array){

            System.out.println(elem);
        }

    }





}

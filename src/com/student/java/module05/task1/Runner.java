package com.student.java.module05.task1;

public class Runner {

    public static void main(String[] args){

        int [] arg = {3,7,34,51,9,1,2,5,63,24};

        System.out.println(ArrayMinMaxSort.getMax(arg));

        System.out.println(ArrayMinMaxSort.getMin(arg));

        ArrayMinMaxSort.sortArray(arg);

    }

}

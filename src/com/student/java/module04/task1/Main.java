package com.student.java.module04.task1;

    public class Main {

    public static void main (String[] args){

        Shape areaRectengle = new AreaRectangle(2, 5);
        System.out.println(areaRectengle.geometricCalculator());

        Shape areaCircle = new AreaСircle(20);
        System.out.println(areaCircle.geometricCalculator());

        Shape areaTriangle = new AreaTriangle(2, 7);
        System.out.println(areaTriangle.geometricCalculator());
    }

}

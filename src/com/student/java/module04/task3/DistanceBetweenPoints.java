package com.student.java.module04.task3;

public class DistanceBetweenPoints {

    public static double calculate(Point point1, Point point2){

        return Math.sqrt((Math.pow((point2.getX()-point1.getX()), 2) + Math.pow((point2.getY()-point1.getY()), 2)));

    }
}

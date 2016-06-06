package com.student.java.module04.task2;

public class TemperatureCalculator {

    public static double convertToCelsium(double farengeitDegree){

        return ((farengeitDegree - 32)*5/9);
    }

    public static double convertToFarangeit(double celsiumDegree){

        return (celsiumDegree * (9/5) + 32);

    }

}

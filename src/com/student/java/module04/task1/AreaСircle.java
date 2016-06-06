package com.student.java.module04.task1;

public class AreaСircle implements Shape {

    public static final double pi= 3.14;
    private float rad;

    public AreaСircle(float rad) {
        this.rad = rad;
    }

    public float getRad() {
        return rad;
    }

    public void setRad(float rad) {
        this.rad = rad;
    }

    @Override
    public double geometricCalculator() {
        return pi*(rad*rad);
    }

}

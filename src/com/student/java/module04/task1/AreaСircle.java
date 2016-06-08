package com.student.java.module04.task1;

public class AreaСircle extends Shape {

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
    public double getArea() {
        return Math.PI*(rad*rad);
    }

}

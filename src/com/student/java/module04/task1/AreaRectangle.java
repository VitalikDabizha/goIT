package com.student.java.module04.task1;

public class AreaRectangle extends Shape {

    private double a;

    private double b;

    public AreaRectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}

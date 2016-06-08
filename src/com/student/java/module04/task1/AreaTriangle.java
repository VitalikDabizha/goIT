package com.student.java.module04.task1;

public class AreaTriangle extends Shape {

   private double a;

   private double h;

    public AreaTriangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5*(a*h);
    }
}

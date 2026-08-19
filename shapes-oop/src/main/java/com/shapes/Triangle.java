package com.shapes;

public class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        super("Triangle");

        if (!isValid(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle side lengths.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValid(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2; // semiperimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String describe() {
        return super.describe() + "(" + a + ", " + b + ", " + c + ")";
    }
}

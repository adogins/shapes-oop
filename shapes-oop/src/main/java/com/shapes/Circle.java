package com.shapes;

/**
 * Represents a circle defined by it's radius.
 * 
 * Area formula: pi * r^2
 * Perimeter (circumference): 2 * pi * r
 */
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Circle");

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String describe() {
        return super.describe() + "(radius = " + radius + ")";
    }
}

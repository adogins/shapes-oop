package com.shapes;

/**
 * Represents a rectangle defined by width or height.
 */
public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Rectangle");

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Demensions must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String describe() {
        return super.describe() + "width= " + ". height= " + height + ")";
    }
}

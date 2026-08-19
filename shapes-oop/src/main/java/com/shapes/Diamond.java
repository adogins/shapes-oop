package com.shapes;

/**
 * Represents a diamond (rhombus), defined by:
 * - side length
 * - two diagonals
 * 
 * Area formula: (d1 * d2) / 2
 * Perimeer: 4 * side
 */
public class Diamond extends Shape {

    private final double side;
    private final double diagonal1;
    private final double diagonal2;

    public Diamond(double side, double diagonal1, double diagonal2) {
        super("Diamond");

        if (side <= 0 || diagonal1 <= 0 || diagonal2 <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive.");
        }

        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea() {
        return (diagonal1 * diagonal2) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String describe() {
        return super.describe() + "(side= " + side + ", d1= " + diagonal1 + ", d2= " + diagonal2 + ")";
    }
}

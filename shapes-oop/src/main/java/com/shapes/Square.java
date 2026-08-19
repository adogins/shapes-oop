package com.shapes;

/**
 * Represents a square, which is a special case of a rectangle
 * where width and height are equal.
 */
public class Square extends Rectangle {
    private final double side;

    /**
     * Creates a new Square.
     * 
     * @param side length of each side, must be positive
     */
    public Square(double side) {
        super(side, side); // Rectangle constructor handles validation
        this.side = side;
    }

    @Override
    public String describe() {
        return "Square(side= " + side + ")";
    }
}

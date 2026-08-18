package com.shapes;

/**
 * Abstract base class for all geometric shaes.
 * Every shape has a name and must implement area/perimeter.
 */

public abstract class Shape {
    /** Name of the shape (e.g., "Circle", "Rectangle", "Triangle") */
    protected final String name;

    /**
     * Base constructor for all shapes.
     * 
     * @param name descriptive name of the shape
     */
    protected Shape(String name) {
        this.name = name;
    }

    /** @return the area of the shape */
    public abstract double getArea();

    /** @return the perimeter of the shape */
    public abstract double getPerimeter();

    /** @return human-readble description */
    public String describe() {
        return name;
    }
}

package com.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void testArea() {
        // 3-4-5 triangle (area should be 6)
        Triangle t = new Triangle(3, 4, 5);
        assertEquals(6.0, t.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals(12.0, t.getPerimeter());
    }

    @Test
    void testInvalidSidesNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1, 4, 5));
    }

    @Test
    void testInvalidSidesZero() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 4, 5));
    }

    @Test
    void testInvalidTriangleInequality() {
        // 1 + 2 is NOT greater than 10
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 10));
    }

    @Test
    void testDescribe() {
        Triangle t = new Triangle(3, 4, 5);
        String desc = t.describe();

        assertTrue(desc.contains("Triangle"));
        assertTrue(desc.contains("3"));
        assertTrue(desc.contains("4"));
        assertTrue(desc.contains("5"));
    }
}

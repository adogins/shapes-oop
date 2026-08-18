package com.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    void testArea() {
        Circle c = new Circle(2);
        assertEquals(Math.PI * 4, c.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        Circle c = new Circle(2);
        assertEquals(2 * Math.PI * 2, c.getPerimeter(), 0.0001);
    }

    @Test
    void testInvalidRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }

    @Test
    void testDescribe() {
        Circle c = new Circle(2);
        assertTrue(c.describe().contains("Circle"));
    }
}

package com.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void testArea() {
        Square s = new Square(5);
        assertEquals(25.0, s.getArea());
    }

    @Test
    void testPerimeter() {
        Square s = new Square(5);
        assertEquals(20.0, s.getPerimeter());
    }

    @Test
    void testInvalidSide() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0));
    }

    @Test
    void testDescribe() {
        Square s = new Square(5);
        assertTrue(s.describe().contains("Square"));
        assertTrue(s.describe().contains("5"));
    }
}

package com.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void testArea() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(12, r.getArea());
    }

    @Test
    void testPerimeter() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(14, r.getPerimeter());
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 4));
    }

    @Test
    void testDescribe() {
        Rectangle r = new Rectangle(3, 4);
        assertTrue(r.describe().contains("Rectangle"));
    }
}

package com.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiamondTest {
    @Test
    void testArea() {
        // diagonals 6 and 8: area = (6 * 8) / 2 = 24
        Diamond d = new Diamond(5, 6, 8);
        assertEquals(24.0, d.getArea());
    }

    @Test
    void testPerimeter() {
        Diamond d = new Diamond(5, 6, 8);
        assertEquals(20.0, d.getPerimeter());
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Diamond(0, 6, 8));
        assertThrows(IllegalArgumentException.class, () -> new Diamond(5, -1, 8));
        assertThrows(IllegalArgumentException.class, () -> new Diamond(5, 6, -2));
    }

    @Test
    void testDescribe() {
        Diamond d = new Diamond(5, 6, 8);
        String desc = d.describe();

        assertTrue(desc.contains("Diamond"));
        assertTrue(desc.contains("5"));
        assertTrue(desc.contains("6"));
        assertTrue(desc.contains("8"));
    }
}

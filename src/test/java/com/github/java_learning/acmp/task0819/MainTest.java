package com.github.java_learning.acmp.task0819;

import org.junit.jupiter.api.Test;

import static com.github.java_learning.acmp.task0819.Main.getD;
import static com.github.java_learning.acmp.task0819.Main.getE;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    public void testgetE() {
        long e = getE(1, 1, 1);
        long f = getE(60, 70, 907);
        long h = getE(-40, -59, -5);
        assertEquals(1.0, e, 0.00001);
        assertEquals(3809400.0, f, 0.00001);
        assertEquals(-11800.0, h, 0.00001);
    }

    @Test
    public void testgetD() {
        long d = getD(1, 1, 1);
        long g = getD(60, 70, 907);
        long i = getD(-40, -59, -5);
        assertEquals(6.0, d, 0.00001);
        assertEquals(244220.0, g, 0.00001);
        assertEquals(5710.0, i, 0.00001);
    }
}
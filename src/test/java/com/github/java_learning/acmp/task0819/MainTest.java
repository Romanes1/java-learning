package com.github.java_learning.acmp.task0819;

import org.junit.jupiter.api.Test;

import static com.github.java_learning.acmp.task0819.Main.GetD;
import static com.github.java_learning.acmp.task0819.Main.GetE;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
        @Test
    public void testGetE(){
        long e = GetE(1,1,1);
        assertEquals(1.0, e, 0.00001);
        }
            @Test
            public void testGetD() {
                long d = GetD(1, 1, 1);
                assertEquals(6.0, d, 0.00001);

            }
}
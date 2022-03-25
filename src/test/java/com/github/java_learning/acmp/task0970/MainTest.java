package com.github.java_learning.acmp.task0970;

import org.junit.jupiter.api.Test;

import static com.github.java_learning.acmp.task0970.Main.aPlusBequalsC;
import static org.junit.jupiter.api.Assertions.*;


    public class MainTest{
        
        @Test
        public void testaPlusBequalsC(){
            String d = aPlusBequalsC(3, 5, 2);
             assertEquals("YES", d);
            String e = aPlusBequalsC(2, 2, 5);
            assertEquals("NO", e);
        }

    }


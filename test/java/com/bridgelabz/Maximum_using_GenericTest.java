package com.bridgelabz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_using_GenericTest {

    @Test
    public void testMaxInteger() {
        Maximum_using_Generic<Integer> int_max = new Maximum_using_Generic<>(10, 20, 30, 40, 50, 60);
        assertEquals(60, int_max.testMaximum());
    }
        @Test
        public void testMaximumFloat() {
            Maximum_using_Generic<Float> floatMax = new Maximum_using_Generic<>(10.5f, 12.3f, 9.7f, 14.5f);
            assertEquals(14.5f, floatMax.testMaximum());
        }

        @Test
        public void testMaximumString() {
            Maximum_using_Generic<String> stringMax = new Maximum_using_Generic<>("Banana", "Peach", "Apple", "Mango");
            assertEquals("Peach", stringMax.testMaximum());
        }
    }

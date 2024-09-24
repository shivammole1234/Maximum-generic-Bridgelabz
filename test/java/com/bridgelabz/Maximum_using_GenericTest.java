package com.bridgelabz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_using_GenericTest {

    @Test
    public void testMaximumIntegerFirst() {
        Maximum_using_Generic<Integer> intMax = new Maximum_using_Generic<>(90, 12, 10);
        assertEquals(90, intMax.testMaximum());
    }

    @Test
    public void testMaximumIntegerSecond() {
        Maximum_using_Generic<Integer> intMax = new Maximum_using_Generic<>(10, 90, 30);
        assertEquals(90, intMax.testMaximum());
    }

    @Test
    public void testMaximumIntegerThird() {
        Maximum_using_Generic<Integer> intMax = new Maximum_using_Generic<>(10, 20, 90);
        assertEquals(90, intMax.testMaximum());
    }

    @Test
    public void testMaximumFloatSecond() {
        Maximum_using_Generic<Float> floatMax = new Maximum_using_Generic<>(10.1f, 12.5f, 9.9f);
        assertEquals(12.5f, floatMax.testMaximum());
    }

    @Test
    public void testMaximumFloatThird() {
        Maximum_using_Generic<Float> floatMax = new Maximum_using_Generic<>(10.1f, 10.2f, 12.5f);
        assertEquals(12.5f, floatMax.testMaximum());
    }

    @Test
    public void testMaximumStringFirst(){
        Maximum_using_Generic<String> stringMax=new Maximum_using_Generic<>("Peach","Apple","Banana");
        assertEquals("Peach",stringMax.testMaximum());
    }

    @Test
    public void testMaximumStringSecond() {
        Maximum_using_Generic<String> stringMax = new Maximum_using_Generic<>("Apple", "Peach", "Banana");
        assertEquals("Peach", stringMax.testMaximum());
    }

    @Test
    public void testMaximumStringThird() {
        Maximum_using_Generic<String> stringMax = new Maximum_using_Generic<>("Apple", "Banana", "Peach");
        assertEquals("Peach", stringMax.testMaximum());
    }

}
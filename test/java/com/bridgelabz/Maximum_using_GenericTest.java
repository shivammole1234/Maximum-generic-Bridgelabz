package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_using_GenericTest {

    Maximum_using_Generic maxi1=new Maximum_using_Generic();

    @Test
    public void testMaximumAtFirstPosition(){
        Integer num1=12,num2=3,num3=9;
        assertEquals(num1,maxi1.find_max(num1,num2,num3),"Maximum number should be at first position");

    }

    @Test
    public void testMaxiAtSecondPosition(){
        Integer num1=5,num2=10,num3=3;
        assertEquals(num2,maxi1.find_max(num1,num2,num3),"Max should be at osition second");
    }

    @Test
    public void testMaxiAtThirdPosition(){
        Integer num1=5,num2=10,num3=30;
        assertEquals(num3,maxi1.find_max(num1,num2,num3),"Max should be at osition Third");
    }

    @Test
    public void testMaximumAtFirstPositionFloat(){
        Float num1=12.2f,num2=3.1f,num3=9.3f;
        assertEquals(num1,maxi1.find_max(num1,num2,num3),"Maximum number should be at first position");

    }

    @Test
    public void testMaxiAtSecondPositionFloat(){
        Float num1=11.2f,num2=13.1f,num3=3.3f;
        assertEquals(num2,maxi1.find_max(num1,num2,num3),"Max should be at osition second");
    }

    @Test
    public void testMaxiAtThirdPositionFloat(){
        Float num1=10.2f,num2=23.1f,num3=29.3f;
        assertEquals(num3,maxi1.find_max(num1,num2,num3),"Max should be at osition Third");
    }


}
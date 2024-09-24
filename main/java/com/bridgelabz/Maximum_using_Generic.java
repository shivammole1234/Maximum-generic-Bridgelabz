package com.bridgelabz;
import java.util.Arrays;

public class Maximum_using_Generic<T extends Comparable<T>> {

    private T[] values;

    public Maximum_using_Generic(T... values){
        this.values=values;
    }

    public T testMaximum(){
        return Find_max_Gen(values);
    }

    // private method to find the maximum of three comparable values
    private static  <T extends Comparable<T>> T Find_max_Gen(T... values)
    {
        Arrays.sort(values);
        return values[values.length-1];
    }

    public static void main(String[] args) {

        Maximum_using_Generic<Integer> int_max=new Maximum_using_Generic<>(10,11,12,13,14,15);
        System.out.println("Maximum element is :- "+int_max.testMaximum());

        Maximum_using_Generic<String> string_max=new Maximum_using_Generic<>("Banana","Peach","Apple");
        System.out.println("Maximum String is :- "+string_max.testMaximum());
    }
}

package com.bridgelabz;
import java.util.Arrays;

public class Maximum_using_Generic<T extends Comparable<T>> {

    private T[] values;

    public Maximum_using_Generic(T... values){
        this.values=values;
    }

    public T testMaximum(){
        T max = Find_max_Gen(values);
        printMax(max);
        return max;
    }

    // private method to find the maximum of three comparable values
    private static  <T extends Comparable<T>> T Find_max_Gen(T... values)
    {
        Arrays.sort(values);
        return values[values.length-1];
    }

    private void printMax(T max){
        System.out.println("Maximum valueis :- "+max);
    }


    public static void main(String[] args) {

        Maximum_using_Generic<Integer> intMax = new Maximum_using_Generic<>(10, 20, 90, 45, 67);
        intMax.testMaximum();

        Maximum_using_Generic<Float> floatMax = new Maximum_using_Generic<>(10.5f, 12.3f, 9.7f, 14.5f);
        floatMax.testMaximum();

        Maximum_using_Generic<String> stringMax = new Maximum_using_Generic<>("Banana", "Peach", "Apple", "Mango");
        stringMax.testMaximum();
    }
}

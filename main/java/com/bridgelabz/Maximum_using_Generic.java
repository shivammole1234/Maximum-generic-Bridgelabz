package com.bridgelabz;


public class Maximum_using_Generic<T extends Comparable<T>> {

    private T first;
    private T second;
    private T third;

    public Maximum_using_Generic(T first,T second,T third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }

    // Method to find the maximum of the three variables
    public T testMaximum(){
        return Find_max_Gen(first,second,third);
    }
        // private method to find the maximum of three comparable values
    private <T extends Comparable<T>> T Find_max_Gen(T val1,T val2,T val3)
    {

            T max=val1;

            if(val2.compareTo(max)>0)
                max=val2;

            if(val3.compareTo(max)>0)
                max=val3;

            return max;
        }


    public static void main(String[] args) {


        Maximum_using_Generic<String> stringMax2 = new Maximum_using_Generic<>("Banana", "Peach", "Apple");
        System.out.printf("Maximum of '%s', '%s', '%s' is: '%s'%n", "Banana", "Peach", "Apple", stringMax2.testMaximum());

        // Test with Integer values
        Maximum_using_Generic<Integer> intMax = new Maximum_using_Generic<>(10, 12, 90);
        System.out.printf("Maximum of %d, %d, %d is: %d%n", 10, 12, 90, intMax.testMaximum());

        // Test with Float values
        Maximum_using_Generic<Float> floatMax = new Maximum_using_Generic<>(10.5f, 12.3f, 9.7f);
        System.out.printf("Maximum of %.2f, %.2f, %.2f is: %.2f%n", 10.5f, 12.3f, 9.7f, floatMax.testMaximum());

        // Test with String values
        Maximum_using_Generic<String> stringMax = new Maximum_using_Generic<>("Apple", "Peach", "Banana");
        System.out.printf("Maximum of '%s', '%s', '%s' is: '%s'%n", "Apple", "Peach", "Banana", stringMax.testMaximum());

    }
}

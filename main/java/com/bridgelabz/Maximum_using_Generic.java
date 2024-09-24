package com.bridgelabz;


public class Maximum_using_Generic {

    public static  Integer find_max(Integer num1,Integer num2,Integer num3)
    {
        Integer max=num1;

        if(num2.compareTo(max)>0)
            max=num2;

        if(num3.compareTo(max)>0)
            max=num3;

        return max;
    }

    public static Float find_max(Float num1,Float num2,Float num3){

        Float max=num1;

        if(num2.compareTo(max)>0)
            max=num2;
        if(num3.compareTo(max)>0)
            max=num3;

        return max;
    }

    public static String find_max(String str1, String str2,String str3){

        String max =str1;

        if(str2.compareTo(max)>0)
            max=str2;

        if(str3.compareTo(max)>0)
            max=str3;


        return max;
    }

    //method using generic
    public static <T extends Comparable<T>> T findMax(T val1,T val2,T val3){

        T max =val1;
        if(val2.compareTo(max)>0)
            max=val2;

        if(val3.compareTo(max)>0)
            max=val3;

        return max;
    }

    public static void main(String[] args) {

        Integer num1=10,num2=12,num3=90;
        System.out.printf("Maximum of %d %d %d is :- %d",num1,num2,num3,find_max(num1,num1,num3));

        Float result = find_max(10.5f, 5.2f, 3.3f);
        System.out.println("Maximum Float is :- " + result);

        String ans=find_max("Apple","Peach","Banana");
        System.out.println("Maximum for String :- " + ans);


        // Test with Integer values
        Integer n1 = 10, n2 = 12, n3 = 90;
        Integer maxInt = findMax(num1, num2, num3);
        System.out.printf("Maximum of %d, %d, %d is: %d%n", num1, num2, num3, maxInt); // Expected output: 90

        // Test with Float values
        Float float1 = 10.5f, float2 = 12.3f, float3 = 9.7f;
        Float maxFloat = findMax(float1, float2, float3);
        System.out.printf("Maximum of %.2f, %.2f, %.2f is: %.2f%n", float1, float2, float3, maxFloat); // Expected output: 12.3

        // Test with String values
        String str1 = "Apple", str2 = "Peach", str3 = "Banana";
        String maxString = findMax(str1, str2, str3);
        System.out.printf("Maximum of '%s', '%s', '%s' is: '%s'%n", str1, str2, str3, maxString); // Expected output: Peach




    }
}

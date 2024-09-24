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

    public static void main(String[] args) {

        Integer num1=10,num2=12,num3=90;
        System.out.printf("Maximum of %d %d %d is :- %d",num1,num2,num3,find_max(num1,num1,num3));

        Float result = find_max(10.5f, 5.2f, 3.3f);
        System.out.println("Maximum Float is :- " + result);
    }
}

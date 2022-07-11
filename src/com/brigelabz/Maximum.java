package com.brigelabz;


import java.util.Arrays;

public class Maximum {

    public static <T> T testCase(T... a){
        Arrays.sort(a);
        return a[a.length -1];
    }

    public static void main(String[] args) {
        System.out.println("Maximum among all integer values is :" + testCase(1,23,54,78,66));
        System.out.println("Maximum among all float values is :" + testCase(2.4f,5.4f,999.8f,5.7f,4.5f));
        System.out.println("Maximum among all string values is :" + testCase("Similar","Family","Sheelvant","Raviraj","Bhagya"));

    }
}


package com.brigelabz;


import java.util.Scanner;

public class Maximum {
                      public static void main(String[] args) {
        System.out.println("Welcome To Maximum Number Program");
        Maximum maximum = new Maximum();
        System.out.println("Maximum number among three integer numbers is : " + maximum.compareTo());
                      }

    // compareTo method check the maximum number among three numbers and return it :-
    public float compareTo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        float number1 = scanner.nextFloat();

        System.out.println("Enter second number");
        float number2 = scanner.nextFloat();

        System.out.println("Enter third number");
        float number3 = scanner.nextFloat();
        float maximum = number1;

        if (number1 > number2 && number1 > number3) {
            maximum = number1;
        } else if (number2 > number1 && number2 > number3) {
            maximum = number2;

        } else {
            maximum = number3;
        }
        return maximum;
    }
}



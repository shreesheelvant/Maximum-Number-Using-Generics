package com.brigelabz;

public class Maximum {
    
        public static <T extends Comparable> T testcase(T a, T b, T c) {
            T max = a;
            if (b.compareTo(max) > 0) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;
        }

        public static void main(String[] args) {
            System.out.println("Welcome to Maximum number program");
            System.out.println("Maximum Among three integer values is:" + testcase(2, 5, 8));
            System.out.println("Maximum Among three float values is:" + testcase(2.5f, 5.5f, 8.9f));
            System.out.println("Maximum Among three string values is:" + testcase("Bhagyashree", "Basavaraj", "Aishwarya"));
        }
    }



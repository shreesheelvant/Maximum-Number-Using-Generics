package com.brigelabz;
import java.util.Arrays;

    public class Maximum<T> {

        public T testCase(T... a) {
            Arrays.sort(a);
            T max = a[a.length - 1];
            printMax(max);
            return max;
        }

        private void printMax(T max) {
            System.out.println(max);

        }

        public static void main(String[] args) {
            Maximum<Integer> maximumInteger = new Maximum<>();
            Maximum<Float> maximumFloat = new Maximum<>();
            Maximum<String> maximumString = new Maximum<>();
            maximumInteger.testCase(28, 19, 54, -2, 8, 7, 87, 75);
            maximumFloat.testCase(3.9f, 9.8f, 76.6f, 87.6f, 69.8f, 5.7f, 4.5f);
            maximumString.testCase("Apple", "Oranges", "Banana", "Pineapple", "Grapes");

        }
    }



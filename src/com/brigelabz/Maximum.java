package com.brigelabz;
class Generic<T extends Comparable> {
    private T a;
    private T b;
    private T c;

    public Generic(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testCase() {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;

    }
}

public class Maximum {

    public static void main(String[] args) {
        System.out.println("Welcome to maximum number program !");
        Generic<Integer> generic1 = new Generic<>(10, 5, 9);
        Generic<Float> generic2 = new Generic<>(10.6f, 5.7f, 109.8f);
        Generic<String> generic3 = new Generic<>("Apple", "Orange", "Pineapple");
        System.out.println("Maximum among three integer values is :" + generic1.testCase());
        System.out.println("Maximum among three float values is :" + generic2.testCase());
        System.out.println("Maximum among three string values is :" + generic3.testCase());

    }
}




package com.test;

public class Test {
    public static void main(String[] args) {
        log(new int[]{1,2,3,4});
    }

    public static void log(int[] number) {
        // O(1)
        System.out.println(number[0]);
    }
}

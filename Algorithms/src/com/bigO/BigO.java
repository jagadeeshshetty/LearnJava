package com.bigO;

public class BigO {
    public static void main(String[] args) {
        constant(new int[]{1,2,3,4});
    }

    public static void constant(int[] numbers) {
        // O(1) - CONSTANT
        System.out.println(numbers[0]);

        // O(n) - LINEAR
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}

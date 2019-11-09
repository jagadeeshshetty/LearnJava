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

        // O(n^2) - QUADRATIC
        for(int first: numbers) { // O(n)
            for (int second: numbers) { // O(n)
                System.out.println(first + ", " + second);
            }
        }

        // O(n^3) - CUBIC
        for(int first: numbers) { // O(n)
            for (int second: numbers) { // O(n)
                for (int third: numbers) {
                    System.out.println(first + ", " + second + ", " + third);
                }
            }
        }
    }
}

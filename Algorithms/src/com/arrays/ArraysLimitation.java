package com.arrays;

import java.util.Arrays;

/**
 * Limitation:
 * Once initialized, we can't add/remove an item from an array.
 *
 * Solution:
 * To achieve this, we need to use LinkedList algorithm.
 */
public class ArraysLimitation {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };
        System.out.println(Arrays.toString(numbers));
    }
}

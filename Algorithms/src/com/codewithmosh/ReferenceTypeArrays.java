package com.codewithmosh;

import java.util.Arrays;

public class ReferenceTypeArrays {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 2;
        numbers[2] = 4;
        System.out.println(numbers); // Prints memory address.
        System.out.println(Arrays.toString(numbers));

        // Arrays length is fixed.
        // We can't add or remove items from an array.
        // We need to use Collection class to add or remove items from an array.
        String[] companies = { "Apple", "Google", "Microsoft" };
        System.out.println("Length of an array: " + companies.length);

        // Unordered array
        int[] unorderedNumbers = {3, 4, 2, 1};
        System.out.println("Ordered array using sort(): ");
        Arrays.sort(unorderedNumbers);
        System.out.println(Arrays.toString(unorderedNumbers));
    }
}

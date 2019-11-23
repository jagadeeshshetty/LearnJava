package com.arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Starts...");
        CustomDynamicArray numbers = new CustomDynamicArray(3);
        numbers.print();
        numbers.insert(10); // 0
        numbers.insert(20); // 1
        numbers.insert(30); // 2
        numbers.insert(60); // 3
        numbers.insert(50); // 4
        numbers.insert(40); // 5
        numbers.print();
        numbers.removeAt(1);
        System.out.println("INFO: List after [1] index element remove.");
        numbers.print();
        System.out.println("Big number in an array: " + numbers.max());
        System.out.println("Small number in an array: " + numbers.min());

        /**
         * TBD
         * 2 - Extend the Array class and add a method to return the common items
         * in this array and another array.
         * Solution: Array.intersect()
         *
         * 3 - Extend the Array class and add a method to reverse the array. For
         * example, if the array includes [1, 2, 3, 4], after reversing and printing it,
         * we should see [4, 3, 2, 1].
         * Solution: Array.reverse()
         *
         * 4 - Extend the Array class and add a new method to insert an item at a
         * given index:
         * public void insertAt(int item, int index)
         * Solution: Array.insertAt()
         */
    }
}

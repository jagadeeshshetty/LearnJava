package com.arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Starts...");
        CustomDynamicArray numbers = new CustomDynamicArray(3);
        numbers.print();
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.print();
        System.out.println("Index of 1: " + numbers.indexOf(1));
        System.out.println("INFO: Removing item at 0 index");
        numbers.removeAt(0);
        numbers.print();
    }
}

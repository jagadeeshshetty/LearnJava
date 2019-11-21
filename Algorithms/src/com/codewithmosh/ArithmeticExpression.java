package com.codewithmosh;

public class ArithmeticExpression {
    public static void main(String[] args) {
        int a = 7, b = 2, c;
        System.out.println( a + b ); // Addition -> 9
        System.out.println( a - b ); // Subtraction -> 5
        System.out.println( a * b ); // Multiplication -> 14
        System.out.println( a / b ); // Division -> 3
        System.out.println((double) a / b); // Division with decimal -> 3.5

        System.out.println(a++); // Post increment -> 7
        System.out.println(++a); // Pre increment -> 9 (as 'a' incremented in previous step)

        System.out.println("Augmented or Compound assignment operator");
        c = a + 2; // Normal
        System.out.println(c);
        c += 2; // Augmented assignment
        System.out.println(c);
    }
}

package com.codewithmosh;

/**
 * Byte   - 1B
 * Char   - 2B
 * Short  - 2B
 * Int    - 4B
 * Long   - 8B
 * Float  - 4B
 * Double - 8B
 */
public class Casting {
    public static void main(String[] args) {
        short shortVar = 2;
        // Implicit casting: As short less than integer byte
        int result = shortVar + 2;
        System.out.println(result);

        // Explicit casting
        double doubleVar = 2.2F;
        int result2 = (int) doubleVar + 2; // decimal will discard
        System.out.println(result2);
        double result3 = doubleVar + 2; // Integer 2 implicitly converts to 2.0
        System.out.println(result3);

        // String to int
        // Using Integer() wrapper class we can convert string to integer
        String stringVar = "2";
        int result4 = Integer.parseInt(stringVar) + 2;
        System.out.println(result4);
    }
}

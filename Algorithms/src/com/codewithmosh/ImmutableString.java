package com.codewithmosh;

public class ImmutableString {
    public static void main(String[] args) {
        String message = " Hello ";
        System.out.println("Message: " + message);
        System.out.println("Message length: " + message.length());

        // String is immutable.
        // When replace() method called, it creates new string from original string.
        // Any method that modify the string object returns new string object.
        // Ex: 1
        System.out.println("Message replace: " + message.replace('l', '*'));
        // Ex: 2
        System.out.println("Message lowercase: " + message.toLowerCase());
        // Ex: 3
        System.out.println("Message trim: " + message.trim());

        System.out.println("Immutable Message: " + message);

        // Escape sequence
        System.out.println("\"\\\" is an escape character."); // escape
        System.out.println("c:\\Windows"); // escape
        System.out.println("c:\n\\Windows"); // newline
        System.out.println("c:\t\\Windows"); // tab

        // TBD
        // Explore with other string methods.
    }
}

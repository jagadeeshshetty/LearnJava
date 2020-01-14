package com.designPatterns.memento;

/**
 * Memento pattern helps to implement UNDO mechanism.
 * Let's build a code editor which supports UNDO mechanism.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Design Pattern - 'Memento'");
        Editor editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
//        editor.undo();
    }
}

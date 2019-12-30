package com.linkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class BuiltinLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(8);
        System.out.println("LinkedList: " + list);
        System.out.println("Size of LinkedList: " + list.size());
        System.out.println("LinkedList contains 10 ? " + list.contains(10));
        var array = list.toArray();
        System.out.println("LinkedList to Arrays: " + Arrays.toString(array));
    }
}

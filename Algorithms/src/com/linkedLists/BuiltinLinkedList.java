package com.linkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class BuiltinLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(10));
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}

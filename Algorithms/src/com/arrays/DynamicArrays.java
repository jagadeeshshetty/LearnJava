package com.arrays;

import java.util.ArrayList;
import java.util.Vector;

/**
 * There are two inbuilt dynamic array classes
 * 1. ArrayList<Integer> list = new ArrayList<>();
 * 2. Vector<Integer> list = new Vector<>();
 * <p>
 * Vector: BUSY
 * Grows 100% when full.
 * Synchronized (Only a single thread can access the methods)
 * Ex: If we have multi threaded app, where multiple threads need to
 * work with Vector collection then we can't use Vector class.
 * <p>
 * ArrayList:
 * Grows 50% when full.
 * Asynchronous
 */
public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2); // [0]
        arrayList.add(3); // [1]
        arrayList.add(4); // [2]
        arrayList.add(3); // [3]
        arrayList.add(4); // [4]
        System.out.println(arrayList);
        // [2, 3, 4, 3, 4]
        // [0, 1, 2, 3, 4]
        System.out.println("Index of 3 before remove of '0' index: " + arrayList.indexOf(3));
        arrayList.remove(0);
        System.out.println(arrayList);
        // [3, 4, 3, 4]
        // [0, 1, 2, 3]
        System.out.println("Index of 3 after remove of '0' index: " + arrayList.indexOf(3));
        System.out.println("Last index of 3 after remove of '0' index: " + arrayList.lastIndexOf(3));
        System.out.println("Contains 4 in the arrayList ? " + arrayList.contains(4));
        System.out.println("Size: " + arrayList.size());
        System.out.println("ArrayList to regular Array object: " + arrayList.toArray());

        Vector<Integer> vectorList = new Vector<>();
        vectorList.add(2);
        vectorList.add(3);
        vectorList.add(4);
        System.out.println(vectorList);
    }
}

package com.arrays;

/**
 * 1. Create an Array() constructor.
 * 2. Create a print() method.
 */
public class CustomDynamicArray {
    private int[] items;
    private int count;

    public CustomDynamicArray(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        // If the array is full, resize it.
        if ( items.length == count ) {
            // 1. Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // 2. Copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // 3. Set "items" to this new array
            items = newItems;
        }
        // Add the new item at the end.
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if ( index < 0 || index >= count )
            throw new IllegalArgumentException();
        // Shift the items to the left
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        // If we find item, return the index.
        // Otherwise return -1
        for (int i = 0; i < count; i++) {
            // If it's a first item, O(1)
            // If it's nth item, O(n)
            // So O(n) will be the run time complexity
            if (items[i] == item)
                return i;
        }
        return -1;
    }
}

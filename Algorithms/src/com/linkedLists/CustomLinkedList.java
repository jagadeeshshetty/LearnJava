package com.linkedLists;

public class CustomLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int item) {
            this.value = item;
        }
    }

    private Node first;
    private Node last;
    private Node node;

    // addLast
    public void addLast(int item) {
        node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            // add after the last node and link the last node to the new node.
            last.next = node;
            // update last to point to the new node.
            last = node;
        }
    }

    // addFirst
    public void addFirst(int item) {
        node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            // this.node should point to the first node.
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    // deleteFirst
    public void deleteFirst() {
    }

    // deleteLast
    public void deleteLast() {
    }

    // contains
    public boolean contains() {
        Boolean status = null;
        return status;
    }

    // indexOf
    public int indexOf() {
        int index = 0;
        return index;
    }
}

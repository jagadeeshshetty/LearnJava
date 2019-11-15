package com.codewithmosh;

import java.awt.*;
import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        // Ex: 2
        // Memory addr of Point(2,2) stores in point1 object.
        Point point1 = new Point(2, 2);
        // point2 store same memory address as point1
        Point point2 = point1;
        point1.x = 4;
        // Prints java.awt.Point[x=4,y=2]
        // x value updates as point1 stores a memory addr of Point(x, y)
        System.out.println(point2);

        // Ex: 1
        Date now = new Date();
        System.out.println(now);
    }
}

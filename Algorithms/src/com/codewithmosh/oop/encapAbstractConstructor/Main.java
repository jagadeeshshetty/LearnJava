package com.codewithmosh.oop.encapAbstractConstructor;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 10);
        int wage = employee.calculateWage(20);
        System.out.println(wage);
        wage = employee.calculateWage(); // overloaded method
        System.out.println(wage);
    }
}

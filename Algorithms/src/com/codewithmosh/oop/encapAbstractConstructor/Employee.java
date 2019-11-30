package com.codewithmosh.oop.encapAbstractConstructor;

// Encapsulation, Abstraction and Constructor
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Constructor
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    // Constructor overloading
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    // method overloading
    public int calculateWage() {
        return calculateWage(0);
    }

    // Abstraction
    private int getBaseSalary() {
        return baseSalary;
    }

    // Abstraction
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    // Abstraction
    private int getHourlyRate() {
        return hourlyRate;
    }

    // Abstraction
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
}

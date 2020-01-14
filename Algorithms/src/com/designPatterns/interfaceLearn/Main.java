package com.designPatterns.interfaceLearn;

public class Main {
    public static void main(String[] args) {
        TaxCalculator tax = getFiscalYear();
        System.out.println(tax.fiscalYear());
    }

    public static TaxCalculator getFiscalYear() {
        return new Tax2019();
    }
}

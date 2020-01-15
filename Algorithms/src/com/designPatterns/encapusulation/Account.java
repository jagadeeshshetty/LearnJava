package com.designPatterns.encapusulation;

class Account {
    private float balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    float getBalance() {
        return balance;
    }
}

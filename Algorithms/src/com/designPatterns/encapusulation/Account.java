package com.designPatterns.encapusulation;

class Account {
    private float balance;

    void deposit(int amount) {
        if (amount > 0)
            balance += amount;
    }

    void withdraw(int amount) {
        if (amount > 0)
            balance -= amount;
    }

    float getBalance() {
        return balance;
    }
}

package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionAmounts;

    private Customer(String name) {
        this.name = name;
        transactionAmounts = new ArrayList<>();
    }

    public Customer createCustomer(String name) {
        return new Customer(name);
    }

    public void addTransaction(double transactionAmount) {
        transactionAmounts.add(transactionAmount);
    }
}

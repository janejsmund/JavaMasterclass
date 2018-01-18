package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private Customer customer;
    private String name;

    public String getName() {
        return name;
    }

    private Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public Branch createBranch(String name) {
        return new Branch(name);
    }

    public void addCustomer(String name) {
        customers.add(customer.createCustomer(name));
    }

    public int findCustomer(String name) {
//        int position = customers.indexOf()
        return 0;
    }

}

package at.stderr.BankingChallange;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>(List.of(transaction));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTrancactions() {
        return transactions;
    }

    public void addTransaction(Double transaction) {
        this.transactions.add(transaction)
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (!(other instanceof Customer)
            return false;

        Customer otherCustomer = (Customer) other;

        return this.name.equals(otherCustomer.getName());
    }
}

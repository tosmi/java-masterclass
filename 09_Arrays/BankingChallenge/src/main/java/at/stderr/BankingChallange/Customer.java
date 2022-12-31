package at.stderr.BankingChallange;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>(List.of(transaction));
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double transaction) {
        this.transactions.add(transaction);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (this.getClass() != otherObject.getClass())
            return false;

        Customer other = (Customer) otherObject;
        return Objects.equals(this.getName(), other.getName());
    }
}

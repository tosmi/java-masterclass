package at.stderr.BankingChallange;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer> ();
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null ) return false;

        Customer c = new Customer(name, initialTransaction);
        customers.add(c);

        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        var customer = findCustomer(name);
        if (customer == null) return false;

        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
//        return customers.stream()
//                .filter(c -> c.getName().equals(name))
//                .findFirst()
//                .orElse(null);

        for (Customer c : customers) {
            if (name.equals(c.getName())) return c;
        }

        return null;
    }
}

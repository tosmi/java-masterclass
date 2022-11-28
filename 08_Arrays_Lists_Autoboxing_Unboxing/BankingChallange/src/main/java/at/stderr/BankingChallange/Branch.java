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

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double initialTransaction) {

    }

    public boolean addCustomerTransaction(String name, double transaction) {
        customer = findCustomer(name);
        customer.()
    }

    public Customer findCustomer(String name) {

    }

}

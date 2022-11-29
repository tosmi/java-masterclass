package at.stderr.BankingChallange;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) != null) return false;

        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        var branch = findBranch(branchName);

        if (branch == null) return false;

        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        var branch = findBranch(branchName);

        if (branch == null) return false;

        return branch.addCustomerTransaction(customerName, transaction);
    }

    public Branch findBranch(String branchName) {
        return branches.stream()
                .filter(b -> b.getName().equals(branchName))
                .findFirst()
                .orElse(null);
    }

    public boolean listCustomers(String branchName, boolean printTransactions )
    {
        var branch = findBranch(branchName);

        if (branch == null) return false;

        System.out.println("Customer details for branch " + branch.getName());
        for (int i = 0; i < branch.getCustomers().size(); i++) {
            var c = branch.getCustomers().get(i);
            System.out.println("Customer: " + c.getName() + "[" + (i+1) + "]");
            if (printTransactions) {
                System.out.println("Transactions");
                for (int n = 0; n < c.getTransactions().size(); n++) {
                    var t = c.getTransactions().get(n);
                    System.out.println("[" + (n+1) + "]  Amount " + t.doubleValue() );
                }
            }
        }
        return true;
    }
}

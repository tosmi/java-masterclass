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
        if(findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
        }
    }
}

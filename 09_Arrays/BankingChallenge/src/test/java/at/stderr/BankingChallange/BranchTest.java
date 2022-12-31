package at.stderr.BankingChallange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchTest {

    @Test
    void newCustomer() {
        Branch b = new Branch("Test");
        assertTrue(b.newCustomer("Max Mustermann", 0.0));
        assertFalse(b.newCustomer("Max Mustermann", 0.0));
    }

    @Test
    void addCustomerTransaction() {
        Branch b = new Branch("Test");
        assertTrue(b.newCustomer("Max Mustermann", 0.0));
        assertTrue(b.addCustomerTransaction("Max Mustermann", 1.0));
    }

    @Test
    void findCustomer() {
        Branch b = new Branch("Test");
        assertTrue(b.newCustomer("Max Mustermann", 0.0));
    }
}
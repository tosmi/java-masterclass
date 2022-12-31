package at.stderr.BankingChallange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void addTransaction() {
        Customer c = new Customer("Max", 0.0);
        c.addTransaction(1.0);

        assertEquals(0.0, c.getTransactions().get(0));
        assertEquals(1.0, c.getTransactions().get(1));
    }

    @Test
    void testEquals() {
    }
}
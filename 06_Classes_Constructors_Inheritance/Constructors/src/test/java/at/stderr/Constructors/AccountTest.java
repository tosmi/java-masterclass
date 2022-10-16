package at.stderr.Constructors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void depositFunds() {
        Account a = new Account("1234",100.0, "Max Mustermann", "max@mustermann.com", "+43 1214" );

        assertAll(
                () -> assertEquals(150.0, a.depositFunds(50.0)),
                () -> assertEquals(170.0, a.depositFunds(20.0))
             );
    }

    @Test
    void withdrawFunds() {
        Account a = new Account("1234",100.0, "Max Mustermann", "max@mustermann.com", "+43 1214" );

        assertAll(
                () -> assertEquals(-1.0, a.withdrawFunds(150.0)),
                () -> assertEquals(50.0, a.withdrawFunds(50.0))
        );


    }
}
package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPrimeTest {

    @Test
    public void shouldReturnLargestPrime() {
        assertEquals(5, LargestPrime.getLargestPrime(10));
        assertEquals(31, LargestPrime.getLargestPrime(217));
        assertEquals(-1, LargestPrime.getLargestPrime(0));
        assertEquals(5, LargestPrime.getLargestPrime(45));
        assertEquals(-1, LargestPrime.getLargestPrime(-1));
        assertEquals(2, LargestPrime.getLargestPrime(16));
    }
}

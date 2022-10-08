package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenDigitSumTest {

    @Test
    public void shouldReturnEvenDigitSum() {
        assertEquals(6, EvenDigitSum.getEvenDigitSum(1234));
        assertEquals(-1, EvenDigitSum.getEvenDigitSum(-1234));
    }
}

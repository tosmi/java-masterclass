package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstLastDigitSumTest {

    @Test
    public void shouldSumDigits() {
        assertEquals(FirstLastDigitSum.sumFirstAndLastDigit(123), 4);
        assertEquals(FirstLastDigitSum.sumFirstAndLastDigit(-123), -1);
        assertEquals(FirstLastDigitSum.sumFirstAndLastDigit(0), 0);
    }
}

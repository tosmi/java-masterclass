package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LastDigitCheckerTest {
    @Test
    public void shouldCheckLastDigit() {
        assertFalse(LastDigitChecker.hasSameLastDigit(1,11,12));
        assertFalse(LastDigitChecker.hasSameLastDigit(11,1,12));
        assertFalse(LastDigitChecker.hasSameLastDigit(11,12,1));
        assertFalse(LastDigitChecker.hasSameLastDigit(1001,12,13));
        assertFalse(LastDigitChecker.hasSameLastDigit(11,1002,13));
        assertFalse(LastDigitChecker.hasSameLastDigit(11,12,1003));
        assertFalse(LastDigitChecker.hasSameLastDigit(9,99,9999));

        assertFalse(LastDigitChecker.hasSameLastDigit(23,41,42));


        assertTrue(LastDigitChecker.hasSameLastDigit(41,22,71));
        assertTrue(LastDigitChecker.hasSameLastDigit(23,32,42));
    }

    @Test
    public void shouldReturnValidOrInvalid() {
        assertTrue(LastDigitChecker.isValid(10));
        assertTrue(LastDigitChecker.isValid(1000));
    }
}

package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToWordsTest {
    @Test
    public void shouldReverseNumber() {
        assertEquals(321, NumberToWords.reverseNumber(123));
        assertEquals(-2, NumberToWords.reverseNumber(-2));
        assertEquals(-121, NumberToWords.reverseNumber(-121));
    }

    @Test
    public void shouldReturnNumberOfDigits() {
        assertEquals(3, NumberToWords.getDigitCount(123));
        assertEquals(1, NumberToWords.getDigitCount(0));
        assertEquals(-1, NumberToWords.getDigitCount(-222));
    }
}

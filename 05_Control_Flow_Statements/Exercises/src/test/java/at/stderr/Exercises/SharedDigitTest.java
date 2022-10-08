package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SharedDigitTest {
    @Test
    public void shouldReturnResult() {
        assertFalse(SharedDigit.hasSharedDigit(9,19));
        assertFalse(SharedDigit.hasSharedDigit(19,100));
        assertFalse(SharedDigit.hasSharedDigit(12,43));
        assertTrue(SharedDigit.hasSharedDigit(12,13));
        assertTrue(SharedDigit.hasSharedDigit(19,99));

    }
}

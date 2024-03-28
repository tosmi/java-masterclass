package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumberTest {
    @Test
    public void shouldTellPerfectNumber() {
        assertTrue(PerfectNumber.isPerfectNumber(6));
        assertTrue(PerfectNumber.isPerfectNumber(28));
        assertFalse(PerfectNumber.isPerfectNumber(5));
        assertFalse(PerfectNumber.isPerfectNumber(-1));
    }
}

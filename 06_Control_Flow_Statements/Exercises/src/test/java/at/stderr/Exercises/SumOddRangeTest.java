package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOddRangeTest {

    @Test
    public void shouldBeOdd() {
        assertTrue(SumOddRange.isOdd(1));
        assertTrue(SumOddRange.isOdd(7));
    }

    @Test
    public void shouldNotBeOdd() {
        assertFalse(SumOddRange.isOdd(2));
        assertFalse(SumOddRange.isOdd(-1));
    }

    @Test
    public void shouldSumOdd() {
        assertEquals(SumOddRange.sumOdd(2,10) ,24);
    }
}

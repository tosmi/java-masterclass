package at.stderr.WhileAndDoWhile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitsTest {

    @Test
    public void shouldReturnValidSum() {
        assertEquals(SumDigits.sumDigits(12345), 15);
    }

    @Test
    public void shouldReturnNegativeOne() {
        assertEquals(SumDigits.sumDigits(9), -1);
        assertEquals(SumDigits.sumDigits(-1), -1);
    }
}

package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberOfDaysInMonthTest {

    @Test
    public void shouldBeALeapYear() {
        assertTrue(NumberOfDaysInMonth.isLeapYear(1600));
        assertTrue(NumberOfDaysInMonth.isLeapYear(2000));

    }

    @Test
    public void shouldNotBeALeapYear() {
        assertFalse(NumberOfDaysInMonth.isLeapYear(2017));
        assertFalse(NumberOfDaysInMonth.isLeapYear(9000));
    }

    @Test
    public void shouldEqualNumberOfDaysInMonth() {
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(1,2020), 31);
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(2,2020), 29);
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(8,2020), 31);
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(2,2018), 28);
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(-1,2020), -1);
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(1,-2020), -1);
    }
}

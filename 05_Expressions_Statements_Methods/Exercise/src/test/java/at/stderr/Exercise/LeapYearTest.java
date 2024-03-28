package at.stderr.Exercise;

import org.junit.jupiter.api.Test;

import static at.stderr.Exercise.LeapYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void shouldBeALeapYear() {
        assertTrue(isLeapYear(1600));
        assertTrue(isLeapYear(2000));
        assertTrue(isLeapYear(2400));
    }

    @Test
    public void shouldNotBeALeapYear() {
        assertFalse(isLeapYear(0));
        assertFalse(isLeapYear(-10));
        assertFalse(isLeapYear(10000));

        assertFalse(isLeapYear(1700));
        assertFalse(isLeapYear(1800));
        assertFalse(isLeapYear(1900));
        assertFalse(isLeapYear(2100));
        assertFalse(isLeapYear(2200));
        assertFalse(isLeapYear(2300));
        assertFalse(isLeapYear(2500));
        assertFalse(isLeapYear(2600));
    }

}
